// 15 de Agosto 2022
// @estebanairaldoclivati
// para: bootcamp_introprog_03_2

/* 1ro. Primero creo la class 'coche' (linea19) */
/* 2do. Luego creamos la variable numérica que va a contener el número de puertas (linea20) */
/* 3ro. Despues creo una función para aumentar el número de puertas del coche (linea21) */
/* 4to. Luego creo un objeto 'miCoche' y a este le añadimos una puerta (linea12) */
/* 5to. Mostramos el número de puertas que tiene el coche (linea15) */

public class ipet0302 {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        // System.out.println(miCoche.puertas);
        miCoche.masPuertas();
        System.out.println("Nro de puertas = " + miCoche.puertas);
    }
}

class Coche {
    public int puertas = 3;
    public void masPuertas() {
        this.puertas = puertas + 1;
    }
}
