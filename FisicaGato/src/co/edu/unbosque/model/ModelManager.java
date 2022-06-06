package co.edu.unbosque.model;

public class ModelManager {

    //Mili
    public double MiliCoulomb(double q1, double q2, double dist) {
        q1 = q1/1000;
        q2 = q2/1000;
        double coulomb = 9E9;
        final double formula = (coulomb) * ((Math.abs(q1)) * (Math.abs(q2))) / (Math.pow(dist, 2));

        return formula;
    }

    public double campoElectricoMiliCoulomb1(double q1, double dist) {
        double coulomb = 9E9;
        q1 = q1 / 1000;
        if (q1 < 0) {
            final double formula = (-1) * (coulomb * q1) / (Math.pow(dist, 2));
            return formula;
        } else {
            final double formula = (coulomb * q1) / (Math.pow(dist, 2));
            return formula;
        }
    }

    public double campoElectricoMiliCoulomb2(double q2, double dist) {
        double coulomb = 9E9;
        q2 = q2 / 1000;
        if (q2 < 0) {
            final double formula = -1 * (coulomb * q2) / (Math.pow(dist, 2));

            return formula;
        } else {
            final double formula = (coulomb * q2) / (Math.pow(dist, 2));
            return formula;
        }
    }

    //Micro
    public double Microcoulomb(double q1, double q2, double dist) {
        q1 = q1 / 1000000;
        q2 = q2 / 1000000;
        double coulomb = 9E9;
        final double formula = (coulomb) * ((Math.abs(q1)) * (Math.abs(q2))) / (Math.pow(dist, 2));

        return formula;
    }

    public double campoElectricoMicroCoulomb1(double q1, double dist) {
        double coulomb = 9E9;
        q1 = q1 / 1000000;
        if (q1 < 0) {
            final double formula = (-1) * (coulomb * q1) / (Math.pow(dist, 2));
            return formula;
        } else {
            final double formula = (coulomb * q1) / (Math.pow(dist, 2));
            return formula;
        }
    }

    public double campoElectricoMicroCoulomb2(double q2, double dist) {
        double coulomb = 9E9;
        q2 = q2 / 1000000;
        if (q2 < 0) {
            final double formula = -1 * (coulomb * q2) / (Math.pow(dist, 2));

            return formula;
        } else {
            final double formula = (coulomb * q2) / (Math.pow(dist, 2));
            return formula;
        }
    }

    //Nano
    public double Nanocoulomb(double q1, double q2, double dist) {
        q1 = q1 / 1000000;
        q2 = q2 / 1000000;
        double coulomb = 9E9;
        final double formula = (coulomb) * ((Math.abs(q1)) * (Math.abs(q2))) / (Math.pow(dist, 2));

        return formula;
    }

    public double campoElectricoNanoCoulomb1(double q1, double dist) {
        double coulomb = 9E9;
        q1 = q1 / 1000000;
        if (q1 < 0) {
            final double formula = (-1) * (coulomb * q1) / (Math.pow(dist, 2));
            return formula;
        } else {
            final double formula = (coulomb * q1) / (Math.pow(dist, 2));
            return formula;
        }
    }

    public double campoElectricoNanoCoulomb2(double q2, double dist) {
        double coulomb = 9E9;
        q2 = q2 / 1000000;
        if (q2 < 0) {
            final double formula = -1 * (coulomb * q2) / (Math.pow(dist, 2));

            return formula;
        } else {
            final double formula = (coulomb * q2) / (Math.pow(dist, 2));
            return formula;
        }
    }

    public double Picocoulomb(double q1, double q2, double dist) {
        q1 = q1 / 1000000 / 1000000;
        q2 = q2 / 1000000 / 1000000;
        double coulomb = 9E9;
        final double formula = (coulomb) * ((Math.abs(q1)) * (Math.abs(q2))) / (Math.pow(dist, 2));

        return formula;
    }

    public double campoElectricoPicoCoulomb1(double q1, double dist) {
        double coulomb = 9E9;
        q1 = q1 / 1000000 / 1000000;
        if (q1 < 0) {
            final double formula = (-1) * (coulomb * q1) / (Math.pow(dist, 2));
            return formula;
        } else {
            final double formula = (coulomb * q1) / (Math.pow(dist, 2));
            return formula;
        }
    }

