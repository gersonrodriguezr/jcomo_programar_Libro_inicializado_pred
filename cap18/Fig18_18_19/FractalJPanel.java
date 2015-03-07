// Fig. 18.19: FractalJPanel.java
// C�mo dibujar el "fractal Lo" mediante recursividad.
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class FractalJPanel extends JPanel
{
   private Color color; // almacena el color utilizado para dibujar el fractal
   private int nivel;   // almacena el nivel actual del fractal

   private final int ANCHURA = 400;  // define la anchura de JPanel
   private final int ALTURA = 400; // define la altura de JPanel

   // establece el nivel inicial del fractal al valor especificado
   // y establece las especificaciones del JPanel
   public FractalJPanel( int nivelActual )
   {
      color = Color.BLUE;  // inicializa el color de dibujo en azul
      nivel = nivelActual; // establece el nivel inicial del fractal
      setBackground( Color.WHITE );
      setPreferredSize( new Dimension( ANCHURA, ALTURA ) );
   } // fin del constructor de FractalJPanel

   // dibuja el fractal en forma recursiva
   public void dibujarFractal( int nivel, int xA, int yA, int xB, 
      int yB, Graphics g )
   {
      // caso base: dibuja una l�nea que conecta dos puntos dados
      if ( nivel == 0 ) 
         g.drawLine( xA, yA, xB, yB );
      else // paso recursivo: determina los nuevos puntos, dibuja el siguiente nivel
      {	
         // calcula punto medio entre (xA, yA) y (xB, yB)
         int xC = ( xA + xB ) / 2;
         int yC = ( yA + yB ) / 2;

         // calcula el cuarto punto (xD, yD) que forma un 
         // tri�ngulo recto is�sceles entre (xA, yA) y (xC, yC) 
         // en donde el �ngulo recto est� en (xD, yD)
         int xD = xA + ( xC - xA ) / 2 - ( yC - yA ) / 2;
         int yD = yA + ( yC - yA ) / 2 + ( xC - xA ) / 2;
         
         // dibuja el Fractal en forma recursiva
         dibujarFractal( nivel - 1, xD, yD, xA, yA, g );
         dibujarFractal( nivel - 1, xD, yD, xC, yC, g );
         dibujarFractal( nivel - 1, xD, yD, xB, yB, g );  
      } // fin de else
   } // fin del m�todo dibujarFractal

   // inicia el dibujo del fractal
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      // dibuja el patr�n del fractal
      g.setColor( color );
      dibujarFractal( nivel, 100, 90, 290, 200, g ); 
   } // fin del m�todo paintComponent

   // establece el color de dibujo a c
   public void establecerColor( Color c )
   {
      color = c;
   } // fin del m�todo establecerColor
    
   // establece el nuevo nivel de recursividad
   public void establecerNivel( int nivelActual )
   {
      nivel = nivelActual;
   } // fin del m�todo establecerNivel

   // devuelve el nivel de recursividad 
   public int obtenerNivel()
   {
      return nivel;
   } // fin del m�todo obtenerNivel
}; // fin de la clase FractalJPanel

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