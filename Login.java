package com.signUp;
import com.mainPage.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import com.main.*;

public class Login implements ActionListener
{
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screen_widht = screenSize.width;
    int screen_height = screenSize.height;
    JFrame frame;
    JButton submit,createOne;
    public JPanel panel;                        //yeh public pe erro de raha hai public sahi hai
    JLabel username,paaswd,imgLabel,signup_msg;
    final JTextField  usernametxt,passwdtxt;
    public Login(JFrame frame)
    {
        this.frame = frame;
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        username = new JLabel();
        username.setText("Username");
        username.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        username.setForeground(Color.WHITE);

        usernametxt = new JTextField(30);
        usernametxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));

        paaswd = new JLabel();
        paaswd.setText("Password");
        paaswd.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        paaswd.setForeground(Color.WHITE);

        passwdtxt = new JPasswordField(30);
        passwdtxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));


        signup_msg = new JLabel();
        signup_msg.setText("Don't have a account yet ?");
        signup_msg.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        signup_msg.setForeground(Color.WHITE);

        createOne = new JButton("Create One");
        createOne.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        createOne.setForeground(Color.YELLOW);
        createOne.setOpaque(false);
        createOne.setContentAreaFilled(false);
        createOne.setBorderPainted(false);

        submit = new JButton("SUBMIT");

        panel = new JPanel(null);
        panel.setBackground(new Color(0,35,102));

        ImageIcon cab = new ImageIcon("D:\\OOP project\\CabGUI\\src\\taxi.jpg");
        imgLabel = new JLabel(cab);

        imgLabel.setBounds(20,20,screen_widht/2 - 20,screen_height - 110);
        username.setBounds(1090,170,100,30);
        paaswd.setBounds(1090,300,100,30);
        usernametxt.setBounds(940,220,400,50);
        passwdtxt.setBounds(940,350,400,50);
        signup_msg.setBounds(940,470,300,30);
        submit.setBounds(1090,420,100,40);
        createOne.setBounds(1120,470,150,30);

        panel.add(username);
        panel.add(usernametxt);
        panel.add(paaswd);
        panel.add(passwdtxt);
        panel.add(submit);
        panel.add(createOne);
        panel.add(imgLabel);
        panel.add(signup_msg);

        frame.add(panel,BorderLayout.CENTER);
        frame.setTitle("LOGIN FORM");
        frame.setContentPane(panel);

        submit.addActionListener(this);
        createOne.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("SUBMIT")) {
//            try {
//                LoginPage.sk = new Socket("192.168.43.208",8001);
//                PrintWriter out = new PrintWriter(LoginPage.sk.getOutputStream(), true);
//                BufferedReader in = new BufferedReader(new InputStreamReader(LoginPage.sk.getInputStream()));
//                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
//                out.println("login");
//                String value1 = usernametxt.getText();
//                out.println(value1);
//                String value2 = passwdtxt.getText();
//                out.println(value2);
//                String s = in.readLine();
//                if(s.equals("successful")) {
                    UserUI ui = new UserUI(frame);
//                } else {
//                    JOptionPane.showMessageDialog(frame, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        } else {
            SignUp sign = new SignUp(frame);
        }
    }
}

class SignUp implements ActionListener {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screen_widht = screenSize.width;
    int screen_height = screenSize.height;

    JFrame frame;
    JButton submit, cancel;
    JPanel panel;
    JLabel userid, passwd,name,emailid,phoneno,imgLabel,mandate;
    JTextField  usertxt, passtxt,nametxt,phonetxt,emailidtxt;

