package org.hello.hbase;

import com.google.protobuf.ServiceException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;

import java.io.IOException;
import java.util.List;

public class WorldHBase {
	private final TableName world = TableName.valueOf("world");
	private final String cityFamily = "city";
	private final String countryFamily = "country";
	private final String countryLanguageFamily = "countrylanguage";

	public static void main(String[] args) throws IOException, ServiceException{
		WorldHBase worldHBase = new WorldHBase();
		Configuration config = worldHBase.connet();
		worldHBase.scanCity(config);
		worldHBase.scanCountry(config);
		worldHBase.scanCountryLanguage(config);
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
	private void scanCity(Configuration  config) throws IOException{
		Table table = null;
		try (Connection connection = ConnectionFactory.createConnection(config)){
			table = connection.getTable(world);

			Scan cityScan = new Scan();
			cityScan.addFamily(cityFamily.getBytes());

			ResultScanner results = table.getScanner(cityScan);
			boolean firstRow = true;
			for(Result result : results){
				if (firstRow){
					List<Cell> listCells = result.listCells();
					System.out.print(new String("RowID")+ "\t\t");
					for(Cell cell : listCells){
						System.out.print(new String(cell.getQualifier()) + "\t\t");
					}
					System.out.println();
					firstRow = false;
				}
				System.out.print(new String(result.getRow())+ "\t\t");	
				List<Cell> listCells = result.listCells();
				for(Cell cell : listCells){
					System.out.print(new String(cell.getValue())+ "\t\t");
				}
				System.out.println();
			}
		}finally {
			table.close();
		}
	}
	@SuppressWarnings("deprecation")
	private void scanCountry(Configuration  config) throws IOException{
		Table table = null;
		try (Connection connection = ConnectionFactory.createConnection(config)){
			table = connection.getTable(world);

			Scan countryScan = new Scan();
			countryScan.addFamily(countryFamily.getBytes());

			ResultScanner results = table.getScanner(countryScan);
			boolean firstRow = true;
			for(Result result : results){
				if (firstRow){
					List<Cell> listCells = result.listCells();
					System.out.print(new String("RowID")+ "\t\t");					
					for(Cell cell : listCells){
						System.out.print(new String(cell.getQualifier()) + "\t\t");
					}
					System.out.println();
					firstRow = false;
				}
				System.out.print(new String(result.getRow())+ "\t\t");	
				List<Cell> listCells = result.listCells();
				for(Cell cell : listCells){
					System.out.print(new String(cell.getValue())+ "\t\t");
				}
				System.out.println();
			}
		}finally {
			table.close();
		}
	}
	@SuppressWarnings("deprecation")
	private void scanCountryLanguage(Configuration  config) throws IOException{
		Table table = null;
		try (Connection connection = ConnectionFactory.createConnection(config)){
			table = connection.getTable(world);

			Scan  countryLanguageScan = new Scan();
			countryLanguageScan.addFamily(countryLanguageFamily.getBytes());

			ResultScanner results = table.getScanner(countryLanguageScan);
			boolean firstRow = true;
			for(Result result : results){
				if (firstRow){
					List<Cell> listCells = result.listCells();
					System.out.print(new String("RowID")+ "\t\t");
					for(Cell cell : listCells){
						System.out.print(new String(cell.getQualifier()) + "\t");
					}
					System.out.println();
					firstRow = false;
				}
				System.out.print(new String(result.getRow())+ "\t\t");	
				List<Cell> listCells = result.listCells();
				for(Cell cell : listCells){
					System.out.print(new String(cell.getValue())+ "\t");
				}
				System.out.println();
			}
		}finally {
			table.close();
		}
	}
}
