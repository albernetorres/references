/**
* @author León Alberne Torres Restrepo
* @version 0.0.1
* @since 1-nov-2017
*/

/**
* <h1> Clase Vector</h1>
*
*Esta es una clase que muestra una forma de realizar las operaciones basicas en el manejo de vectores
 */
public class Vector{



    public static void main(String args[]){
        int numero[]; // Declaracion de una variable numero de tipo vector
        numero = new int[10]; // inicializacion de la variable numero con diez posiciones

       numero= llenarVectorEnteros(numero);
       mostrarElementosVector(numero);
        
    }

/**
* Metodo llenarVectorEnteros, inicializa un vector con los n primeros enteros empezando desde 1, n es el tamaño del vector
* @param vector: variable de tipo vector que se desea inicializar 
* @return vector: Retorna el mismo vector, pero inicializado.
*/
    public static int[] llenarVectorEnteros(int [] vector){

        for (int i=0; i<vector.length; i++){
            vector[i]= i+1;
        }
        return vector;
    }


/**
* Metodo mostrarElementosVector, visualiza todos los elementos de un vector con datos primitivos
* @param vector: variable de tipo vector que se desea mostrar sus elementos 
* 
*/
    public static void mostrarElementosVector(int [] vector){

        for (int i=0; i<vector.length; i++){
            System.out.println(vector[i]);
        }       
    }

}