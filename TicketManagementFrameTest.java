import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketManagementFrameTest {

    private TicketManagementFrame frame;

    @BeforeEach
    public void setUp() {
        frame = new TicketManagementFrame();
    }

    @Test
    public void testViewTicketButtonAction() {
        JTextField ticketNumberField = (JTextField) frame.getContentPane().getComponent(1);
        JTextField passengerNameField = (JTextField) frame.getContentPane().getComponent(3);
        JTextField seatNumberField = (JTextField) frame.getContentPane().getComponent(5);
        JTextField busNumberField = (JTextField) frame.getContentPane().getComponent(7);
        JTextField journeyDateField = (JTextField) frame.getContentPane().getComponent(9);
        JButton viewTicketButton = (JButton) frame.getContentPane().getComponent(10);

        ticketNumberField.setText("12345");
        passengerNameField.setText("John Doe");
        seatNumberField.setText("10");
        busNumberField.setText("AB123");
        journeyDateField.setText("2024-07-04");

        viewTicketButton.doClick();

        String expectedDetails = "Ticket Details:\n" +
                "Ticket Number: 12345\n" +
                "Name: John Doe\n" +
                "Seat Number: 10\n" +
                "Bus Number: AB123\n" +
                "Journey Date: 2024-07-04";
        
    }

    @Test
    public void testCancelTicketButtonAction() {
        JButton cancelTicketButton = (JButton) frame.getContentPane().getComponent(11);
        cancelTicketButton.doClick();

   
    }
}
