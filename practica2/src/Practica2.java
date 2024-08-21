public class Practica2 {
    /**
     * Encuentra el valor máximo en un arreglo de números enteros.
     * 
     * @param arreglo de números enteros.
     * @return el valor máximo en el arreglo.
     *         Ejemplo:
     *         Input: [3, 5, 7, 2, 8]
     *         Output: 8
     * 
     *         1.0 pts : Si tu algoritmo tiene una complejidad de O(n).
     *         0.7 pts : Si tu algoritmo tiene una complejidad de O(n^2).
     */
    public static int encuentraMaximo(int[] arreglo) {
   
            int maximo = arreglo[0];
            for (int i = 1; i < arreglo.length; i++) {
                if (arreglo[i] > maximo) {
                    maximo = arreglo[i];
                }
            }
            return maximo;  // Complejidad: O(n)
        }

    /**
     * Ordena un arreglo de números enteros en orden ascendente.
     * 
     * @param arreglo de números enteros a ordenar.
     * @return un nuevo arreglo con los elementos ordenados.
     *         Ejemplo:
     *         Input: [4, 2, 9, 1, 5]
     *         Output: [1, 2, 4, 5, 9]
     * 
     *         1.0 pts : Si tu algoritmo tiene una complejidad de O(n*log(n)).
     *         0.7 pts : Si tu algoritmo tiene una complejidad de O(n^2).
     */
    public static int[] ordenarArreglo(int[] arreglo) {
        int n = arreglo.length;
        int[] resultado = arreglo.clone(); // Crear una copia del arreglo para no modificar el original
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (resultado[j] > resultado[j + 1]) {
                    // Intercambiar resultado[j] y resultado[j + 1]
                    int temp = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = temp;
            }
        }
    }
    return resultado; 
}
    }  

    /**
     * Busca un elemento en un arreglo ordenado de números enteros.
     * 
     * @param arreglo  ordenado de números enteros.
     * @param elemento a buscar en el arreglo.
     * @return <code>true</code> si el elemento recibido existe en el arreglo,
     *         <code>false</code> en otro caso.
     *         Ejemplo:
     *         Input: [1, 3, 5, 7, 9], elemento = 5
     *         Output: true
     * 
     *         1.0 pts : Si tu algoritmo tiene una complejidad de O(log(n)).
     *         0.7 pts : Si tu algoritmo tiene una complejidad de O(n).
     */
    public static boolean buscarElementoOrdenado(int[] arreglo, int elemento){
            int inicio = 0;
            int fin = arreglo.length - 1;
            while (inicio <= fin) {
                int medio = inicio + (fin - inicio) / 2;
                if (arreglo[medio] == elemento) {
                    return true;
                }
                if (arreglo[medio] < elemento) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                } 
            }
            return false;  // Complejidad: O(log(n)) usando busqueda binaria 
        

    }

    /**
     * Suma todos los elementos de un arreglo de números enteros.
     * 
     * @param arreglo de números enteros.
     * @return la suma de todos los elementos en el arreglo.
     *         Ejemplo:
     *         Input: [1, 2, 3, 4, 5]
     *         Output: 15
     * 
     *         1.0 pts : Si tu algoritmo tiene una complejidad de O(n).
     *         0.7 pts : Si tu algoritmo tiene una complejidad de O(n^2).
     */
    public static int sumaElementos(int[] arreglo) {

    }

    /**
     * Invierte el orden de los elementos en un arreglo de números enteros.
     * 
     * @param arreglo de números enteros.
     * @return un nuevo arreglo con los elementos en orden inverso.
     *         Ejemplo:
     *         Input: [1, 2, 3, 4, 5]
     *         Output: [5, 4, 3, 2, 1]
     * 
     *         1.0 pts : Si tu algoritmo tiene una complejidad de O(n).
     *         0.7 pts : Si tu algoritmo tiene una complejidad de O(n^2).
     */
    public static int[] invierteArreglo(int[] arreglo) {

    }

    /**
     * Encuentra el valor mínimo en un arreglo de números enteros.
     * 
     * @param arreglo de números enteros.
     * @return el valor mínimo en el arreglo.
     *         Ejemplo:
     *         Input: [3, 5, 7, 2, 8]
     *         Output: 2
     * 
     *         1.0 pts : Si tu algoritmo tiene una complejidad de O(n).
     *         0.7 pts : Si tu algoritmo tiene una complejidad de O(n^2).
     */
    public static int encuentraMinimo(int[] arreglo) {

    }

    /**
     * Cuenta cuántas veces aparece un elemento en un arreglo de números enteros.
     * 
     * @param arreglo  de números enteros.
     * @param elemento a contar en el arreglo.
     * @return el número de ocurrencias del elemento en el arreglo.
     *         Ejemplo:
     *         Input: [1, 2, 3, 4, 3, 2, 3], elemento = 3
     *         Output: 3
     * 
     *         1.0 pts : Si tu algoritmo tiene una complejidad de O(n).
     *         0.7 pts : Si tu algoritmo tiene una complejidad de O(n^2).
     */
    public static int contarOcurrencias(int[] arreglo, int elemento) {

    }

    /**
     * Encuentra el segundo valor máximo en un arreglo de números enteros.
     * 
     * @param arreglo de números enteros.
     * @return el segundo valor máximo en el arreglo.
     *         Ejemplo:
     *         Input: [3, 5, 7, 2, 8]
     *         Output: 7
     * 
     *         1.0 pts : Si tu algoritmo tiene una complejidad de O(n).
     *         0.7 pts : Si tu algoritmo tiene una complejidad de O(n^2).
     */
    public static int encuentraSegundoMaximo(int[] arreglo) {

    }

    /**
     * Verifica si un arreglo de números enteros está ordenado en orden ascendente.
     * 
     * @param arreglo de números enteros.
     * @return <code>true</code> si el arreglo está ordenado,
     *         <code>false</code> en otro caso.
     *         Ejemplo:
     *         Input: [1, 2, 3, 4, 5]
     *         Output: true
     * 
     *         1.0 pts : Si tu algoritmo tiene una complejidad de O(n).
     *         0.7 pts : Si tu algoritmo tiene una complejidad de O(n^2).
     */
    public static boolean estaOrdenado(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < arreglo[i - 1]) {
                return false;
            }
        }
        return true;  // Complejidad: O(n)
    }   

    /**
     * Elimina los elementos duplicados en un arreglo de números enteros.
     * 
     * @param arreglo de números enteros.
     * @return un nuevo arreglo sin elementos duplicados.
     *         Ejemplo:
     *         Input: [1, 2, 2, 3, 4, 4, 5]
     *         Output: [1, 2, 3, 4, 5]
     * 
     *         1.0 pts : Si tu algoritmo tiene una complejidad de O(n^2).
     *         0.7 pts : Si tu algoritmo tiene una complejidad de O(n^3).
     */
    public static int[] eliminarDuplicados(int[] arreglo) {
            int[] temporal = new int[arreglo.length];
            int index = 0;
            for (int i = 0; i < arreglo.length; i++) {
                boolean encontrado = false;
                for (int j = 0; j < index; j++) {
                    if (temporal[j] == arreglo[i]) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    temporal[index++] = arreglo[i];
                }
            }
            int[] resultado = new int[index];
            System.arraycopy(temporal, 0, resultado, 0, index);
            return resultado;  // Complejidad: O(n^2)
        }    
    }

}