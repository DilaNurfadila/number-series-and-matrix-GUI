import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deret_bilangan {
    private JButton matriksButton;
    private JPanel deret;

    static JFrame frame = new JFrame("deret_bilangan");

    public static void main(String[] args) {

        frame.setContentPane(new deret_bilangan().deret);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 500);

    }
    public deret_bilangan() {
        matriksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame matriks = new JFrame("matriks_invers");
                matriks.setVisible(true);
                frame.setVisible(false);
            }
        });
    }
}
