package GUI;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class fetching {
	public fetching() {
		 JFrame f1 = new JFrame("MySQL Data in JTable");
	    // f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     f1.setSize(600, 400);
	     String[] columnNames = {"s_id", "name", "s_class","special"}; // Example columns
	        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
	        JTable table = new JTable(model);
	        String url = "jdbc:mysql://localhost:3306/test1";
            String user = "root";
            String password = "Abhi@2001";
	        try {
	        	Connection con = DriverManager.getConnection(url,user,password);
	        	String query ="select * from student";
	        	PreparedStatement pst = con.prepareStatement(query);
	        	ResultSet rs = pst.executeQuery();
	        	while(rs.next()) {
	        		int id =rs.getInt("s_id");
	        		String name=rs.getString("name");
	        		int s_class=rs.getInt("s_class");
	        	    String special=rs.getString("special");
	        	    model.addRow(new Object[]{id,name,s_class,special});
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
