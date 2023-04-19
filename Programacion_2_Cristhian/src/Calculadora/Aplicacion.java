package Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicacion {
    private JPanel root;
    private JPanel cabecera;
    private JPanel botonera;
    private JButton btnClean;
    private JButton a7Button;
    private JButton btnpunto;
    private JButton a4Button1;
    private JButton a1Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton btnigual;
    private JButton btndivision;
    private JButton btnmultiplicacion;
    private JButton btnresta;
    private JButton btnsuma;
    private JLabel lbldisplay;

    public Aplicacion() {
        btnClean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbldisplay.setText("");
            }
        });

        ActionListener listenerDigitos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = lbldisplay.getText() + ((JButton)e.getSource()).getText();
                lbldisplay.setText(text);
            }
        };
        a7Button.addActionListener(listenerDigitos);
        btnpunto.addActionListener(listenerDigitos);
        a4Button1.addActionListener(listenerDigitos);
        a1Button.addActionListener(listenerDigitos);
        a8Button.addActionListener(listenerDigitos);
        a5Button.addActionListener(listenerDigitos);
        a2Button.addActionListener(listenerDigitos);
        a0Button.addActionListener(listenerDigitos);
        a9Button.addActionListener(listenerDigitos);
        a6Button.addActionListener(listenerDigitos);
        a3Button.addActionListener(listenerDigitos);

        ActionListener listenerOperaciones = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultado = calcular(lbldisplay.getText());
                lbldisplay.setText(resultado);
                if(e.getSource() != btnigual) {
                    String text = lbldisplay.getText() + ((JButton) e.getSource()).getText();
                    lbldisplay.setText(text);
                }
            }
        };
        btnigual.addActionListener(listenerOperaciones);
        btndivision.addActionListener(listenerOperaciones);
        btnmultiplicacion.addActionListener(listenerOperaciones);
        btnresta.addActionListener(listenerOperaciones);
        btnsuma.addActionListener(listenerOperaciones);
    }
    public String calcular(String operacion){
        String resultado ;
        String[] ops = operacion.split("[\\+\\-x\\/]");//funcion split lo parte en dos si encuentra uno de esos operadores
        if(ops.length == 1)
            resultado = ops[0];
        else{
            float v1 = Float.parseFloat(ops[0]);
            float v2 = Float.parseFloat(ops[1]);
            float r;
            if(operacion.contains("+")) r = v1 + v2;
            else if (operacion.contains("-")) r = v1 - v2;
            else if (operacion.contains("x")) r = v1 * v2;
            else r = v1 / v2;
            resultado =String.valueOf(r);
        }
        return resultado;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion");
        frame.setContentPane(new Aplicacion().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
