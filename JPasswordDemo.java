//Program 1.42

import javax.swing.*;
import java.awt.*;
public class JPasswordDemo
{
    public JPasswordDemo()
    {
        JFrame jFrame = new JFrame("Login Swing");
        jFrame.setSize(300,125);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel usernameLabel = new JLabel("Username", JLabel.LEFT);
        JLabel passwordLabel = new JLabel("Password", JLabel.LEFT);
        JTextField usernameField = new JTextField(10);
        JPasswordField passwordField = new JPasswordField(10);
        usernameLabel.setLabelFor(usernameField);
        passwordLabel.setLabelFor(passwordField);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,2,2,5));
        jPanel.add(usernameLabel);
        jPanel.add(usernameField);
        jPanel.add(passwordLabel);
        jPanel.add(passwordField);
        jFrame.setContentPane(jPanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new JPasswordDemo();
    }
}