package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterForm extends JFrame implements ActionListener {
    // Khởi tạo biến
    JLabel label1, label2, label3, label4;
    JTextField tf1, tf2;
    JPasswordField pf;
    JButton btn1, btn2;

    // Constructor
    public RegisterForm() {
        // Thiết lập layout
        setLayout(new GridLayout(4,2));

        // Tạo và thêm label và text field cho user name
        label1 = new JLabel("User Name:");
        add(label1);
        tf1 = new JTextField(20);
        add(tf1);

        // Tạo và thêm label và password field cho password
        label2 = new JLabel("Password:");
        add(label2);
        pf = new JPasswordField(20);
        add(pf);

        // Tạo và thêm label và text field cho email
        label3 = new JLabel("Email:");
        add(label3);
        tf2 = new JTextField(20);
        add(tf2);

        // Tạo và thêm nút đăng kí và nút đóng
        btn1 = new JButton("Register");
        btn2 = new JButton("Close");
        add(btn1);
        add(btn2);

        // Gắn nút đăng kí và nút đóng với ActionListener
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        // Thiết lập thông tin chung của JFrame
        setTitle("Register Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    // Xử lý sự kiện khi nút được nhấn
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btn1) {
            // Lấy user name, password và email từ text field và password field
            String user = tf1.getText();
            String pwd = new String(pf.getPassword());
            String email = tf2.getText();

            // Kiểm tra thông tin đăng kí
            if(user.equals("") || pwd.equals("") || email.equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill out all fields.");
            } else {
                // Thông báo đăng kí thành công
                JOptionPane.showMessageDialog(this, "Registered Successfully!");

                // Thực hiện các hành động cần thiết sau khi đăng kí thành công
                // Ví dụ: lưu thông tin đăng kí vào cơ sở dữ liệu, đăng nhập ngay sau khi đăng kí thành công, ...
            }
        } else if(ae.getSource() == btn2) {
            // Đóng cửa sổ
            dispose();
        }
    }

    // Khởi chạy chương trình
    public static void main(String[] args) {
        new RegisterForm();
    }
}