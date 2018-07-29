package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private final String database = "record";
	private static DBConnection instance;
	private static Connection con;

	private DBConnection()
	{
		try {
			if(con == null || con.isClosed())

				Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:" + database + ".db");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static synchronized DBConnection getInstance()
	{
		try {
			if(instance == null || con.isClosed())
				instance = new DBConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return instance;
	}
}
