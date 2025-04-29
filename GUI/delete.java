package GUI;
import java.sql.*;
import javax.swing.*;
public class delete extends JFrame {
  
	public delete() {
		JFrame f1 = new JFrame("Delete");
		
	        f1.setSize(400, 300);
	        f1.setLayout(null);
	     //   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JLabel lab = new JLabel("Enter id to delete");
	        lab.setBounds(70, 50, 100, 30);
	        f1.add(lab);
	        JTextField txt = new JTextField();
	        txt.setBounds(160, 50, 100, 30);
	        f1.add(txt);
	        JButton but = new JButton("Delete");
	        but.setBounds(100, 190,100,50);
	        f1.add(but);
	        but.addActionListener(e->{
	        	 String url = "jdbc:mysql://localhost:3306/test1";
	             String user = "root";
	             String password = "Abhi@2001";
	             try {
					Connection con = DriverManager.getConnection(url,user,password);
					String query ="delete from student where s_id = ?";
					PreparedStatement pst = con.prepareStatement(query);
					int i = Integer.parseInt(txt.getText());
					pst.setInt(1, i);
					int c = pst.executeUpdate();
					  if(c>0) {
		                	JOptionPane.showMessageDialog(this,"deleted done ");
		                						                }
	             
	             else {
	            	 JOptionPane.showMessageDialog(this,"Not Deleted due to wrong input ");
	             }
	             }
					
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	             catch (NumberFormatException ex) {
	                 JOptionPane.showMessageDialog(this, "please enter the valid details ");
	             }
	        });
	       
	        f1.setVisible(true);
	}
	
}
