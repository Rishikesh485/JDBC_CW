package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.Student;
import com.jsp.helper.HelperClass;

public class StudentDao {
	HelperClass hc = new HelperClass();

	public Student saveStudent(Student s) {
		Connection c = hc.getConnection();
		String sql = "insert into student values(?,?,?)";
		try {
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getEmail());

			// execute statement
			ps.execute();

			// close connection
			c.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}
}
