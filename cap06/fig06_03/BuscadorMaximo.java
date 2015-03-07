// Fig. 6.3: BuscadorMaximo.java
// M�todo maximo, declarado por el programador, con tres par�metros double.
import java.util.Scanner;

public class BuscadorMaximo 
{
   // obtiene tres valores de punto flotante y determina el valor m�ximo
   public static void main( String[] args ) 
   {
      // crea objeto Scanner para introducir datos desde la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      // pide y recibe como entrada tres valores de punto flotante
      System.out.print( 
         "Escriba tres valores de punto flotante, separados por espacios: " );
      double numero1 = entrada.nextDouble(); // lee el primer valor double
      double numero2 = entrada.nextDouble(); // lee el segundo valor double
      double numero3 = entrada.nextDouble(); // lee el tercer valor double

      // determina el valor m�ximo
      double resultado = maximo( numero1, numero2, numero3 ); 

      // muestra el valor m�ximo
      System.out.println( "El maximo es: " + resultado ); 
   } // fin de main

   // devuelve el m�ximo de sus tres par�metros double
   public static double maximo( double x, double y, double z )
   {
      double valorMaximo = x; // asume que x es el mayor para empezar

      // determina si y es mayor que valorMaximo
      if ( y > valorMaximo )
         valorMaximo = y; 

      // determina si z es mayor que valorMaximo
      if ( z > valorMaximo )
         valorMaximo = z;

      return valorMaximo;
   } // fin del m�todo maximo
} // fin de la clase BuscadorMaximo

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
