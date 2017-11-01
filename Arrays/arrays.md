# ARRAYS

Los arrays son una estructura de datos que funciona como una estanteria la cual tiene varios compartimentos, dependiendo del lenguaje estas cajas pueden ser de uso especializado o uso generico. De uso especializado, quiere decir que la informacion que cada uno de los compartimentos tiene son de un mismo tipo (tosdos son numeros enteros, o numeros reales, o caracteres, etc); en los compartimentos genericos la informacion contenida puede ser de varios tipos. Segun sea la literatura que se este revisando, se puede utilizar la parabra **array** o **vector**, sin embargo se refieren al mismo concepto, en este documento se utilizaran indistintamente.

## Array en Java.

En primer lugar hay que tener en cuenta que java es un lenguaje tipado, esto implica que los array solo pueden contener datos de un mismo tipo.

Para declarar un array en java se puede utilizar la siguiente sintaxis:

` tipo_dato nombre_variable [];`

* tipo_dato: Indica el tipo de informacion que se desea guardar en el vector (int, bool, double, Object, etc).

* nombre_variable: nombre con el cual se identificara el vector.

Ejemplos:

`String nombre[]; int numeros[]; Persona[] usuarios;`

El comando anterior solo le indica al compilador que utilizaremos una variable de tipo array o vector que es de un tipo especifico y tiene el nombre indicado, pero aun no puede ser utilizada. Para poder utilizar la variable antes debemos inicializarla, la sintaxis es la siguiente:

`nombre_variable = new tipo_dato [num_elementos];`

* num_elementos: Numero de elementos que deseo almacenar en el array. 

Nota: Es importante tener en cuenta que los array en JAVA son estructuras estaticas, lo que significa que una vez definido su tamaño, no se pueden redimensionar. Al definir un array se debe tener en cuanta su tamaño, de tal forma que pueda almacenar la informacion que deseamos, sin caer en el error de crearlo de un tamaño demasiado grande, porque en dado caso, estariamos ocupando memoria de forma innecesaria y desmejorando el rendimiento del equipo.

Ejemplos:

```
nombre = new String[20]; // Puede almacenar hasta 20 nombres 
numeros= new int[100]; //puede almacenar hasta 100 numeros enteros
usuarios= new Persona[50] // puede almacenar hasta 50 objetos de tipo persona
```

Tambien es posible declarar e inicializar una variable en una sola sentencia, la sintaxis es: 

``tipo_dato nombre_variable [] = new tipo_dato [num_elementos];``

Ejemplo:

``int numeros[]= new int[10] // Define e inicializa un vector de numeros enteros de 10 posiciones``

Para conocer el tamaño de un array utilizamos la propiedad `.length`, la sintaxis es la siguiente:

``nombre_vector.length``

ejemplo:

```
...
int numeros[]= new int[10] // Define e inicializa un vector de numeros enteros de 10 posiciones
System.out.println(numeros.length) // imprime el numero de posiciones del vector numeros;
...
```

### Recorrer un vector con un ciclo for

Para recorrer un vector con un ciclo for se puede utilizar el siguiente codigo.

```

for(int i=0; i<nombre_vector.length; +++ ){
           // código 
           System.out.println("El dato en la posicion: " + (i+1) + " es " numero[i]); //Muestra todos los elementos contenidos en el array
        }
```

En el caso de ser objetos, el codigo es el siguiente:

```

for(int i=0; i<nombre_vector.length; +++ ){
           // código 
           System.out.println("El dato en la posicion: " + (i+1) + " es " numero[i].atributo); //El atributo especificado de cada uno de los objetos contenidos en el array
        }
```

En el siguiente ejemplo se muestra una clase basica que permite inicializar y visualizar un vector de enteros.

```
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
* @param vector: variable de tipo vector del que se desea mostrar sus elementos
* 
*/
    public static void mostrarElementosVector(int [] vector){

        for (int i=0; i<vector.length; i++){
            System.out.println(vector[i]);
        }       
    }

}

```