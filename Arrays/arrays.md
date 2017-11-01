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

Ejemplos:

`nombre`