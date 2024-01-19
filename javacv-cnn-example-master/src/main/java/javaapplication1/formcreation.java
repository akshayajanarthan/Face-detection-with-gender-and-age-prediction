package javaapplication1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formcreation extends Applet implements ActionListener {
    TextField nameField, emailField;
    TextArea addressArea;
    Button submitButton, clearButton;
    Label nameLabel, emailLabel, addressLabel, resultLabel;

    public void init() {
        // Create text fields
        nameField = new TextField(20);
        emailField = new TextField(20);

        // Create text area
        addressArea = new TextArea(5, 20);

        // Create buttons
        submitButton = new Button("Submit");
        clearButton = new Button("Clear");

        // Create labels
        nameLabel = new Label("Name:");
        emailLabel = new Label("Email:");
        addressLabel = new Label("Address:");
        resultLabel = new Label("");

        // Add action listeners to the buttons
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add components to the applet
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(addressLabel);
        add(addressArea);
        add(submitButton);
        add(clearButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Handle submit button click event
            String name = nameField.getText();
            String email = emailField.getText();
            String address = addressArea.getText();

            // Display the form data in the result label
            resultLabel.setText("Submitted Form:\nName: " + name + "\nEmail: " + email + "\nAddress: " + address);
        } else if (e.getSource() == clearButton) {
            // Handle clear button click event
            nameField.setText("");
            emailField.setText("");
            addressArea.setText("");
            resultLabel.setText("");
    }