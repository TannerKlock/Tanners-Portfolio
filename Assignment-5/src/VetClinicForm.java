/*
   Name: Tanner Klock
   File: VetClinicForm.java
   Date: April 17th, 2024
   Description: This program is for pet owners to register their animals for treatment.
*/

// Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.*;
import java.io.File;
import java.io.IOException;

public class VetClinicForm {
    final ImageIcon logo = new ImageIcon("C:/Users/Bount/Desktop/School/Object-Oriented-Programming/Assignment-5/src/Clinic_Logo.png");
    String patientName = "Patient Name: ";
    String ownerName = "Owner's Name: ";
    String emailAddress = "Email: ";
    String veterinarian = "Veterinarian: ";
    boolean validEmail = false;

    VetClinicForm() {
        // Set up the main window
        JFrame clinicForm = new JFrame("New Patient Registry");
        clinicForm.setIconImage(logo.getImage());
        clinicForm.setSize(300,300);
        clinicForm.setResizable(false);
        clinicForm.setLayout(null);
        clinicForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clinicForm.setLocationRelativeTo(null);
        clinicForm.setBackground(new Color(173,238,238));

        // Create labels
        JLabel patientLabel = new JLabel("Patient Name:");
        patientLabel.setBounds(20,30,100,10);
        JLabel ownerLabel = new JLabel("Owner Name:");
        ownerLabel.setBounds(20,50,100,20);
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(60,80,35,20);
        JLabel vetLabel = new JLabel("Veterinarian:");
        vetLabel.setBounds(10,105,80,30);
        JLabel successfulWrite = new JLabel();
        successfulWrite.setBounds(10, 180, 300, 50);

        // Create text fields
        JTextField patientText = new JTextField();
        patientText.setBounds(100,20,150,30);
        patientText.setToolTipText("Please enter your pets name.");
        patientText.grabFocus();
        JTextField ownerText = new JTextField();
        ownerText.setBounds(100,50,150,30);
        ownerText.setToolTipText("Please enter your name.");
        JTextField emailText = new JTextField();
        emailText.setBounds(100,75,150,30);
        emailText.setToolTipText("Please enter your email.");

        // Create vet radio buttons
        JRadioButton vetA = new JRadioButton("Dr. Tanner", true);
        vetA.setBounds(100,110,100,20);
        JRadioButton vetB = new JRadioButton("Dr. Klock");
        vetB.setBounds(200,110,100,20);
        ButtonGroup vets = new ButtonGroup();
        vets.add(vetA);
        vets.add(vetB);

        // Create buttons
        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(5,150,100,30);
        registerBtn.setToolTipText("Click this button to register (Enter)");
        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(100,150,75,30);
        clearBtn.setToolTipText("Click this button to clear the form of information (F1)");
        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(170,150,65,30);
        exitBtn.setToolTipText("Click this button to close and exit the form (F2)");

        // Add components to frame
        clinicForm.add(patientLabel);
        clinicForm.add(patientText);
        clinicForm.add(ownerLabel);
        clinicForm.add(ownerText);
        clinicForm.add(emailLabel);
        clinicForm.add(emailText);
        clinicForm.add(vetLabel);
        clinicForm.add(vetA);
        clinicForm.add(vetB);
        clinicForm.add(registerBtn);
        clinicForm.add(clearBtn);
        clinicForm.add(exitBtn);
        clinicForm.add(successfulWrite);

        // Register button functionality
        AbstractAction registerBtnAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Email validation pattern
                String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
                // Temp email storage
                String tempEmail = emailText.getText();
                Pattern emailPattern = Pattern.compile(regexPattern);
                // See if email matches pattern
                Matcher patternMatcher = emailPattern.matcher(tempEmail);


                if (patientText.getText().isEmpty() || ownerText.getText().isEmpty() || emailText.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: One or more text fields are empty.", "Error", JOptionPane.WARNING_MESSAGE);
                } else if (patternMatcher.matches()) {
                    validEmail = true;
                    patientName += patientText.getText() + "\n";
                    ownerName += ownerText.getText() + "\n";
                    emailAddress += emailText.getText() + "\n";
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid email address. Please enter a valid email", "Error", JOptionPane.WARNING_MESSAGE);
                }

                // Check vet choice
                if (vetA.isSelected()) {
                    veterinarian += vetA.getText() + "\n";
                } else if (vetB.isSelected()) {
                    veterinarian += vetB.getText() + "\n";
                }

                // Get the current date
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss\n");
                String currentDate = dateFormat.format(LocalDateTime.now());

                // If info is valid begin writing doc
                if (validEmail) {
                    String fileTitle = "***Patient Registration Document***\n";
                    try {
                        // Create new file
                        File patientDoc = new File("newpatientfile.txt");
                        patientDoc.createNewFile();
                        FileWriter registrationWriter = new FileWriter("newpatientfile.txt");
                        // Write to that file
                        registrationWriter.write(fileTitle);
                        registrationWriter.write(currentDate);
                        registrationWriter.write(patientName);
                        registrationWriter.write(ownerName);
                        registrationWriter.write(emailAddress);
                        registrationWriter.write(veterinarian);
                        registrationWriter.close();
                        // Display label if write operation successful
                        successfulWrite.setText("Registration Document written successfully");
                        successfulWrite.validate();
                    } catch (IOException f) {
                        // Display label if write operation failed
                        successfulWrite.setText("ERROR: Failed to write file");
                        successfulWrite.validate();
                    }
                }

            }
        };

        // Clear button functionality
        AbstractAction clearBtnAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                patientText.setText("");
                ownerText.setText("");
                emailText.setText("");
                patientText.grabFocus();
                vetA.setSelected(true);
                successfulWrite.setText("");
                patientName = "Patient Name: ";
                ownerName = "Owner's Name: ";
                emailAddress = "Email: ";
                veterinarian = "Veterinarian: ";
                validEmail = false;
                clinicForm.validate();
            }
        };

        // Exit button functionality
        AbstractAction exitBtnAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        // Keybinds
        registerBtn.addActionListener(registerBtnAction);
        registerBtn.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
        registerBtn.getActionMap().put("Enter", registerBtnAction);
        clearBtn.addActionListener(clearBtnAction);
        clearBtn.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "F1");
        clearBtn.getActionMap().put("F1", clearBtnAction);
        exitBtn.addActionListener(exitBtnAction);
        exitBtn.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0), "F2");
        exitBtn.getActionMap().put("F2", exitBtnAction);

        // Make form visible
        clinicForm.setVisible(true);
    }

    public static void main(String[] args) {
        new VetClinicForm();
    }
}
