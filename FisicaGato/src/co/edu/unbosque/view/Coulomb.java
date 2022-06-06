/*
 * Created by JFormDesigner on Sun Jun 05 23:03:09 COT 2022
 */

package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class Coulomb extends JFrame {
    public Coulomb() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        jTextQ1 = new JTextField();
        label7 = new JLabel();
        jTextQ2 = new JTextField();
        jTextDistancia = new JTextField();
        label8 = new JLabel();
        jResultado = new JLabel();
        btnCalcular = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);

                //---- label1 ----
                label1.setText("Coulomb");
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                contentPanel.add(label1);
                label1.setBounds(230, 5, 75, 30);

                //---- label2 ----
                label2.setText("Mili = e-3");
                contentPanel.add(label2);
                label2.setBounds(new Rectangle(new Point(15, 35), label2.getPreferredSize()));

                //---- label3 ----
                label3.setText("Micro = e-6");
                contentPanel.add(label3);
                label3.setBounds(new Rectangle(new Point(15, 55), label3.getPreferredSize()));

                //---- label4 ----
                label4.setText("Nano = e-9");
                contentPanel.add(label4);
                label4.setBounds(new Rectangle(new Point(15, 75), label4.getPreferredSize()));

                //---- label5 ----
                label5.setText("Pico = e-12");
                contentPanel.add(label5);
                label5.setBounds(new Rectangle(new Point(15, 95), label5.getPreferredSize()));

                //---- label6 ----
                label6.setText("Carga 1");
                contentPanel.add(label6);
                label6.setBounds(new Rectangle(new Point(185, 45), label6.getPreferredSize()));
                contentPanel.add(jTextQ1);
                jTextQ1.setBounds(235, 40, 120, 30);

                //---- label7 ----
                label7.setText("Carga 2");
                contentPanel.add(label7);
                label7.setBounds(185, 100, 40, 16);
                contentPanel.add(jTextQ2);
                jTextQ2.setBounds(235, 95, 120, 30);
                contentPanel.add(jTextDistancia);
                jTextDistancia.setBounds(235, 150, 120, 30);

                //---- label8 ----
                label8.setText("Distancia");
                contentPanel.add(label8);
                label8.setBounds(170, 155, 60, 16);

                //---- jResultado ----
                jResultado.setBackground(new Color(204, 204, 255));
                contentPanel.add(jResultado);
                jResultado.setBounds(80, 235, 420, 90);

                //---- btnCalcular ----
                btnCalcular.setText("Calcular");
                contentPanel.add(btnCalcular);
                btnCalcular.setBounds(210, 195, 135, btnCalcular.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < contentPanel.getComponentCount(); i++) {
                        Rectangle bounds = contentPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = contentPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    contentPanel.setMinimumSize(preferredSize);
                    contentPanel.setPreferredSize(preferredSize);
                }
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField jTextQ1;
    private JLabel label7;
    private JTextField jTextQ2;
    private JTextField jTextDistancia;
    private JLabel label8;
    private JLabel jResultado;
    private JButton btnCalcular;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JTextField getjTextQ1() {
        return jTextQ1;
    }

    public void setjTextQ1(JTextField jTextQ1) {
        this.jTextQ1 = jTextQ1;
    }

    public JTextField getjTextQ2() {
        return jTextQ2;
    }

    public void setjTextQ2(JTextField jTextQ2) {
        this.jTextQ2 = jTextQ2;
    }

    public JTextField getjTextDistancia() {
        return jTextDistancia;
    }

    public void setjTextDistancia(JTextField jTextDistancia) {
        this.jTextDistancia = jTextDistancia;
    }

    public JLabel getjResultado() {
        return jResultado;
    }

    public void setjResultado(JLabel jResultado) {
        this.jResultado = jResultado;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }
}
