package taller_Repaso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio_1 {
    private JLabel lblResultado3;
    private JLabel lblMensaje;
    private JButton agregarButton;
    private JTextField txtValor2;
    private JPanel root;
    private JTextField txtValor1;
    private JButton aceptarButton;
    private JButton limpiarButton;
    private JLabel lblDescripcion;
    private JLabel lblV2;
    private JLabel lblV1;
    private JLabel lblResultado1;
    private JLabel lblResultado2;
    private JLabel lblResultado4;

    public ejercicio_1() {
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblResultado1.setText("");
                lblResultado2.setText("");
                lblResultado3.setText("");
                lblResultado4.setText("");
                txtValor1.setText("");
                txtValor2.setText("");
            }
        });
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Float  v1,v2;

                v1 = Float.parseFloat(txtValor1.getText());
                v2 = Float.parseFloat(txtValor2.getText());
                lblResultado1.setText(String.format("%s + %s = %s",String.valueOf(v1),String.valueOf(v2),String.valueOf(v1 + v2)));
                lblResultado2.setText(String.format("%s - %s = %s",String.valueOf(v1),String.valueOf(v2),String.valueOf(v1 - v2)));
                lblResultado4.setText(String.format("%s x %s = %s",String.valueOf(v1),String.valueOf(v2),String.valueOf(v1 * v2)));
                lblResultado3.setText(String.format("%s / %s = %s",String.valueOf(v1),String.valueOf(v2),String.valueOf(v1 / v2)));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ejercicio_1");
        frame.setContentPane(new ejercicio_1().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
