package GUI;
import javax.swing.*;
import java.sql.*;
public class Insert_Student extends JFrame {

		// JFrame frame  = new JFrame("insert window");
		public Insert_Student() {
			// JFrame frame1  = new JFrame("insert window");
			setTitle("Inserting ");
			setSize(400,300);
			setLayout(null);
			// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	JLabel lab = new JLabel("Enter s_id");
	    	lab.setBounds(20,50, 150, 30);
	    	add(lab);
	    	 JTextField txt = new JTextField();
	 	    txt.setBounds(110, 50, 100, 30);
	         add(txt);
	         // setVisible(true);
	         setVisible(true);
	         //---------------------
	         JLabel lab1 = new JLabel("Enter name");
		    	lab1.setBounds(20, 90, 150, 30);
		    	add(lab1);
		    	 JTextField txt1 = new JTextField();
		 	    txt1.setBounds(110, 90, 100, 30);
		         add(txt1);
		         JLabel lab2 = new JLabel("Enter class");
			    	lab2.setBounds(20, 130, 150, 30);
			    	add(lab2);
			    	 JTextField txt2 = new JTextField();
			 	    txt2.setBounds(110, 130, 100, 30);
			         add(txt2);
			         JLabel lab4 = new JLabel("Enter specialisation");
				    	lab4.setBounds(20,170, 150, 30);
				    	add(lab4);
				    	 JTextField txt3 = new JTextField();
				 	    txt3.setBounds(110, 170, 100, 30);
				         add(txt3);
				         JButton but2 = new JButton("insert");
				         but2.setBounds(130,210,100,30);
				         add(but2);
				         but2.addActionListener(e -> {
				             // User input ko retrieve karein
				             String url = "jdbc:mysql://localhost:3306/test1";
				             String user = "root";
				             String password = "Abhi@2001";
				            
				             try {
				                 Connection con = DriverManager.getConnection(url, user, password);
				                 String userName = txt.getText();
				                 int num = Integer.parseInt(txt.getText());
				                 int s_class = Integer.parseInt(txt2.getText());
				                 String query = "insert into student(s_id,name,s_class,special)values (?,?,?,?)";
				                 PreparedStatement pst = con.prepareStatement(query);
				                 int s_id = Integer.parseInt(txt.getText());
				                 pst.setInt(1,s_id);
				                 pst.setString(2,txt1.getText());
				                 pst.setInt(3,s_class);
				                 pst.setString(4,txt3.getText());
				                int i = pst.executeUpdate();
//				            
				            	   if(i>0) {
					                	JOptionPane.showMessageDialog(this,"inserted done ");
					                						                }
				             }
				             catch(Exception E ) {  
				                	JOptionPane.showMessageDialog(this,"inserted fail");
				             } 
				         });
				         JButton but3 = new JButton("View all");
				         but3.setBounds(150,220,100,50);
				         add(but3);
				         but3.addActionListener(e->{
				        	 new fetching();
				        	 
				         });
		}
}


