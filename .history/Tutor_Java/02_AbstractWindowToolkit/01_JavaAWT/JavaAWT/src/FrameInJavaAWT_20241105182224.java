package awtDemo;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameInJavaAWT {
    public static void main(String[] args) {
        Frame frm = new Frame("Tutor Joes");
        frm.setSize(1000, 600); // width, height
        frm.setLayout(null);

        Button btn = new Button("Click Me");
        btn.setBounds(75, 75, 200, 50); // X, Y, width, height

        frm.add(btn);
        
        // Add a window listener to close the window on clicking close
        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frm.dispose();
            }
        });
        
        frm.setVisible(true);
    }
}
