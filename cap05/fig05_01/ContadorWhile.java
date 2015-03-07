// Fig. 5.1: ContadorWhile.java
// Repetición controlada con contador, con la instrucción de repetición while.

public class ContadorWhile 
{
   public static void main( String[] args ) 
   {      
      int contador = 1; // declara e inicializa la variable de control

      while ( contador <= 10 ) // condición de continuación de ciclo
      {
         System.out.printf( "%d  ", contador );
         ++contador; // incrementa la variable de control en 1
      } // fin de while

      System.out.println(); // imprime una nueva línea
   } // fin de main
} // fin de la clase ContadorWhile

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
