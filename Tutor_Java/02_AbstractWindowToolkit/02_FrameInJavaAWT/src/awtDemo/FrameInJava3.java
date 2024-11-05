package awtDemo;

import java.awt.Button;
import java.awt.Frame;

public class FrameInJava3 extends Frame {
    Button btn;

    public FrameInJava3() {
        super("Tutor Joes");
        setLayout(null);

        btn = new Button("Click Me");
        btn.setBounds(75, 75, 200, 50); // X, Y, width, height
        add(btn);

        setSize(1000, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        FrameInJava3 frm = new FrameInJava3();
        // Ensure the frame is visible and set the default close operation
        frm.setVisible(true);
        frm.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
