// 15 de agosto 2022
// @estebanairaldoclivati
// para: bootcamp_introprog_03_1

/* 1ro. Primero vamos a crear una función con 3 argumentos (linea14) */
/* 2do. Luego vamos a llamar a la función en el 'main' y le asignamos los valores (linea9) */

public class ipet0301 {
    public static void main(String[] args) {
        int argsQueSeSuman = sumarArgumentos (3, 6, 9);
        System.out.println(argsQueSeSuman);    
    }

    public static int sumarArgumentos (int argumento01, int argumento02, int argumento03) {
        int resultadoArgsSumados = argumento01 + argumento02 + argumento03;
        return resultadoArgsSumados;
    }
}
