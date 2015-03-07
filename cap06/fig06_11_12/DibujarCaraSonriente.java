// Fig. 6.11: DibujarCaraSonriente.java
// Demuestra las figuras rellenas.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DibujarCaraSonriente extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      // dibuja la cara
      g.setColor( Color.YELLOW );
      g.fillOval( 10, 10, 200, 200 );
      
      // dibuja los ojos
      g.setColor( Color.BLACK );
      g.fillOval( 55, 65, 30, 30 );
      g.fillOval( 135, 65, 30, 30 );
      
      // dibuja la boca
      g.fillOval( 50, 110, 120, 60 );
      
      // convierte la boca en una sonrisa
      g.setColor( Color.YELLOW );
      g.fillRect( 50, 110, 120, 30 );
      g.fillOval( 50, 120, 120, 40 );
   } // fin del m�todo paintComponent
} // fin de la clase DibujarCaraSonriente


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
