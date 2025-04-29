package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class feeInsert extends JFrame {
	public feeInsert(){
		JFrame f1  = new JFrame("insert window");
		//setTitle("Inserting ");
		f1.setSize(400,300);
		f1.setLayout(null);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	JLabel lab = new JLabel("Enter f_id");
    	lab.setBounds(20,50, 150, 30);
    	f1.add(lab);
    	 JTextField txt = new JTextField();
 	    txt.setBounds(110, 50, 100, 30);
 	   f1.add(txt);
         // setVisible(true);
 	  f1.setVisible(true);
         //---------------------
         JLabel lab1 = new JLabel("Enter s_id");
	    	lab1.setBounds(20, 90, 150, 30);
	    	f1.add(lab1);
	    	 JTextField txt1 = new JTextField();
	 	    txt1.setBounds(110, 90, 100, 30);
	 	   f1.add(txt1);
	         JLabel lab2 = new JLabel("Enter amount");
		    	lab2.setBounds(20, 130, 150, 30);
		    	f1.add(lab2);
		    	 JTextField txt2 = new JTextField();
		 	    txt2.setBounds(110, 130, 100, 30);
		 	   f1.add(txt2);
		         
			         JButton but2 = new JButton("insert");
			         but2.setBounds(130,210,100,30);
			         f1.add(but2);
			         but2.addActionListener(e -> {
			             // User input ko retrieve karein
			             String url = "jdbc:mysql://localhost:3306/test1";
			             String user = "root";
			             String password = "Abhi@2001";
			            
			             try {
			                 Connection con = DriverManager.getConnection(url, user, password);
			               //  String userName = txt.getText();
			              //   int num = Integer.parseInt(txt.getText());
			                 int s_class = Integer.parseInt(txt2.getText());
			                 String query = "insert into fee(f_id,s_id,amount)values (?,?,?)";
			                 PreparedStatement pst = con.prepareStatement(query);
			                 int f_id = Integer.parseInt(txt.getText());
			                 int s_id = Integer.parseInt(txt1.getText());
			                 pst.setInt(1,f_id);
			                 pst.setInt(2,s_id);
			                 pst.setInt(3,s_class);
			               //  pst.setString(4,txt3.getText());
			                int i = pst.executeUpdate();
//			            
			            	   if(i>0) {
				                	JOptionPane.showMessageDialog(this," fees inserted  ");
				                						                }
			             }
			             catch(Exception E ) {  
			                	JOptionPane.showMessageDialog(this,"inserted fail"+E);
			             } 
			         });
//			         JButton but3 = new JButton("View all");
//			         but3.setBounds(150,220,100,50);
//			         add(but3);
//			         but3.addActionListener(e->{
//			        	 new fetching();
//			        	 
//			         });
}
}
