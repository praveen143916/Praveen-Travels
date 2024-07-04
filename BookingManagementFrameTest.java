import static org.junit.jupiter.api.Assertions.*;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BookingManagementFrameTest {

    @Test
    public void testBookingManagementFrameComponents() {
        BookingManagementFrame frame = new BookingManagementFrame();

        Component[] components = frame.getContentPane().getComponents();
        assertEquals(12, components.length);

        JLabel bookingIDLabel = (JLabel) components[0];
        JTextField bookingIDField = (JTextField) components[1];
        JLabel customerNameLabel = (JLabel) components[2];
        JTextField customerNameField = (JTextField) components[3];
        JLabel bookingDateLabel = (JLabel) components[4];
        JTextField bookingDateField = (JTextField) components[5];
        JLabel contactLabel = (JLabel) components[6];
        JTextField contactField = (JTextField) components[7];
        JLabel statusLabel = (JLabel) components[8];
        JTextField statusField = (JTextField) components[9];
        JButton confirmButton = (JButton) components[11];

        assertEquals("Booking ID:", bookingIDLabel.getText());
        assertEquals("Customer Name:", customerNameLabel.getText());
        assertEquals("Booking Date:", bookingDateLabel.getText());
        assertEquals("Contact:", contactLabel.getText());
        assertEquals("Status:", statusLabel.getText());
        assertEquals("Confirm Booking", confirmButton.getText());
    }

    @Test
    public void testConfirmBookingAction() {
        BookingManagementFrame frame = new BookingManagementFrame();

        JTextField bookingIDField = (JTextField) frame.getContentPane().getComponent(1);
        JTextField customerNameField = (JTextField) frame.getContentPane().getComponent(3);
        JTextField bookingDateField = (JTextField) frame.getContentPane().getComponent(5);
        JTextField contactField = (JTextField) frame.getContentPane().getComponent(7);
        JTextField statusField = (JTextField) frame.getContentPane().getComponent(9);
        JButton confirmButton = (JButton) frame.getContentPane().getComponent(11);

        bookingIDField.setText("B001");
        customerNameField.setText("Jane Doe");
        bookingDateField.setText("2023-07-05");
        contactField.setText("555-5678");
        statusField.setText("Pending");

        confirmButton.doClick();

        String expectedDetails = "Booking Details:\n" +
                "Booking ID: B001\n" +
                "Customer Name: Jane Doe\n" +
                "Booking Date: 2023-07-05\n" +
                "Contact: 555-5678\n" +
                "Status: Pending";

        JOptionPane.showMessageDialog(null, expectedDetails);
    }
}