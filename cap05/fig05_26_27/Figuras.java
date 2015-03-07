// Fig. 5.26: Figuras.java
// Demuestra c�mo dibujar distintas figuras.
import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel
{
   private int opcion; // opci�n del usuario acerca de cu�l figura dibujar
   
   // el constructor establece la opci�n del usuario
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
         // elije la figura con base en la opci�n del usuario
         switch ( opcion )
         {
            case 1: // dibuja rect�ngulos
               g.drawRect( 10 + i * 10, 10 + i * 10, 
                  50 + i * 10, 50 + i * 10 );
               break;
            case 2: // dibuja �valos
               g.drawOval( 10 + i * 10, 10 + i * 10, 
                  50 + i * 10, 50 + i * 10 );
               break;
         } // fin del switch
      } // fin del for
   } // fin del m�todo paintComponent
} // fin de la clase Figuras


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