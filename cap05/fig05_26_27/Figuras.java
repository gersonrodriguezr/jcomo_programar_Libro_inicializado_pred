// Fig. 5.26: Figuras.java
// Demuestra cómo dibujar distintas figuras.
import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel
{
   private int opcion; // opción del usuario acerca de cuál figura dibujar
   
   // el constructor establece la opción del usuario
   public Figuras( int opcionUsuario )
   {
      opcion = opcionUsuario;
   } // fin del constructor de Figuras
   
   // dibuja una cascada de figuras, empezando desde la esquina superior izquierda
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      for ( int i = 0; i < 10; i++ )
      {
         // elije la figura con base en la opción del usuario
         switch ( opcion )
         {
            case 1: // dibuja rectángulos
               g.drawRect( 10 + i * 10, 10 + i * 10, 
                  50 + i * 10, 50 + i * 10 );
               break;
            case 2: // dibuja óvalos
               g.drawOval( 10 + i * 10, 10 + i * 10, 
                  50 + i * 10, 50 + i * 10 );
               break;
         } // fin del switch
      } // fin del for
   } // fin del método paintComponent
} // fin de la clase Figuras


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