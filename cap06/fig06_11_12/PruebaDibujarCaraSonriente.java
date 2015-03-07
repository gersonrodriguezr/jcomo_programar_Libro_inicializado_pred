// Fig. 6.12: PruebaDibujarCaraSonriente.java
// Aplicación de prueba que muestra una cara sonriente.
import javax.swing.JFrame;

public class PruebaDibujarCaraSonriente
{
   public static void main( String[] args )
   {
      DibujarCaraSonriente panel = new DibujarCaraSonriente();      
      JFrame aplicacion = new JFrame();
      
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      aplicacion.add( panel );
      aplicacion.setSize( 230, 250 );      
      aplicacion.setVisible( true );
   } // fin de main
} // fin de la clase PruebaDibujarCaraSonriente


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

