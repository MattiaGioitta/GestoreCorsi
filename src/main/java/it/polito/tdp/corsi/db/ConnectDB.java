package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectDB {
	
	private static final String jdbcurl="jdbc:mysql://localhost/iscritticorsi";
	private static HikariDataSource ds;
	
	public static Connection getConnection() {
		if(ds==null) {
			HikariConfig config = new HikariConfig();
			config.setJdbcUrl(jdbcurl);
			config.setUsername("root");
			config.setPassword("root");
			
			config.addDataSourceProperty("cachePrepStmts",true);
			config.addDataSourceProperty("prepStmtCacheSize", 250);
			config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
			
			ds = new HikariDataSource(config);
			}
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Errore di connessione al db");
			throw new RuntimeException(e);
		}
	}
	

}
