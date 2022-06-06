/*
 * Created by JFormDesigner on Sun Jun 05 22:35:47 COT 2022
 */

package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class VentanaInicio extends JFrame {
    public VentanaInicio() {
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
        btnCoulomb = new JButton();
        btnGauss = new JButton();
        btnFlujoE = new JButton();
        btnCapacitores = new JButton();
        btnPotencial = new JButton();
        btnEnergiaP = new JButton();
        btnEnergiaA = new JButton();
        btnDensidad = new JButton();
        btnCapacitancia = new JButton();

        //======== this ========
        setTitle("IPhysics Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());
        }
        contentPane.add(dialogPane, BorderLayout.SOUTH);

        //======== contentPanel ========
        {
            contentPanel.setLayout(null);

            //---- label1 ----
            label1.setText("IPhysics Calculator");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Cooper Black", Font.BOLD, 28));
            contentPanel.add(label1);
            label1.setBounds(185, 5, 330, 40);

            //---- label2 ----
            label2.setText("Nicolas Rodriguez");
            contentPanel.add(label2);
            label2.setBounds(new Rectangle(new Point(20, 300), label2.getPreferredSize()));

            //---- label3 ----
            label3.setText("Cristian Cruz");
            contentPanel.add(label3);
            label3.setBounds(new Rectangle(new Point(20, 320), label3.getPreferredSize()));

            //---- label4 ----
            label4.setText("Maria Alejandra Angarita");
            contentPanel.add(label4);
            label4.setBounds(new Rectangle(new Point(20, 340), label4.getPreferredSize()));

            //---- label5 ----
            label5.setText("Alejandro Chitiva");
            contentPanel.add(label5);
            label5.setBounds(new Rectangle(new Point(20, 360), label5.getPreferredSize()));

            //---- btnCoulomb ----
            btnCoulomb.setText("Ley de Coulomb");
            btnCoulomb.setActionCommand("COULOMB");
            contentPanel.add(btnCoulomb);
            btnCoulomb.setBounds(new Rectangle(new Point(280, 50), btnCoulomb.getPreferredSize()));

            //---- btnGauss ----
            btnGauss.setText("Ley de Gauss");
            btnGauss.setActionCommand("GAUSS");
            contentPanel.add(btnGauss);
            btnGauss.setBounds(280, 90, 121, 30);

            //---- btnFlujoE ----
            btnFlujoE.setText("Flujo Electrico");
            btnFlujoE.setActionCommand("FLUJO_ELECTRICO");
            contentPanel.add(btnFlujoE);
            btnFlujoE.setBounds(280, 130, 121, 30);

            //---- btnCapacitores ----
            btnCapacitores.setText("Suma de Capacitores");
            btnCapacitores.setActionCommand("CAPACITORES");
            contentPanel.add(btnCapacitores);
            btnCapacitores.setBounds(280, 170, 121, 30);

            //---- btnPotencial ----
            btnPotencial.setText("Potencial Electrico");
            btnPotencial.setActionCommand("POTENCIAL");
            contentPanel.add(btnPotencial);
            btnPotencial.setBounds(280, 210, 121, 30);

            //---- btnEnergiaP ----
            btnEnergiaP.setText("Energia Potencial");
            btnEnergiaP.setActionCommand("ENERGIA_POTENCIAL");
            contentPanel.add(btnEnergiaP);
            btnEnergiaP.setBounds(280, 250, 121, 30);

            //---- btnEnergiaA ----
            btnEnergiaA.setText("Energia Almacenada");
            btnEnergiaA.setActionCommand("ENERGIA_ALMACENADA");
            contentPanel.add(btnEnergiaA);
            btnEnergiaA.setBounds(280, 290, 121, 30);

            //---- btnDensidad ----
            btnDensidad.setText("Densidad");
            btnDensidad.setActionCommand("DENSIDAD");
            contentPanel.add(btnDensidad);
            btnDensidad.setBounds(280, 330, 121, 30);

            //---- btnCapacitancia ----
            btnCapacitancia.setText("Capacitancia");
            btnCapacitancia.setActionCommand("CAPACITANCIA");
            contentPanel.add(btnCapacitancia);
            btnCapacitancia.setBounds(280, 365, 121, 30);

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
        contentPane.add(contentPanel, BorderLayout.CENTER);
        setSize(700, 490);
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
    private JButton btnCoulomb;
    private JButton btnGauss;
    private JButton btnFlujoE;
    private JButton btnCapacitores;
    private JButton btnPotencial;
    private JButton btnEnergiaP;
    private JButton btnEnergiaA;
    private JButton btnDensidad;
    private JButton btnCapacitancia;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JButton getBtnCoulomb() {
        return btnCoulomb;
    }

    public void setBtnCoulomb(JButton btnCoulomb) {
        this.btnCoulomb = btnCoulomb;
    }

    public JButton getBtnGauss() {
        return btnGauss;
    }

    public void setBtnGauss(JButton btnGauss) {
        this.btnGauss = btnGauss;
    }

    public JButton getBtnFlujoE() {
        return btnFlujoE;
    }

    public void setBtnFlujoE(JButton btnFlujoE) {
        this.btnFlujoE = btnFlujoE;
    }

    public JButton getBtnCapacitores() {
        return btnCapacitores;
    }

    public void setBtnCapacitores(JButton btnCapacitores) {
        this.btnCapacitores = btnCapacitores;
    }

    public JButton getBtnPotencial() {
        return btnPotencial;
    }

    public void setBtnPotencial(JButton btnPotencial) {
        this.btnPotencial = btnPotencial;
    }

    public JButton getBtnEnergiaP() {
        return btnEnergiaP;
    }

    public void setBtnEnergiaP(JButton btnEnergiaP) {
        this.btnEnergiaP = btnEnergiaP;
    }

    public JButton getBtnEnergiaA() {
        return btnEnergiaA;
    }

    public void setBtnEnergiaA(JButton btnEnergiaA) {
        this.btnEnergiaA = btnEnergiaA;
    }

    public JButton getBtnDensidad() {
        return btnDensidad;
    }

    public void setBtnDensidad(JButton btnDensidad) {
        this.btnDensidad = btnDensidad;
    }

    public JButton getBtnCapacitancia() {
        return btnCapacitancia;
    }

    public void setBtnCapacitancia(JButton btnCapacitancia) {
        this.btnCapacitancia = btnCapacitancia;
    }
}
