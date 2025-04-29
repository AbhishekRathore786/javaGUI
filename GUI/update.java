package GUI;

import java.sql.*;
import javax.swing.*;
public class update extends JFrame {

		public update() {
			setTitle("Update");
			setSize(300,500);
			setLayout(null);
			JLabel lab = new JLabel("enter id");
			lab.setBounds(100,150,100,50);
			add(lab);
			JTextField idtxt = new JTextField();
			idtxt.setBounds(100,220,100, 50);
			add(idtxt);
			
			JButton update  = new JButton("search");
			update.setBounds(100,480,100,50);
			add(update);
			update.addActionListener(e->{
				 String url = "jdbc:mysql://localhost:3306/test1";
		            String user = "root";
		            String password = "Abhi@2001";
		            try {
		            	Connection con = DriverManager.getConnection(url,user,password);
		            	String query ="select * from student where s_id=?";
		            	PreparedStatement pst =con.prepareStatement(query);
		            	int num = Integer.parseInt(idtxt.getText());
		            	pst.setInt(1,num);
		            	ResultSet rs = pst.executeQuery();
		            	boolean flag=false;
		            	JTextField txt = new JTextField();
		            	txt.setBounds(100,250,100,50);
		            	add(txt);
		            	JTextField txt1 = new JTextField();
		            	txt1.setBounds(100,280,100,50);
		            	add(txt1);
		            	JTextField txt2 = new JTextField();
		            	txt2.setBounds(100,330,100,50);
		            	add(txt2);
		            	JTextField txt3 = new JTextField();
		            	txt3.setBounds(100,380,100,50);
		            	add(txt3);
		            	String name,special;
		          	while(rs.next()) {
		            		flag=true;
		            		int id = rs.getInt("s_id");
		            		txt.setText(String.valueOf(id));
		            		 name = rs.getString("name");
		            		txt1.setText(name);
		            		int s_clas = rs.getInt("s_class");
		            		txt2.setText(String.valueOf(s_clas));
		            		 special = rs.getString("special");
		            		txt3.setText(special);
		            		
		            	}
		            	//
		            	JButton upd = new JButton("update now");
		            	upd.setBounds(100,390, 100,50);
		            	add(upd);
		            	  upd.addActionListener(t -> {
					             // User input ko retrieve karein
					             String url1 = "jdbc:mysql://localhost:3306/test1";
					             String user1 = "root";
					             String password1 = "Abhi@2001";
					            
					             try {
					                 Connection con1 = DriverManager.getConnection(url, user, password);
					                 String userName = txt.getText();
					               //   int num1 = Integer.parseInt(txt.getText());
					               //  int s_class1 = Integer.parseInt(txt2.getText());
//					                 String query1 = "insert into student(s_id,name,s_class,special)values (?,?,?,?)";
//					                 String query1 ="update student set s_id =? , set name=? , set class=?, set special=? where s_id ='"+num+"'";
					                 String query1="update student set s_id=?,name=?,s_class=?,special=? where s_id= ? ";
					                 PreparedStatement pst1 = con.prepareStatement(query1);
					                 int s_id = Integer.parseInt(txt.getText());
					                 pst1.setInt(1,s_id);
					                 pst1.setString(2,txt1.getText());
					                 pst1.setInt(3, Integer.parseInt(txt2.getText()));
					                 pst1.setString(4,txt3.getText());
					                 pst1.setInt(5, Integer.parseInt(idtxt.getText()));
					                int i = pst1.executeUpdate();
//					            
					            	   if(i>0) {
						                	JOptionPane.showMessageDialog(this,"inserted done ");
						                						                }
					             }
					             catch(Exception E ) {  
					                	JOptionPane.showMessageDialog(this,"inserted fail"+E );
					             } 
					         });
		            	
		            	
		            	//
		            	if(flag==true) {
		            		JLabel lab1 = new JLabel("Enter name");
		    		    	lab1.setBounds(100,250,100,50);
		    		    	add(lab1);
		    		    	
		    		    	// txt
		    		    	JLabel lab2 = new JLabel("Enter class");
					    	lab2.setBounds(100,280,100,50);
					    	add(lab2);
					    	//txt
					    	 JLabel lab3 = new JLabel("Enter specialisation");
						    	lab3.setBounds(100,330, 100,50);
						    	add(lab3);
						    // txt
						    	 JLabel lab4 = new JLabel("Enter specialisation");
							    	lab4.setBounds(100,380, 100,50);
							    	add(lab4);
		            	}
		            	
		            	
		            }
		            catch(Exception ee) {
		            	System.out.println(ee+ "Error occured");
		            }
			});
			setVisible(true);
		}
		
		
		
}