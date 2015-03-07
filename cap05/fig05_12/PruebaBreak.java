// Fig. 5.12: PruebaBreak.java
// La instrucción break para salir de una instrucción for.
public class PruebaBreak 
{
   public static void main( String[] args )
   {
      int cuenta; // la variable de control también se usa cuando termina el ciclo
      
      for ( cuenta = 1; cuenta <= 10; cuenta++ ) // itera 10 veces
      {  
         if ( cuenta == 5 ) // si cuenta es 5, 
            break;         // termina el ciclo

         System.out.printf( "%d ", cuenta );
      } // fin de for

      System.out.printf( "\nSalio del ciclo en cuenta = %d\n", cuenta );
   } // fin de main
} // fin de la clase PruebaBreak


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