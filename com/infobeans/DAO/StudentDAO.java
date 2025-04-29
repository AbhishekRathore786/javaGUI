package com.infobeans.DAO;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;

//import com.infobeans.model.Student;
//import com.infobeans.service.*;
public class StudentDAO {
			
	String url = "jdbc:mysql://localhost:3306/test1";
    String user = "root";
    String password = "Abhi@2001";
    private Connection getCon() throws SQLException  {
    	 return DriverManager.getConnection(url, user, password);
    	
	    //    JScrollPane scrollPane = new JScrollPane(table);
	      //  f1.add(scrollPane);
	     //   f1.setVisible(true);
    }
    
  
    }

