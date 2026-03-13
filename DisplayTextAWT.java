import java.awt.*;

public class DisplayTextAWT extends Frame {

    DisplayTextAWT() {
        Label l = new Label("Welcome to Java AWT Application");
        l.setBounds(60, 80, 200, 30);

        add(l);

        setSize(300,200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DisplayTextAWT();
    }
}