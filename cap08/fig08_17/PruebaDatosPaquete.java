// Fig. 8.17: PruebaDatosPaquete.java
// Los miembros con acceso a nivel de paquete de una clase son accesibles 
// para las dem�s clases en el mismo paquete.

public class PruebaDatosPaquete 
{
   public static void main( String[] args )
   {
      DatosPaquete datosPaquete = new DatosPaquete();

      // imprime la representaci�n String de datosPaquete 
      System.out.printf( "Despues de instanciar:\n%s\n", datosPaquete );

      // modifica los datos con acceso a nivel de paquete en el objeto datosPaquete
      datosPaquete.numero = 77;     
      datosPaquete.cadena = "Adios";

      // imprime la representaci�n String de datosPaquete
      System.out.printf( "\nDespues de modificar valores:\n%s\n", datosPaquete );
   } // fin de main
} // fin de la clase PruebaDatosPaquete

// clase con variables de instancia con acceso a nivel de paquete
class DatosPaquete 
{
   int numero; // variable de instancia con acceso a nivel de paquete
   String cadena; // variable de instancia con acceso a nivel de paquete

   // constructor
   public DatosPaquete() 
   { 
      numero = 0; 
      cadena = "Hola";
   } // fin del constructor de DatosPaquete

   // devuelve la representaci�n String del objeto DatosPaquete
   public String toString() 
   {
      return String.format( "numero: %d; cadena: %s", numero, cadena );
   } // fin del m�todo toString
} // fin de la clase DatosPaquete


/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
