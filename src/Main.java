//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numeros = {8, 3, 12, 8, 5, 9, 3, 20};

        int n = numeros.length;

        // ==========================================
        // 1. ORDENAMIENTO Y BUSQUEDA DE REPETIDOS
        // ==========================================

        //ORDENAMIENTO

        int iteracionesOrdenar = 0;
        int comparacionesOrdenar = 0;
        long inicioOrdenamiento = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                iteracionesOrdenar++;
                comparacionesOrdenar++;
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.println("===== ORDENAMIENTO =====");
        System.out.println("Numeros ordenados:");

        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nIteraciones: " + iteracionesOrdenar);
        System.out.println("Comparaciones: " + comparacionesOrdenar);

        // BUSQUEDA DE NUMEROS REPETIDOS

        int iteracionesBusqueda = 0;
        int comparacionesBusqueda = 0;

        System.out.println("\n===== NUMEROS REPETIDOS =====");

        for (int i = 0; i < n - 1; i++) {
            iteracionesBusqueda++;
            comparacionesBusqueda++;
            System.out.println(numeros[i] + " == " + numeros[i + 1]);
            if (numeros[i] == numeros[i + 1]) {
                System.out.println("Numero repetido: " + numeros[i]);
            }
        }

        long finOrdenamiento = System.nanoTime();
        long tiempoOrdenamiento = finOrdenamiento - inicioOrdenamiento;

        System.out.println("\nIteraciones: " + iteracionesBusqueda);
        System.out.println("Comparaciones: " + comparacionesBusqueda);

        System.out.println("Tiempo total de ordenamiento y busqueda: " + tiempoOrdenamiento + " nanosegundos");


        // ==========================================
        // 2. CALCULAR PROMEDIOS
        // ==========================================

        int iteracionesPromedio = 0;
        int comparacionesPromedio = 0;


        int[] original = {8, 3, 12, 8, 5, 9, 3, 20};

        long inicioPromedio = System.nanoTime();

        System.out.println("\n===== CALCULO DE PROMEDIOS =====");

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double promedio = (original[i] + original[j]) / 2.0;
                iteracionesPromedio++;
                System.out.println("\nComparando: " + original[i] + " y " + original[j]);
                System.out.println("Promedio: " + promedio);
                comparacionesPromedio++;
                if (promedio == original[i]) {
                    System.out.println("Igual al primer numero");
                } else {
                    comparacionesPromedio++;
                    if (promedio == original[j]) {
                        System.out.println("Igual al segundo numero");
                    } else {
                        System.out.println("No es igual a ninguno");
                    }
                }
            }
        }

        long finPromedio = System.nanoTime();

        long tiempoPromedio = finPromedio - inicioPromedio;

        System.out.println("\nIteraciones: " + iteracionesPromedio);
        System.out.println("Comparaciones: " + comparacionesPromedio);

        System.out.println("Tiempo total de promedios y busqueda: " + tiempoPromedio + " nanosegundos");
    }
}