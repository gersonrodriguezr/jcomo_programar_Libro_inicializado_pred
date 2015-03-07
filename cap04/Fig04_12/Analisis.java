// Fig. 4.12: Analisis.java
// Analisis de los resultados de un examen, utilizando instrucciones de control anidadas.
import java.util.Scanner; // esta clase utiliza la clase Scanner

public class Analisis 
{
   public static void main( String[] args ) 
   {
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      // inicializaci�n de las variables en declaraciones
      int aprobados = 0; // n�mero de aprobados
      int reprobados = 0; // n�mero de reprobados
      int contadorEstudiantes = 1; // contador de estudiantes
      int resultado; // un resultado del examen (obtiene el valor del usuario)

      // procesa 10 estudiantes, usando ciclo controlado por contador
      while ( contadorEstudiantes <= 10 ) 
      {
         // pide al usuario la entrada y obtiene el valor
         System.out.print( "Escriba el resultado (1 = aprobado, 2 = reprobado): " );
         resultado = entrada.nextInt();

         // if...else anidado en la instrucci�n while 
         if ( resultado == 1 )          // si resultado 1,
            aprobados = aprobados + 1;     // incrementa aprobados;            
         else                        // de lo contrario, resultado no es 1, por lo que
            reprobados = reprobados + 1; // incrementa reprobados
 
         // incrementa contadorEstudiantes, para que el ciclo termine en un momento dado
         contadorEstudiantes = contadorEstudiantes + 1;  
      } // fin de while

      // fase de terminaci�n; prepara y muestra los resultados
      System.out.printf( "Aprobados: %d\nReprobados: %d\n", aprobados, reprobados );
  
      // determina si m�s de 8 estudiantes aprobaron
      if ( aprobados > 8 )
         System.out.println( "Bono para el instructor!" );
   } // fin de main
} // fin de la clase Analisis

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
