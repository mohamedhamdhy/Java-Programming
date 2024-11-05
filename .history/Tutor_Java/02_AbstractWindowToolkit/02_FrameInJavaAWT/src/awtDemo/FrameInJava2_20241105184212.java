package awtDemo;

import java.awt.*;

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
    }

    public static void main(String[] args) {
        FrameInJava2 frm = new FrameInJava2();
    }
}
