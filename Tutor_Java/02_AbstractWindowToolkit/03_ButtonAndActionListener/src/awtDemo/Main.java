package awtDemo;

import java.awt.*;
import java.awt.event.*;

class ButtonAndActionListener extends Frame {
    Button btn;

    public ButtonAndActionListener() {
        super("Tutor Joes");
        setLayout(null);

        btn = new Button("Click Me");
        btn.setBounds(75, 75, 200, 50); // Set position and size of the button
        add(btn);
        
        setSize(1000, 600);
        setVisible(true);

        // Add a window listener to handle closing the window
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Exit the application
            }
        });
    }
}

public class Main {
    public static void main(String[] args) {
        new ButtonAndActionListener(); // Create and display the frame
    }
}
