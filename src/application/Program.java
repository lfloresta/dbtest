package application;

import java.sql.Connection;

import db.DB;
import model.entities.Table;

public class Program {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		DB.closeConnection();
		
		Table obj = new Table(1, "teste");
		System.out.println(obj);
		
	}

}
