package GUI;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.*;
public class login extends JFrame {
    public login() {
        setTitle("My Frame");
        setSize(400, 300);
        setLayout(null);
     //   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lab = new JLabel("Enter name");
        lab.setBounds(70, 50, 100, 30);
        add(lab);

        JLabel lab1 = new JLabel("Enter password");
        lab1.setBounds(70, 100, 100, 30);
        add(lab1);

        JTextField txt = new JTextField();
        txt.setBounds(160, 50, 100, 30);
        add(txt);

        JTextField txt1 = new JTextField();
        txt1.setBounds(160, 100, 100, 30);
        add(txt1);

        JButton button = new JButton("Click Me!");
        button.setBounds(150, 150, 100, 50);
        add(button);

        button.addActionListener(e -> {
            // User input ko retrieve karein
            String url = "jdbc:mysql://localhost:3306/test1";
            String user = "root";
            String password = "Abhi@2001";

            try {
                Connection con = DriverManager.getConnection(url, user, password);
                String userName = txt.getText();
                int num = Integer.parseInt(txt1.getText());
                String query = "select * from admin where name ='" + userName + "'";
                PreparedStatement pst = con.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                boolean flag=false;
                while (rs.next()) {
                    if (rs.getString("name").equals(userName) && rs.getInt("password") == num) {
                        JOptionPane.showMessageDialog(this, "Hello, " + userName + "!");
                      // dispose();
                      new option();
                       
                    } else {
                        JOptionPane.showMessageDialog(this, "Wrong input, " + userName + "!");
                    }
                }
                
            } catch (SQLException e1) {
                e1.printStackTrace();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number for the password!");
            }
        });

        setVisible(true); // Frame visibility set karna
    }

//    public static void main(String[] args) {
//        new login(); // Frame ko initialize karna
//    }
}

