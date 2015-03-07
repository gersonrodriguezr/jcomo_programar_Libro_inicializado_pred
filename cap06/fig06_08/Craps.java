// Fig. 6.8: Craps.java
// La clase Craps simula el juego de dados "craps".
import java.util.Random;

public class Craps 
{
   // crea un generador de números aleatorios para usarlo en el método tirarDado
   private static final Random numerosAleatorios = new Random(); 

   // enumeración con constantes que representan el estado del juego
   private enum Estado { CONTINUA, GANO, PERDIO };

   // constantes que representan tiros comunes del dado
   private static final int DOS_UNOS = 2;
   private static final int TRES = 3;
   private static final int SIETE = 7;
   private static final int ONCE = 11;
   private static final int DOCE = 12;

   // ejecuta un juego de craps
   public static void main( String[] args )
   {
      int miPunto = 0; // punto si no gana o pierde en el primer tiro
      Estado estadoJuego; // puede contener CONTINUA, GANO o PERDIO

      int sumaDeDados = tirarDados(); // primer tiro de los dados

      // determina el estado del juego y el punto con base en el primer tiro
      switch ( sumaDeDados ) 
      {
         case SIETE: // gana con 7 en el primer tiro
         case ONCE: // gana con 11 en el primer tiro 
            estadoJuego = Estado.GANO;
            break;
         case DOS_UNOS: // pierde con 2 en el primer tiro
         case TRES: // pierde con 3 en el primer tiro
         case DOCE: // pierde con 12 en el primer tiro
            estadoJuego = Estado.PERDIO;
            break;
         default: // no ganó ni perdió, por lo que guarda el punto 
            estadoJuego = Estado.CONTINUA; // no ha terminado el juego
            miPunto = sumaDeDados; // guarda el punto
            System.out.printf( "El punto es %d\n", miPunto );
            break; // opcional al final del switch
      } // fin de switch 

      // mientras el juego no esté terminado
      while ( estadoJuego == Estado.CONTINUA ) // no GANO ni PERDIO
      { 
         sumaDeDados = tirarDados(); // tira los dados de nuevo

         // determina el estado del juego
         if ( sumaDeDados == miPunto ) // gana haciendo un punto
            estadoJuego = Estado.GANO;
         else
            if ( sumaDeDados == SIETE ) // pierde al tirar 7 antes del punto
               estadoJuego = Estado.PERDIO;
      } // fin de while 

      // muestra mensaje de que ganó o perdió
      if ( estadoJuego == Estado.GANO )
         System.out.println( "El jugador gana" );
      else
         System.out.println( "El jugador pierde" );
   } // fin del método jugar

   // tira los dados, calcula la suma y muestra los resultados
   public static int tirarDados()
   {
      // elige valores aleatorios para los dados
      int dado1 = 1 + numerosAleatorios.nextInt( 6 ); // primer tiro del dado
      int dado2 = 1 + numerosAleatorios.nextInt( 6 ); // segundo tiro del dado
      int suma = dado1 + dado2; // suma de los valores de los dados

      // muestra los resultados de este tiro
      System.out.printf( "El jugador tiro %d + %d = %d\n", 
         dado1, dado2, suma );

      return suma; // devuelve la suma de los dados
   } // find el método tirarDados
} // fin de la clase Craps

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

