package org.hello.hbase;

import com.google.protobuf.ServiceException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.List;


public class HelloHBase {
	private final TableName emp = TableName.valueOf("emp");
	private final String family1 = "personal data";
	private final String family2 = "professional data";
	private final byte[] row1 = Bytes.toBytes("1");
	private final byte[] row2 = Bytes.toBytes("2");
	private final byte[] name = Bytes.toBytes("name");
	private final byte[] city = Bytes.toBytes("city");
	
	public static void main(String[] args) throws IOException, ServiceException{
		HelloHBase helloHBase = new HelloHBase();
		Configuration config = helloHBase.connet();
		helloHBase.run(config);
	
	}
	private Configuration connet() throws IOException, ServiceException{
		Configuration config = HBaseConfiguration.create();
		String path = this.getClass()
				  .getClassLoader()
				  .getResource("hbase-site.xml")
				  .getPath();
		config.addResource(new Path(path));
		try {
			HBaseAdmin.checkHBaseAvailable(config);
		}catch(MasterNotRunningException e ){
			System.out.println("HBase is not running." + e.getMessage());
			return null;
		}
		return config;
	}
	
	@SuppressWarnings("deprecation")
	private void run(Configuration  config) throws IOException{
		Table table = null;
		try (Connection connection = ConnectionFactory.createConnection(config)){
			table = connection.getTable(emp);
			HColumnDescriptor[]  columnDescs = table.getTableDescriptor().getColumnFamilies();
			for (HColumnDescriptor columnDesc :columnDescs) {
				System.out.println(columnDesc.getNameAsString());
			}
				
			Get g = new Get(row1);
			Result r = table.get(g);

			byte[] value1 = r.getValue(family1.getBytes(), name);
			byte[] value2 = r.getValue(family1.getBytes(), city);
			String v1 = new String(value1);
			String v2 = new String(value2);
			System.out.println("Name: " + v1);
			System.out.println("City: " + v2);
			
			System.out.println("Table: " + table.toString());
			Scan s = new Scan();
			s.addFamily(family1.getBytes());
			s.addFamily(family2.getBytes());
			ResultScanner results = table.getScanner(s);
			
			for(Result result : results){
				List<Cell> listCells = result.listCells();
				System.out.println(new String(result.getRow()));
				
				for(Cell cell : listCells){
					System.out.println(new String(cell.getFamily()) + " " + new String(cell.getQualifier()) + "=" + new String(cell.getValue()));
				}
			}
		}finally {
			table.close();
		}
	}
}
