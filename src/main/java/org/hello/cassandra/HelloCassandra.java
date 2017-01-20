/**
 * 
 */
package org.hello.cassandra;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;


/**
 * @author Sathish Kumar Parthasarathy
 *
 * Dec 26, 2016 6:52:00 PM
 * 
 *  listen_address: 192.168.44.128:9042
 *  
 *  rpc_address: 192.168.44.128:9160
 *
 *  CREATE TABLE emp( emp_id INT PRIMARY KEY, emp_name TEXT, emp_city TEXT, emp_sal VARINT, emp_phone VARINT);
 *
 */

public class HelloCassandra {
	public static void main(String[] args){
		Cluster cluster = null;
		Session session = null;
		String node = "192.168.44.128";
		int port = 9042;
		String cql = "SELECT * FROM emp";
		String keyspace ="helloworld";
		
		cluster = Cluster.builder().addContactPoint(node).withPort(port).build();
		
		final Metadata metadata = cluster.getMetadata();
		System.out.println("Conneted to Cluster : " + metadata.getClusterName());
		for (final Host host: metadata.getAllHosts()){
			System.out.printf("Datacenter : %s; Host: %s; Rack : %s;\n", host.getDatacenter(), host.getAddress(), host.getRack());
		}
		
		session = cluster.connect(keyspace);
		ResultSet resultSet = session.execute(cql);
		Iterator<Row> iterators = resultSet.iterator();
		Row row = null;
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = null;
		while (iterators.hasNext()){
			row = iterators.next();
			employee = new Employee();
			employee.setEmp_id(row.getInt("emp_id"));
			employee.setEmp_name(row.getString("emp_name"));
			employee.setEmp_city(row.getString("emp_city"));
			employee.setEmp_phone(row.getVarint("emp_phone"));
			employee.setEmp_sal(row.getVarint("emp_sal"));
			employees.add(employee);
		}
		for (Employee emp : employees){
			System.out.println(emp.toString());
		}
		cluster.close();
	}
}
