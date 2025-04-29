package GUI;
import java.awt.FlowLayout;

import javax.swing.*;
public class option extends JFrame{
 public option() {
	  JFrame f3 = new JFrame("Options available");
	 f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 f3.setLayout(new FlowLayout());
	// s setTitle("Option availabe");
	  f3.setSize(400,400);
	  f3.setVisible(true);
	 JButton but = new JButton("log in");
	// but.setBounds(150, 80,70,50);
	  f3.add(but);
	 but.setVisible(true);
	 but.addActionListener(e->{
		 new login();
		 dispose();
	
	
	 });
	 JButton but1=new JButton("Insert");
    // but1.setBounds(150, 150, 100, 50);
	 f3.add(but1);
    // but1.setVisible(true);
    but1.addActionListener(E->{
    	new Insert_Student();
    //	dispose();
    	}
        );
    
    JButton but2 = new JButton("view");
  //  but2.setBounds(150,210, 100,50);
    f3.add(but2);
    but2.setVisible(true);
    but2.addActionListener(e->{
    	new fetching();
    });
    JButton butDelete = new JButton("delete");
  //  butDelete.setBounds(150,250,100,50);
    f3.add(butDelete);
    butDelete.addActionListener(e->{
    	new delete();
    	dispose();
    });
   setLayout(null);
  setVisible(true);
 
  JButton updatebut = new JButton("update");
 // updatebut.setBounds(150,310,100,50);
  f3.add(updatebut);
  updatebut.addActionListener(e->{
  	new update();
  	dispose();
  });
 
  JButton insertBt = new JButton("insert teacher");
 // insertBt.setBounds(150,370,100,50);
  f3.add(insertBt);
  insertBt.addActionListener(e->{
  	new teacher();
  	dispose();
  });
 
  JButton delteacher = new JButton("delete teacher");
 // delteacher.setBounds(150,410,100,50);
  f3.add(delteacher);
  delteacher.addActionListener(e->{
  	new deleteteacher();
  	dispose();
  });
  
  JButton updateteacher = new JButton("update teacher");
 // updateteacher.setBounds(150,480,100,50);
  f3.add(updateteacher);
  updateteacher.addActionListener(e->{
  	new updateTeacher();
  	dispose();
  });
  JButton fetchteacher = new JButton("get teacher");
  // updateteacher.setBounds(150,480,100,50);
   f3.add(fetchteacher);
   fetchteacher.addActionListener(e->{
   	new fetchteache();
   	dispose();
   });
   JButton feeInsert = new JButton("get fees");
   // updateteacher.setBounds(150,480,100,50);
    f3.add( feeInsert);
    feeInsert.addActionListener(e->{
    	new  feeInsert();
    	dispose();
    });
    JButton fetchFee = new JButton("insert fee");
    // updateteacher.setBounds(150,480,100,50);
     f3.add(fetchFee);
     fetchFee.addActionListener(e->{
     	new  fetchfee();
     	dispose();
     });
 }
 
}
