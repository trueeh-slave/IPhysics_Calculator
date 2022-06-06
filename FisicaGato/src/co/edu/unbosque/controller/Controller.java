package co.edu.unbosque.controller;

import co.edu.unbosque.model.ModelManager;
import co.edu.unbosque.view.Msg;
import co.edu.unbosque.view.PersistanceView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Controller implements ActionListener {

    Msg msg = new Msg();
    ModelManager md = new ModelManager();
    PersistanceView persistanceView = new PersistanceView();
    private DecimalFormat df = new DecimalFormat("0. ##E0");

    public Controller(){
        asignarOyentes();
    }

    public void asignarOyentes(){
        persistanceView.getVentanaInicio().getBtnCapacitancia().addActionListener(this);
        persistanceView.getVentanaInicio().getBtnCapacitores().addActionListener(this);
        persistanceView.getVentanaInicio().getBtnCoulomb().addActionListener(this);
        persistanceView.getVentanaInicio().getBtnDensidad().addActionListener(this);
        persistanceView.getVentanaInicio().getBtnEnergiaA().addActionListener(this);
        persistanceView.getVentanaInicio().getBtnEnergiaP().addActionListener(this);
        persistanceView.getVentanaInicio().getBtnFlujoE().addActionListener(this);
        persistanceView.getVentanaInicio().getBtnGauss().addActionListener(this);
        persistanceView.getVentanaInicio().getBtnPotencial().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(command.equals("COULOMB")){
            leyCoulomb();
        }
        if(command.equals("GAUSS")){
            campoElectrico();
        }
        if(command.equals("FLUJO_ELECTRICO")){
            flujoElectrico();
        }
        if(command.equals("CAPACITORES")){
            sumaCapacitores();
        }
        if(command.equals("POTENCIAL")){
            potencialElectrico();
        }
        if(command.equals("ENERGIA_POTENCIAL")){
            energiaPotencial();
        }
        if(command.equals("ENERGIA_ALMACENADA")){
            energiaAlmacenada();
        }
        if(command.equals("DENSIDAD")){
            densidadCarga();
        }
        if(command.equals("CAPACITANCIA")){
            capacitancia();
        }
    }

    public void leyCoulomb() {

        int menu = msg.leerEntero("Ingrese las unidades en que va a ingresar ambas cargas " +
                "\n 1. MiliCoulomb " +
                "\n 2. MicroCoulomb " +
                "\n 3. NanoCoulomb " +
                "\n 4. PicoCoulomb ");

        switch (menu) {
            case 1:
                double q1Input = msg.leerDouble("Ingrese la carga 1 en mC" +
                        "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double q2Input = msg.leerDouble("Ingrese la carga 2 en mC " +
                        "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double distInput = msg.leerDouble("Ingrese la distancia entre ambas cargas en m");

                msg.mostrarMsg("La fuerza eléctrica entre ambas cargas es: " + df.format(md.MiliCoulomb(q1Input, q2Input, distInput)) + " N." +
                        "\n El campo eléctrico de la carga 1 es: " + df.format(md.campoElectricoMiliCoulomb1(q1Input, distInput)) + " N/C." +
                        "\n El campo eléctrico de la carga 2 es: " + df.format(md.campoElectricoMiliCoulomb2(q2Input, distInput)) + " N/C.");

                break;
            case 2:

                double q1Inp = msg.leerDouble("Ingrese la carga 1 en μC" +
                        "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double q2Inp = msg.leerDouble("Ingrese la carga 2 en μC " +
                        "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double distInp = msg.leerDouble("Ingrese la distancia entre ambas cargas en m");

                msg.mostrarMsg("La fuerza eléctrica entre ambas cargas es: " + df.format(md.Microcoulomb(q1Inp, q2Inp, distInp)) + " N." +
                        "\n El campo eléctrico de la carga 1 es: " + df.format(md.campoElectricoMicroCoulomb1(q1Inp, distInp)) + " N/C." +
                        "\n El campo eléctrico de la carga 2 es: " + df.format(md.campoElectricoMicroCoulomb2(q2Inp, distInp)) + " N/C.");

                break;
            case 3:
                double q1In = msg.leerDouble("Ingrese la carga 1 en nC" +
                        "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double q2In = msg.leerDouble("Ingrese la carga 2 en nC " +
                        "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double distIn = msg.leerDouble("Ingrese la distancia entre ambas cargas en m");

                msg.mostrarMsg("La fuerza eléctrica entre ambas cargas es: " + df.format(md.Nanocoulomb(q1In, q2In, distIn)) + " N." +
                        "\n El campo eléctrico de la carga 1 es: " + df.format(md.campoElectricoNanoCoulomb1(q1In, distIn)) + " N/C." +
                        "\n El campo eléctrico de la carga 2 es: " + df.format(md.campoElectricoNanoCoulomb2(q2In, distIn)) + " N/C.");

                break;
            case 4:

                double q1I = msg.leerDouble("Ingrese la carga 1 en pC" +
                        "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double q2I = msg.leerDouble("Ingrese la carga 2 en pC " +
                        "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double distI = msg.leerDouble("Ingrese la distancia entre ambas cargas en m");

                msg.mostrarMsg("La fuerza eléctrica entre ambas cargas es: " + df.format(md.Picocoulomb(q1I, q2I, distI)) + " N." +
                        "\n El campo eléctrico de la carga 1 es: " + df.format(md.campoElectricoPicoCoulomb1(q1I, distI)) + " N/C." +
                        "\n El campo eléctrico de la carga 2 es: " + df.format(md.campoElectricoPicoCoulomb2(q2I, distI)) + " N/C.");

                break;
        }
    }

    public void campoElectrico(){

        int menuGauss = msg.leerEntero("Ingrese lo que quiere calcular " +
                "\n" +
                "\n 1. Campo electrico fuera de la esfera " +
                "\n 2. Campo electrico dentro de la esfera " +
                "\n 3. Linea Cargada " +
                "\n 4. Lamina Cargada ");

        switch (menuGauss){
            case 1:
                double carga1Gauss = msg.leerDouble("Ingrese la Carga en C \n" +
                        "NOTA: Recuerde que pico = e-6 \n" +
                        " nano = e-9 " +
                        "\n pico = e-12.");
                double radio1Gauss = msg.leerDouble("Ingrese el radio en m");

                msg.mostrarMsg("EL campo electrico fuera de la esfera es: "+df.format(md.campoElectricoOut(carga1Gauss,radio1Gauss)) +"N/C");
                break;

            case 2:
                double carga2Gauss = msg.leerDouble("Ingrese la Carga en C \n" +
                        "NOTA: Recuerde que pico = e-6 \n" +
                        " nano = e-9 " +
                        "\n pico = e-12.");
                double radior2 = msg.leerDouble("Ingrese el radio r en m");
                double radioR2 = msg.leerDouble("Ingrese el radio R en m");

                msg.mostrarMsg("El campo dentro de la esfera es: "+df.format(md.campoElectricoIn(carga2Gauss,radior2,radioR2))+ "N/C");

                break;

            case 3:
                double carga3Gauss = msg.leerDouble("Ingrese la Carga en C \n" +
                        "NOTA: Recuerde que pico = e-6 \n" +
                        " nano = e-9 " +
                        "\n pico = e-12.");
                double longitud3Gauss = msg.leerDouble("Ingrese la longitud en metros (m)");
                double radio3Gauss = msg.leerDouble("Ingrese le radio en metros (m)");

                msg.mostrarMsg("El campo el la linea cargada es: "+df.format(md.lineaCargada(carga3Gauss,longitud3Gauss,radio3Gauss))+"N/C");
                break;

            case 4:
                double carga4Gauss = msg.leerDouble("Ingrese la Carga en C\n" +
                        "NOTA: Recuerde que pico = e-6 \n" +
                        " nano = e-9 " +
                        "\n pico = e-12.");
                double longitud4Gauss = msg.leerDouble("Ingrese la longitud en (m");

                msg.mostrarMsg("La lamina cargada es: "+df.format(md.laminaCargada(carga4Gauss,longitud4Gauss)));

                break;
        }

    }

    public void flujoElectrico(){
        double campoElectrico = msg.leerDouble("Ingrese el campo electrico en (N/C) " +
                "\n NOTA: Ingrese la notacion cientifica como e " +
                "\n EJEMPLO: 9*10^9 = 9e9");

        double area = msg.leerDouble("Ingrese el área en (m^2) " +
                "\n NOTA: Ingrese la notacion cientifica como e " +
                "\n EJEMPLO: 9*10^9 = 9e9");

        double angulo = msg.leerDouble("Ingrese el angulo entre el area y el campo electrico " +
                "\n NOTA: Ingrese la notacion cientifica como e " +
                "\n EJEMPLO: 9*10^9 = 9e9");

        msg.mostrarMsg("El flujo electrico es: "+df.format(md.flujoElectrico(campoElectrico,area,angulo))+"(N*m^2)/C");
    }

    public void sumaCapacitores(){

        int menuCapacitores = msg.leerEntero("Ingrese lo que quiere calcular " +
                "\n 1. En serie " +
                "\n 2. En paralelo");

        switch (menuCapacitores){
            case 1:

                double cap1Serie = msg.leerDouble("Ingrese el capacitor 1 en (F)");
                double cap2Serie = msg.leerDouble("Ingrese el capacitor 2 en (F)");
                double cap3Serie = msg.leerDouble("Ingrese el capacitor 1 en (F)");

                msg.mostrarMsg("La suma de los capacitores en serie es: "+df.format(md.sumaEnSerie(cap1Serie,cap2Serie,cap3Serie))+ "F");

                break;

            case 2:
                double cap1Paralelo = msg.leerDouble("Ingrese el capacitor 1 en (F)");
                double cap2Paralelo = msg.leerDouble("Ingrese el capacitor 2 en (F)");
                double cap3Paralelo = msg.leerDouble("Ingrese el capacitor 1 en (F)");

                msg.mostrarMsg("La suma de los capacitores en paralelo es: "+df.format(md.sumaEnParalelo(cap1Paralelo,cap2Paralelo,cap3Paralelo))+"F");

                break;
        }
    }

    public void potencialElectrico(){
        int menuPotencial = msg.leerEntero("Ingrese lo que quiere calcular " +
                "\n 1. Potencial de una sola carga " +
                "\n 2. Potencial de mas de dos cargas");

        switch (menuPotencial){
            case 1:

                double cargaPotencial = msg.leerDouble("Ingrese la carga en (N/m)");
                double distanciaPotencial = msg.leerDouble("Ingrese la distancia entre punto y carga");

                msg.mostrarMsg("La energia potencial es: "+df.format(md.potencialUnaCarga(cargaPotencial,distanciaPotencial))+"J");

                break;

            case 2:

                double carga1Potencial = msg.leerDouble("Ingrese la carga 1 en (C)");
                double distancia1Potencial = msg.leerDouble("Ingrese la distancia en (m) de la carga 1");
                double carga2Potencial = msg.leerDouble("Ingrese la carga 2 en (C)");
                double distancia2Potencial = msg.leerDouble("Ingrese la distancia en (m) de la carga 2");
                double carga3Potencial = msg.leerDouble("Ingrese la carga 3 en (C)");
                double distancia3Potencial = msg.leerDouble("Ingrese la distancia en (m) de la carga 3");

                msg.mostrarMsg("El potencial electrico es: "+df.format(md.potencialMasCargas(carga1Potencial,distancia1Potencial,carga2Potencial,distancia2Potencial,carga3Potencial,distancia3Potencial))+"V");

                break;

        }
    }

    public void energiaPotencial(){

        int menuEnergia = msg.leerEntero("Ingrese lo que quiere calcular " +
                "\n 1. Energia Potencial de dos cargas " +
                "\n 2. Energia Potencial sobre 1 carga");

        switch (menuEnergia){
            case 1:
                double carga1Energia = msg.leerDouble("Ingrese la carga 1 ");
                double carga2Energia = msg.leerDouble("Ingrese la carga 2 ");
                double distancia1Energia = msg.leerDouble("Ingrese la distancia");

                msg.mostrarMsg("La energia potencial es "+df.format(md.energiaPotencaialDosC(carga1Energia,carga2Energia,distancia1Energia)+" (J)"));
                break;

            case 2:
                double cargaAnalizar = msg.leerDouble("Ingrese la carga a analizar");
                double distanciaInicial = msg.leerDouble("Ingrese la distancia incial");
                double carga2Analizar = msg.leerDouble("Ingrese la carga 2");
                double distancia2Inicial = msg.leerDouble("Ingrese la distancia inicial 2");
                double carga3Analizar = msg.leerDouble("Ingrese la carga 3");
                double distancia3Inicial = msg.leerDouble("Ingrese la distancia inicial 3");

                msg.mostrarMsg("La energia solo entre esa carga es: "+df.format(md.energiaPotencialUnaC(cargaAnalizar,distanciaInicial,carga2Analizar,distancia2Inicial,carga3Analizar,distancia3Inicial)));

                break;
        }

    }

    public void energiaAlmacenada(){
        int menu = msg.leerEntero("Ingrese lo que quiere calcular " +
                "\n 1. Formula con Carga y Capacitancia " +
                "\n 2. Formula con Capacitancia y Voltaje " +
                "\n 3. Formula con Carga y Voltaje");

        switch (menu){
            case 1:
                double cargaForm1 = msg.leerDouble("Ingrese la carga");
                double capacitanciaForm1 = msg.leerDouble("Ingrese la capacitancia en (F)");

                msg.mostrarMsg("La energia almacenada es: "+df.format(md.energiaAlmacenada1(cargaForm1,capacitanciaForm1)));

                break;

            case 2:
                double capacitanciaFom2 = msg.leerDouble("Ingrese la capacitancia");
                double voltajeForm2 = msg.leerDouble("Ingrese el voltaje en (V)");

                msg.leerDouble("La energia almacenada es: "+df.format(md.energiaAlmacenada2(capacitanciaFom2,voltajeForm2)));

                break;

            case 3:
                double cargaForm3 = msg.leerDouble("Ingrese la carga");
                double voltajeForm3 = msg.leerDouble("Ingrese el voltaje en (V)");

                msg.mostrarMsg("La carga almacenada es: "+df.format(md.energiaALmaeenada3(cargaForm3,voltajeForm3)));
                break;
        }
    }

    public void densidadCarga(){
        int menu = msg.leerEntero("Ingrese lo que quiere calcular " +
                "\n 1. Densidad lineal (λ)" +
                "\n 2. Densidad superficial (σ)"+
                "\n 3. Densidad volumétrica (ρ)");

        switch (menu){
            case 1:

                double carga = msg.leerDouble("Ingrese la carga en (C)+" +
                        "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double longitud = msg.leerDouble("Ingrese la longitud en (m)");

                msg.mostrarMsg("λ = "+df.format(md.densidadLineal(carga, longitud))+ "C/m");

                break;

            case 2:

                double carga1 = msg.leerDouble("Ingrese la carga en (C)+" +
                "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double area = msg.leerDouble("Ingrese el área en (m^2)");

                msg.mostrarMsg("σ = "+df.format(md.densidadSuperficial(carga1, area))+ "C/m^2");

                break;

            case 3:
                double carga3 = msg.leerDouble("Ingrese la carga en (C)+" +
                        "\n NOTA: Ingrese la notacion cientifica como E " +
                        "\n EJEMPLO: 9*10^9 = 9E9");
                double volumen = msg.leerDouble("Ingrese el volumen en (m^3)");

                msg.mostrarMsg("ρ = "+df.format(md.densidadVolumetrica(carga3, volumen))+ "C/m^3");

        }
    }

    public void capacitancia(){

        int menu =msg.leerEntero("Ingrese lo que quiere cacular " +
                "\n 1. Capacitancia de una esfera ");

        switch (menu){
            case 1:

                double radioExt = msg.leerDouble("Ingrese el radio externo");
                double radioInt = msg.leerDouble("Ingrese el radio interno");

                msg.mostrarMsg("La capacitancia de la esfera es: "+md.capacitanciaEsfera(radioExt,radioInt));

                break;

            case 2:

                double longitud = msg.leerDouble("Ingrese la longitud en (m)");
                double radioint2= msg.leerDouble("Ingrese el radio interno");
                double radioext2 = msg.leerDouble("Ingrese el radio exterior");

                break;

        }


    }

}
