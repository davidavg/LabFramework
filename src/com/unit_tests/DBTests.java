package com.unit_tests;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.general.DBUtil;

class DBTests {
	
	DBUtil db = new DBUtil();
	
	@Test
	public void testConnection01() {
		Connection connection = db.DBconnect();
		try {
			connection.close();
			assertTrue(true);
		} catch (SQLException e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testConection02() {
		Connection connection = db.DBconnect();
		try {
			connection.getClientInfo();
			assertTrue(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
		db.DBCloseConnection(connection);
	}
	
	@Test
	public void succesfull_read01() {
		Connection connection = db.DBconnect();
		ResultSet resultSet = db.read(connection, "select * from test");	
		ResultSetMetaData rsmd;
		int columnsNumber = 0;
		try {
			rsmd = resultSet.getMetaData();
			columnsNumber = rsmd.getColumnCount();
			while (resultSet.next()) {
			    for (int i = 1; i <= columnsNumber; i++) {
			        if (i > 1) System.out.print(",  ");
			        String columnValue = resultSet.getString(i);
			        System.out.print(columnValue + " " + rsmd.getColumnName(i));
			    }
			    System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			assertTrue(false);
		}
		db.DBCloseConnection(connection);
		
		assertTrue(columnsNumber>0);
	}
	
	@Test
	public void succesfull_update() {
		Connection connection = db.DBconnect();
		assertTrue(db.modify(connection, "update test set Nombre = 'updated' where reg = 5"));	
		db.DBCloseConnection(connection);
	}
	
	@Test
	public void succesfull_insert() {
		Connection connection = db.DBconnect();
		assertTrue(db.modify(connection, "insert into  test(Nombre, Descripcion) values ('New insert', 'Testing!')"));	
		db.DBCloseConnection(connection);
	}
	
	@Test
	public void succesfull_delete() {
		Connection connection = db.DBconnect();
		assertTrue(db.modify(connection, "delete from test where  Nombre ='New insert'"));	
		db.DBCloseConnection(connection);
	}
	
	@Test
	public void incorrectQuery01() {
		Connection connection = db.DBconnect();
		ResultSet resultSet = db.read(connection, "x");	
		ResultSetMetaData rsmd;
		try {
			rsmd = resultSet.getMetaData();
			assertFalse(rsmd.getColumnCount()>0);
		} catch (SQLException e) {
			e.printStackTrace();
			assertTrue(true);
		}catch(NullPointerException e) {
			e.printStackTrace();
			assertTrue(true);
		}
		db.DBCloseConnection(connection);
	}
	
	@Test
	public void incorrectQuery02() {
		Connection connection = db.DBconnect();
		assertFalse(db.modify(connection, "x"));			
		db.DBCloseConnection(connection);
	}

}
