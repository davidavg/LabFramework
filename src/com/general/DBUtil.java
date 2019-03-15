package com.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.Logger;

public class DBUtil {
	
	Logging logging = new Logging();
	Logger log = logging.initLogger(this.getClass().getName());
	
	public Connection DBconnect() {
		
		ConfigParams cp = new ConfigParams();
		
		try {
			Class.forName("org.postgresql.Driver");
			log.info("Connecting with DB");
			Connection DBConnection = DriverManager.getConnection(cp.getParam("dbUrl"),cp.getParam("dbUser"),cp.getParam("dbPswd"));
			log.info("Connection stablished");
			return DBConnection;
		} catch (SQLException e) {
			log.error("Fail while stablishing connection with the DB. " + e);
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e) {
			log.error("DB Java Driver not found. " + e);
			e.printStackTrace();
			return null;
		}
		
	}
	
	public void DBCloseConnection(Connection connection) {
		try {
			log.info("Closing DB connection.");
			connection.close();
			log.info("Connection closed.");
		} catch (SQLException e) {
			log.error("Fail to close Db connection. " + e);
			e.printStackTrace();
		}
	}
	
	public ResultSet read(Connection connection, String strQuery) {
		Statement statement;
		try {
			log.info("Executing SQL query " + strQuery);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(strQuery);
			log.info("Query executed correctly.");
			return resultSet;
		} catch (SQLException e) {
			log.error("Query failed to execute. " + e);
			e.printStackTrace();
			return null;
		}
		
	}

	public boolean modify(Connection connection, String strQuery) {
		Statement statement;
		try {
			log.info("Executing SQL query " + strQuery);
			statement = connection.createStatement();
			statement.executeUpdate(strQuery);
			log.info("Query executed correctly.");
			return true;
		} catch (SQLException e) {
			log.error("Query failed to execute. " + e);
			e.printStackTrace();
			return false;
		}
	}
	
}
