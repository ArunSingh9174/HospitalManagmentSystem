package com.DBService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

import org.apache.catalina.User;

import com.DTO.user;
import com.DTO.showapo;

public class DBService {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static boolean registration(user u) {
		boolean res=false;
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=Arun@9174");
        PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?,?,?)");			
		ps.setString(1,u.getName());
		ps.setString(2,u.getPassword());
		ps.setString(3,u.getContect());
		ps.setString(4,u.getEmail());
		ps.setString(5,u.getAddress());
		ps.setString(6,u.getState());
		ps.setString(7,u.getCountry());
		int x=ps.executeUpdate();
		if(x>=0) {
			res=true;
		}
	
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return res;
	}

	public static boolean login(String email, String password) {
		boolean res=false;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=Arun@9174");
			PreparedStatement ps =con.prepareStatement("select * from user where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();
			if(rs.next()) {
				res=true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		return res;
	}

	public static boolean docapp(String dr, String ti, String email) {
	 boolean res=false;
	 try {
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=Arun@9174");
	     PreparedStatement ps = con.prepareStatement("insert into doctorapp values(?,?,?)");			
			ps.setString(1, dr);
			ps.setString(2, ti);
			ps.setString(3, email);
			int x = ps.executeUpdate();
			if(res) {
				res=true;
			}
	} catch (Exception e) {
	System.out.println(e);
	}
	 
		return res;
	}

	public static boolean delete(String email) {
		
		boolean res=false;
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=Arun@9174");
		     PreparedStatement ps = con.prepareStatement("delete from user where email=?");
		     ps.setString(1, email);

		  int x= ps.executeUpdate();
		     if(x>=0) {
					res=true;
				}
		     
		} catch (Exception e) {
			
			System.out.println(e);
		}
		return res;
	}

	public static Vector getall() {
		Vector v1=new Vector();


		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=Arun@9174");
			PreparedStatement ps = con.prepareStatement("select * from user");
			ResultSet rs = ps.executeQuery();


			while (rs.next()) {
				user u = new user();

				u.setName(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setContect(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setAddress(rs.getString(5));
				u.setState(rs.getString(6));
				u.setCountry(rs.getString(7));



				v1.add(u);


			}



	}catch(Exception e) {
		System.out.print("Error in SQL");
	}
		return v1;
	}

	
	//show apo
	
	
	public static Vector showapo() {
		
		
		Vector v1=new Vector();


		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=Arun@9174");
			PreparedStatement ps = con.prepareStatement("select * from doctorapp");
			ResultSet rs = ps.executeQuery();


			while (rs.next()) {
				showapo u = new showapo();

				u.setDoctorName(rs.getString(1));
				u.setTime(rs.getString(2));
				u.setUser(rs.getString(3));
			
				v1.add(u);
			}

	}catch(Exception e) {
		System.out.print("Error in SQL");
	}
		return v1;

		}
	
}
