package org.hello.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;


public class HelloHBase {
	public static void main(String[] args) throws IOException{
		Configuration  config = HBaseConfiguration.create();
		config.set("hbase.master", "192.168.6.133:46279");
		HTable hTable = new HTable(config, "emp");
		Get g = new Get(Bytes.toBytes("row1"));
		Result result = hTable.get(g);
		
		byte[] name = result.getValue(Bytes.toBytes("personal data"), Bytes.toBytes("name"));
		byte[] city = result.getValue(Bytes.toBytes("personal data"), Bytes.toBytes("city"));
		System.out.println(Bytes.toString(name));
		System.out.println(Bytes.toString(city));
		
		
		
	}
}
