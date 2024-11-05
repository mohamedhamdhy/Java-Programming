package awtDemo;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameInJava2 extends Frame {

    Button btn;

    public FrameInJava2() {
        super("Tutor Joes");
        setLayout(null);
        btn = new Button("Click Me");
        btn.setBounds(75, 75, 200, 50); // X, Y, width, height
        add(btn);
        setSize(1000, 600);
        setVisible(true);
        
        // Add a window listener to close the application
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Close the application
            }
        });
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        FrameInJava2 frm = new FrameInJava2(); // Store the instance
        // You can call any method on frm here if needed.
        // For instance, if you had a method to change the button's label:
        // frm.changeButtonLabel("New Label");
    }
}
