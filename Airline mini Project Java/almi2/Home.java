import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Booking extends JFrame {
    private JTextField nameField, fromField, toField, flightIdField;

    Booking() {
        setTitle("Flight Booking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Panel with grid layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10)); // 5 rows, 2 columns

        // Passenger Name
        panel.add(new JLabel("Passenger Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        // Boarding Location
        panel.add(new JLabel("Boarding Location:"));
        fromField = new JTextField();
        panel.add(fromField);

        // Destination Location
        panel.add(new JLabel("Destination Location:"));
        toField = new JTextField();
        panel.add(toField);

        // Flight ID
        panel.add(new JLabel("Flight ID:"));
        flightIdField = new JTextField();
        panel.add(flightIdField);

        // Empty placeholder for alignment
        panel.add(new JLabel(""));

        // Next Button
        JButton nextButton = new JButton("Next");
        panel.add(nextButton);

        // Button Action
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String from = fromField.getText();
                String to = toField.getText();
                String flightId = flightIdField.getText();

                JOptionPane.showMessageDialog(null,
                        "Passenger: " + name +
                        "\nFrom: " + from +
                        "\nTo: " + to +
                        "\nFlight ID: " + flightId,
                        "Booking Details",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add panel to frame
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Booking();
    }
}
