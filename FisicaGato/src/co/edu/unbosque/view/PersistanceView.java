package co.edu.unbosque.view;

public class PersistanceView {
    private VentanaInicio ventanaInicio = new VentanaInicio();
    private Coulomb coulomb = new Coulomb();

    public PersistanceView() {
        ventanaInicio.setVisible(true);
        coulomb.setVisible(false);
    }

    public VentanaInicio getVentanaInicio() {
        return ventanaInicio;
    }

    public void setVentanaInicio(VentanaInicio ventanaInicio) {
        this.ventanaInicio = ventanaInicio;
    }

    public Coulomb getCoulomb() {
        return coulomb;
    }

    public void setCoulomb(Coulomb coulomb) {
        this.coulomb = coulomb;
    }
}
