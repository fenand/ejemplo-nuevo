import java.util.Random;
import java.util.ArrayList;

/**
 * Clase que nos permite seleccionar uno o varios alumnos 
 * aleatoriamente de entre un listado de ellos
 */
public class SelectorAlumno
{
    private ArrayList<String> alumnos;

    /** 
     * Constructor de la clase
     */
    public SelectorAlumno()
    {
        alumnos = new ArrayList<String>();
    }

    /**
     * Añade un alumno
     */
    public void agregarAlumno(String nombreAlumno) 
    {
        alumnos.add(nombreAlumno);
    }

    /**
     * Muestra por pantalla los alumnos añadidos uno por linea
     */
    public void verListadoAlumnos()
    {
        int contadorListado = 1;
        for(String listado : alumnos){

            System.out.println(contadorListado +" "+ alumnos);
            contadorListado ++;
        }
    }

    /** 
     * Muestra por pantalla un alumno aleatoriamente. En caso de no haber alumnos
     * no muestra ninguno e informa del error.
     */
    public void seleccionarAlumnoAleatoriamente()
    {
        // // comprobamos si hay alumnos
        // if(alumnos.size() !=0){
        // // si lo hay,sacamos un numero aleatorio y lo guardamos en una variable
        // //creamos un objeto de la clase random nuevo de java.util
        // Random.objetoRandom = new Random();
        // // nextint 7 saca datos aleatoriia entre el 0 y el 7 exluyendo el 7
        // int posicionAleatoria = objetoRandom.nextInt(alumnos.size());

        // //guardamos en una variable el elemento que esta en la posicion obtenida

        // String nombreAlumno = alumnos.get(posicionAleatoria);
        // //imprime por pantalla la variable
        // System.out.println(nombreAlumno);
        // }
        // else{
        // //si no los hay, que aparezca un mensaje de error

        // System.out.println("No hay alumnos");
        // }

        //Comprobamos si hay alumnos
        if (alumnos.size() != 0 ) {
            //Si los hay, sacamos un numero aleatorio y lo guardamos en una variable
            Random objetoRandom = new Random();
            int posicionAleatoria = objetoRandom.nextInt(alumnos.size());

            // Imprime por pantalla el nombre del alumno escogido
            System.out.println(alumnos.get(posicionAleatoria));
        }
        else {
            //Si no los hay, que aparezca un mensaje de error
            System.out.println("No hay candidatos");
        }

    }

    /**
     * Muestra por pantalla n alumnos seleccionados aleato
     * riamente. En caso de no haber 
     * alumnos suficientes no muestra ninguno e informa del error.
     */
    public void seleccionarNAlumnosAleatoriamente(int numeroAlumnosASeleccionar)
    // {

    // comprobamos si hay suficientes alumnos en funcion de los que tenemos que escoger
    // if(alumnos.size() >= numeroAlumnosASeleccionar){

    // si hay suficienes alumnos
    // int contadorDeAlumnos = 0;
    // while(contadorDeAlumnos < numeroAlumnosASeleccionar){

    // sacamos el numero aleatorio y lo guardamos en una variable
    // Random objetoRandom = new Random();
    // imprimimos por pantalla el nombre del alumno escogido
    // System.out.println(alumnos.get(posicionAleatoria));
    // contadorDeAlumnos ++;

    // }
    // }
    // else{
    // si no ay suficientes aumnos,mostras un error
    // System.out.println("Cantidad de alumnos invalida o lista vacia");
    // }

    // }
    {
        //Comprobamos si hay suficientes alumnos en funcion de los que tenemos que escoger
        if (alumnos.size() >= numeroAlumnosASeleccionar){

            //Si hay suficientes alumnos iteramos tantas veces como numero de alumnos queramos
            int contador = 0;
            while(contador<numeroAlumnosASeleccionar)
            {
                //Sacamos un numero aleatorio y lo guardamos en una variable
                Random objetoRandom = new Random();
                int posicionAleatoria = objetoRandom.nextInt(alumnos.size());

                //Imprime por pantalla el nombre del alumno escogido
                System.out.println(alumnos.get(posicionAleatoria));
                //eliminar el nombre sacado para que no vuelva a salir
                
                alumnos.remove(posicionAleatoria);
                contador++;
            }
        }
        else {
            //Si no hay suficientes alumnos, mostramos un error
            System.out.println("Cantidad de alumnos invalida o lista vacia");
        }

    }
}
