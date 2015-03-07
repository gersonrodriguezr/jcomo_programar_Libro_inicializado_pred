// Fig. 8.12: Empleado.java
// Variable static que se utiliza para mantener una cuenta del
// número de objetos Empleado en la memoria.

public class Empleado 
{
   private String primerNombre;
   private String apellidoPaterno;
   private static int cuenta = 0; // número de objetos Empleado creados

   // inicializa empleado, suma 1 a la variable static cuenta e 
   // imprime objeto String que indica que se llamó al constructor
   public Empleado( String nombre, String apellido )
   {
      primerNombre = nombre;
      apellidoPaterno = apellido;

      ++cuenta;  // incrementa la variable static cuenta de empleados
      System.out.printf( "Constructor de Empleado: %s %s; cuenta = %d\n",
         primerNombre, apellidoPaterno, cuenta );
   } // fin de constructor de Empleado

   // obtiene el primer nombre
   public String obtenerPrimerNombre() 
   { 
      return primerNombre; 
   } // fin del método obtenerPrimerNombre

   // obtiene el apellido paterno
   public String obtenerApellidoPaterno() 
   { 
      return apellidoPaterno; 
   } // fin del método obtenerApellidoPaterno

   // método static para obtener el valor de la variable static cuenta
   public static int obtenerCuenta() 
   { 
      return cuenta; 
   } // fin del método obtenerCuenta
} // fin de la clase Empleado



/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
