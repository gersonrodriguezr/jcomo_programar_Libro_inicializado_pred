// Fig. 8.8: Empleado.java
// Clase Empleado con referencias a otros objetos.

public class Empleado 
{
   private String primerNombre;
   private String apellidoPaterno;
   private Fecha fechaNacimiento;
   private Fecha fechaContratacion;

   // constructor para inicializar nombre, fecha de nacimiento y fecha de contratación
   public Empleado( String nombre, String apellido, Fecha fechaDeNacimiento, 
      Fecha fechaDeContratacion )
   {
      primerNombre = nombre;
      apellidoPaterno = apellido;
      fechaNacimiento = fechaDeNacimiento;
      fechaContratacion = fechaDeContratacion;
   } // fin del constructor de Empleado

   // convierte Empleado a formato String
   public String toString()
   {
      return String.format( "%s, %s  Contratado: %s  Cumpleanios: %s", 
         apellidoPaterno, primerNombre, fechaContratacion, fechaNacimiento );
   } // fin del método toString
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
