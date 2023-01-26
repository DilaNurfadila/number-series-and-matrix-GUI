import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.ArrayList;

public class matriks_invers {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton hitungButton;
    private JTextField det;
    private JPanel matriks;
    private JTextField ma_11;
    private JTextField ma_12;
    private JTextField ma_21;
    private JTextField ma_22;
    private JTextField mi_11;
    private JTextField mi_12;
    private JTextField mi_21;
    private JTextField mi_22;
    private JTextField midet_11;
    private JTextField midet_12;
    private JTextField midet_21;
    private JTextField midet_22;
    private JButton clearButton;
    private JButton keluarButton;
    private JButton deretBilanganButton;

    static JFrame frame = new JFrame("matriks_invers");
    public static void main(String[] args) {

        frame.setContentPane(new matriks_invers().matriks);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 700);
    }

    public matriks_invers() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[][] matrix = new int[2][2];
                int i = 0, j = 0, swap;

                // Arraylist dari setiap textfield matriks
                ArrayList<ArrayList<JTextField>> tfmatrix = new ArrayList<ArrayList<JTextField>>();
                tfmatrix.add(new ArrayList<JTextField>(Arrays.asList(textField1, textField2)));
                tfmatrix.add(1, new ArrayList<JTextField>(Arrays.asList(textField3, textField4)));

                ArrayList<ArrayList<JTextField>> tfma = new ArrayList<ArrayList<JTextField>>();
                tfma.add(new ArrayList<JTextField>(Arrays.asList(ma_11, ma_12)));
                tfma.add(1, new ArrayList<JTextField>(Arrays.asList(ma_21, ma_22)));

                ArrayList<ArrayList<JTextField>> tfmi = new ArrayList<ArrayList<JTextField>>();
                tfmi.add(new ArrayList<JTextField>(Arrays.asList(mi_11, mi_12)));
                tfmi.add(1, new ArrayList<JTextField>(Arrays.asList(mi_21, mi_22)));

                ArrayList<ArrayList<JTextField>> tfmidet = new ArrayList<ArrayList<JTextField>>();
                tfmidet.add(new ArrayList<JTextField>(Arrays.asList(midet_11, midet_12)));
                tfmidet.add(1, new ArrayList<JTextField>(Arrays.asList(midet_21, midet_22)));

                // Isi matriks
                do {
                    do {
                        matrix[i][j] = Integer.parseInt(tfmatrix.get(i).get(j).getText());
                        j++;
                    } while (j < matrix.length);
                    i++;
                    j = 0;
                } while (i < matrix.length);

                // Menampilkan matriks awal
                i = 0;
                do {
                    do {
                        tfma.get(i).get(j).setText(Double.toString(Double.parseDouble(String.valueOf(matrix[i][j]))));
                        j++;
                    } while (j < matrix.length);
                    i++;
                    j = 0;
                } while (i < matrix.length);

                // Hitungan determinan
                int determinan = (matrix[0][0]*matrix[1][1]) - (matrix[1][0]*matrix[0][1]);
                det.setText(Double.toString(Double.parseDouble(String.valueOf(determinan)))); // menampilkan hasil determinan


                // cek determinan
                if (determinan == 0) {
                    System.exit(0);
                } else {
                    // matriks invers
                    swap = matrix[0][0];
                    matrix[0][0] = matrix[1][1];
                    matrix[1][1] = swap;
                    matrix[0][1] *= -1;
                    matrix[1][0] *= -1;

                    // menampilkan matriks invers
                    i = 0;
                    do {
                        do {
                            tfmi.get(i).get(j).setText(Double.toString(Double.parseDouble(String.valueOf(matrix[i][j]))));
                            j++;
                        } while (j < matrix.length);
                        i++;
                        j = 0;
                    } while (i < matrix.length);

                    // menampilkan matriks invers dibagi dengan hasil determinan
                    i = 0;
                    do {
                        do {
                            tfmidet.get(i).get(j).setText((Double.parseDouble(String.valueOf(matrix[i][j])))+" / "+Double.parseDouble(String.valueOf(determinan)));
                            j++;
                        } while (j < matrix.length);
                        i++;
                        j = 0;
                    } while (i < matrix.length);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Untuk membersihkan isi dari textfield
                ma_11.setText("");
                ma_12.setText("");
                ma_21.setText("");
                ma_22.setText("");
                mi_11.setText("");
                mi_12.setText("");
                mi_21.setText("");
                mi_22.setText("");
                det.setText("");
                midet_11.setText("");
                midet_12.setText("");
                midet_21.setText("");
                midet_22.setText("");
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField1.requestFocus();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Untuk keluar dari program
                System.exit(0);
            }
        });
        deretBilanganButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame deretBilangan = new JFrame("deret_bilangan");
                deretBilangan.setVisible(true);
                frame.setVisible(false);
            }
        });
    }
}
