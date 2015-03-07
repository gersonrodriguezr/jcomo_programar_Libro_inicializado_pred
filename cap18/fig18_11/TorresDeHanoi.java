// Fig. 18.11: TorresDeHanoi.java
// Solución de las torres de Hanoi con un método recursivo.
public class TorresDeHanoi
{
   // mueve discos de una torre a otra, de manera recursiva
   public static void resolverTorres( int discos, int agujaOrigen, 
      int agujaDestino, int agujaTemp )
   {
      // caso base -- sólo hay que mover un disco
      if ( discos == 1 )
      {
         System.out.printf( "\n%d --> %d", agujaOrigen, agujaDestino );
         return;
      } // fin de if

      // paso recursivo -- mueve (disco - 1) discos de agujaOrigen
      // a agujaTemp usando agujaDestino
      resolverTorres( discos - 1, agujaOrigen, agujaTemp, agujaDestino );

      // mueve el último disco de agujaOrigen a agujaDestino
      System.out.printf( "\n%d --> %d", agujaOrigen, agujaDestino );

      // mueve ( discos - 1 ) discos de agujaTemp a agujaDestino
      resolverTorres( discos - 1, agujaTemp, agujaDestino, agujaOrigen );
   } // fin del método resolverTorres

   public static void main( String[] args )
   {
      int agujaInicial = 1;   // se usa el valor 1 para indicar agujaInicial en la salida
      int agujaFinal = 3;     // se usa el valor 3 para indicar agujaFinal en la salida
      int agujaTemp = 2;    // se usa el valor 2 para indicar agujaTemp en la salida
      int totalDiscos = 3; // número de discos

      // llamada no recursiva inicial: mueve todos los discos.
      resolverTorres( totalDiscos, agujaInicial, agujaFinal, agujaTemp );
   } // fin de main
} // fin de la clase TorresDeHanoi

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