    public SignUp(JFrame frame) {
        this.frame = frame;
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setTitle("SIGNUP FORM");

        ImageIcon cab = new ImageIcon("D:\\OOP project\\CabGUI\\src\\taxi.jpg");
        imgLabel = new JLabel(cab);

        userid = new JLabel();
        userid.setText("Username:*");
        userid.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        userid.setForeground(Color.WHITE);

        usertxt = new JTextField(30);
        usertxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));

        passwd = new JLabel();
        passwd.setText("Password:*");
        passwd.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        passwd.setForeground(Color.WHITE);

        passtxt = new JPasswordField(30);
        passtxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));

        name = new JLabel();
        name.setText("Name:*");
        name.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        name.setForeground(Color.WHITE);

        nametxt = new JTextField(30);
        nametxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));

        emailid = new JLabel();
        emailid.setText("EmailId:*");
        emailid.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        emailid.setForeground(Color.WHITE);

        emailidtxt = new JTextField(30);
        emailidtxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));

        phoneno = new JLabel();
        phoneno.setText("Phone No:*");
        phoneno.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        phoneno.setForeground(Color.WHITE);

        phonetxt = new JTextField(30);
        phonetxt.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));


        mandate = new JLabel();
        mandate.setText("* marked fields are mandatory");
        mandate.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        mandate.setForeground(Color.YELLOW);

        submit = new JButton("SUBMIT");
        cancel = new JButton("CANCEL");

        panel = new JPanel(null);
        panel.setBackground(new Color(0,35,102));

        imgLabel.setBounds(20,20,screen_widht/2 - 20,screen_height - 110);
        name.setBounds(950,250,150,50);
        emailid.setBounds(950,320,150,50);
        phoneno.setBounds(950,390,150,50);
        userid.setBounds(950,460,150,50);
        passwd.setBounds(950,530,150,50);
        nametxt.setBounds(1100,250,350,50);
        emailidtxt.setBounds(1100,320,350,50);
        phonetxt.setBounds(1100,390,350,50);
        usertxt.setBounds(1100,460,350,50);
        passtxt.setBounds(1100,530,350,50);
        submit.setBounds(1050,630,100,50);
        cancel.setBounds(1180,630,100,50);
        mandate.setBounds(970,690,400,30);

        panel.add(name);
        panel.add(nametxt);
        panel.add(emailid);
        panel.add(emailidtxt);
        panel.add(phoneno);
        panel.add(phonetxt);
        panel.add(userid);
        panel.add(usertxt);
        panel.add(passwd);
        panel.add(passtxt);

        panel.add(submit);
        panel.add(cancel);
        panel.add(imgLabel);
        panel.add(mandate);

        frame.add(panel,BorderLayout.CENTER);
        frame.setContentPane(panel);
        frame.setVisible(true);


        submit.addActionListener(this);
        cancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("CANCEL")) {
            Login l = new Login(frame);
        }
        else {
//            try {
//                LoginPage.sk = new Socket("192.168.43.208",8001);
//                PrintWriter out = new PrintWriter(LoginPage.sk.getOutputStream(), true);
//                BufferedReader in = new BufferedReader(new InputStreamReader(LoginPage.sk.getInputStream()));
//                out.println("signup");
                String uid, pass, usn, ph, email;
                uid = usertxt.getText();
                pass = passtxt.getText();
                usn = nametxt.getText();
                ph = phonetxt.getText();
                email = emailidtxt.getText();
                if(uid.equals("") ||ph.equals("") ||pass.equals("") ||usn.equals("") ||email.equals(""))
                {
                    JOptionPane.showMessageDialog(frame, "Mandatory fields are left empty", "Wrong Entries", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
//                out.println(uid);
//                out.println(pass);
//                out.println(usn);
//                out.println(ph);
//                out.println(email);
//                String s = in.readLine();
                    if(true)
                    {
                        emailidtxt.setForeground(Color.RED);
                        emailidtxt.setToolTipText("emailid already exists");
                    }
                    if(true)
                    {
                        phonetxt.setForeground(Color.RED);
                        phonetxt.setToolTipText("Phone number already exists");
                    }
                    if(true)
                    {
                        usertxt.setForeground(Color.RED);
                        usertxt.setToolTipText("Username already exists");
                    }


//                if (s.equals("successful")) {
                    UserUI ui = new UserUI(frame);}

//                } else {
//                   }
//            } catch(Exception ex) {
//                ex.printStackTrace();
//            }
        }
    }
}
