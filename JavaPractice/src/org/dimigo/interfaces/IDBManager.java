package org.dimigo.interfaces;

public interface IDBManager {

	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	public void insert();
	public void search();
	public void update();
	public void delete();
	
	public static IDBManager getDBObject(String database){
		if(database.equals(ORACLE_DATABASE)){
			return new OracleDB();
		} else if(database.equals(SYBASE_DATABASE)){
			return new SybaseDB();
		}
		return null;
	}
	
}
