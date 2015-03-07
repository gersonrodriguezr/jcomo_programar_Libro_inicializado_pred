// Fig. 5.13: PruebaContinue.java
// Instrucción continue para terminar una iteración de una instrucción for.
public class PruebaContinue 
{
   public static void main( String[] args )
   {
      for ( int cuenta = 1; cuenta <= 10; cuenta++ ) // itera 10 veces
      {  
         if ( cuenta == 5 ) // si cuenta es 5, 
            continue; // omite el resto del código en el ciclo

         System.out.printf( "%d ", cuenta );
      } // fin de for

      System.out.println( "\nSe uso continue para omitir imprimir 5" );
   } // fin de main
} // fin de la clase PruebaContinue


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