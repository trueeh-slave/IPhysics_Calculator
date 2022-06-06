package co.edu.unbosque.view;

import javax.swing.*;

public class Msg {

    public void mostrarMsg(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

    public double leerDouble(String msg){
        String aux = JOptionPane.showInputDialog(msg);
        double dato = Double.parseDouble(aux);
        return dato;
    }

    public int leerEntero(String msg){
        String aux = JOptionPane.showInputDialog(msg);
        int dato = Integer.parseInt(aux);
        return dato;
    }


}