    public double campoElectricoPicoCoulomb2(double q2, double dist) {
        double coulomb = 9E9;
        q2 = q2 / 1000000 / 1000000;
        if (q2 < 0) {
            final double formula = -1 * (coulomb * q2) / (Math.pow(dist, 2));

            return formula;
        } else {
            final double formula = (coulomb * q2) / (Math.pow(dist, 2));
            return formula;
        }
    }


    public double campoElectricoOut(double carga, double radio) {
        double epsilon = 8.85e-12;
        double pi = Math.PI;
        double formula = carga / ((4) * (pi) * (Math.pow(radio, 2)) * epsilon);

        return formula;
    }

    public double campoElectricoIn(double carga, double radior, double radioR) {
        double epsilon = 8.85e-12;
        double pi = Math.PI;
        double densidad = carga / ((1.33333333333333) * (pi) * (Math.pow(radioR, 3)));
        double formula = ((densidad) * (radior)) / ((3) * (epsilon));

        return formula;
    }

    public double lineaCargada(double carga, double longitud, double radio) {
        double epsilon = 8.85e-12;
        double pi = Math.PI;
        double landa = carga / longitud;

        double formula = (landa) / ((2) * (pi) * (radio) * (epsilon));

        return formula;
    }

    public double laminaCargada(double carga, double longitud) {
        double epsilon = 8.85e-12;
        double densidadSuperficial = carga / longitud;

        double formula = (densidadSuperficial) / ((2) * epsilon);

        return formula;
    }

    public double flujoElectrico(double campoe, double area, double angulo) {
        final double formula = (campoe * area * Math.cos(angulo));

        return formula;
    }

    public double sumaEnSerie(double cap1, double cap2, double cap3) {
        double suma = (1 / cap1) + (1 / cap2) + (1 / cap3);
        double formula = (1 / 1) / (suma);

        return formula;
    }

    public double sumaEnParalelo(double cap1, double cap2, double cap3) {
        double formula = cap1 + cap2 + cap3;

        return formula;
    }

    public double potencialUnaCarga(double carga, double distancia) {
        double coulomb = 9e9;
        double formula = ((coulomb) * (carga)) / distancia;

        return formula;
    }

    public double potencialMasCargas(double carga1, double distancia1, double carga2, double distancia2, double carga3, double distancia3) {
        double coulomb = 9e9;

        double q1 = ((coulomb) * (carga1)) / distancia1;
        double q2 = ((coulomb) * (carga2)) / distancia2;
        double q3 = ((coulomb) * (carga3)) / distancia3;

        double formula = q1 + q2 + q3;

        return formula;
    }

    public double energiaPotencaialDosC(double carga1, double carga2, double distancia) {
        double coulomb = 9e9;
        double formula = (coulomb) * (carga1 * carga2) / distancia;

        return formula;
    }

    public double energiaPotencialUnaC(double carga1, double distancia1, double carga2, double distancia2, double carga3, double distancia3) {
        double coulomb = 9e9;

        double distQ1Q2 = Math.abs(distancia1 - distancia2);
        double distQ1Q3 = Math.abs(distancia1 - distancia3);

        double formula = (coulomb * carga1) * ((carga2 / distQ1Q2) + (carga3 / distQ1Q3));

        return formula;
    }

    public double energiaAlmacenada1(double carga, double capacitancia) {
        double formula = Math.pow(carga, 2) / (2 * capacitancia);

        return formula;
    }

    public double energiaAlmacenada2(double capacitancia, double voltaje) {
        double formula = (0.5) * (capacitancia) * (Math.pow(voltaje, 2));

        return formula;
    }

    public double energiaALmaeenada3(double carga, double voltaje) {
        double formula = (0.5) * (carga) * (voltaje);

        return formula;
    }

    public double densidadLineal(double carga, double longitud) {
        double formula = carga / longitud;

        return formula;
    }

    public double densidadSuperficial(double carga, double area) {
        double formula = carga / area;

        return formula;
    }

    public double densidadVolumetrica(double carga, double volumen) {
        double formula = carga / volumen;

        return formula;
    }

    public double capacitanciaEsfera(double radioext, double radionint) {

        double epsilon = 8.85e-12;
        double pi = Math.PI;

        double formula = 4 * (pi) * ((epsilon)) * (((radionint * radioext))) / radioext - radionint;

        return formula;


    }
}