package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class fetchteache {

	
	public fetchteache() {
		 JFrame f1 = new JFrame("MySQL Data in JTable");
	    // f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     f1.setSize(600, 400);
	     String[] columnNames = {"t_id", "t_name", "expert"}; // Example columns
	        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
	        JTable table = new JTable(model);
	        String url = "jdbc:mysql://localhost:3306/test1";
           String user = "root";
           String password = "Abhi@2001";
	        try {
	        	Connection con = DriverManager.getConnection(url,user,password);
	        	String query ="select * from teacher";
	        	PreparedStatement pst = con.prepareStatement(query);
	        	ResultSet rs = pst.executeQuery();
	        	while(rs.next()) {
	        		int id =rs.getInt("t_id");
	        		String name=rs.getString("t_name");
	        		//int s_class=rs.getInt("s_class");
	        	    String special=rs.getString("expert");
	        	    model.addRow(new Object[]{id,name,special});
	        	    // model.addRow(new Object[]{id, name, age});	
	        	}
	        }
	        catch(Exception E ) {
	        	System.out.println("Error Occured");
	        }
	        JScrollPane scrollPane = new JScrollPane(table);
	        f1.add(scrollPane);
	        f1.setVisible(true);
	        
	}
}
