/*
   Name: Tanner Klock
   File: ICE4.java
   Date: April 12th, 2024
   Description: Simple login GUI.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ICE4 {
    final private String USERNAME = "Tanner Klock";
    final private String PASSWORD = "100923929";
    ICE4() {
        // Create window
        JFrame loginWindow = new JFrame();
        final JLabel windowTitle = new JLabel("Sign in");
        windowTitle.setBounds(100,0,100,30);

        // Create labels for text fields
        final JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20,20,200,50);
        final JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20,75,80,30);

        // Create text fields
        final JTextField usernameInput = new JTextField();
        usernameInput.setBounds(100,30,100,30);
        final JPasswordField passwordInput = new JPasswordField();
        passwordInput.setBounds(100,75,100,30);

        // Create login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100,120,80,30);


        // Add fields to window
        loginWindow.add(windowTitle);
        loginWindow.add(usernameLabel);
        loginWindow.add(usernameInput);
        loginWindow.add(passwordLabel);
        loginWindow.add(passwordInput);
        loginWindow.add(loginButton);

        // Style the window
        loginWindow.setSize(300,300);
        loginWindow.setLayout(null);
        loginWindow.setVisible(true);
        loginWindow.setResizable(false);
        loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginWindow.setLocationRelativeTo(null);
        loginWindow.setBackground(new Color(173,238,238));

        // Button functionality
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Collect input
                String username = usernameInput.getText();
                String password = passwordInput.getText();
                // See if username and password match
                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    JOptionPane.showMessageDialog(null, "Username and Password are correct", "Sign in successful", JOptionPane.INFORMATION_MESSAGE);
                }
                // If they don't match ensure they aren't empty strings
                else if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "One or more text fields are null", "Alert!", JOptionPane.WARNING_MESSAGE);
                }

                else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Invalid input", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args) {
        new ICE4();
    }
}