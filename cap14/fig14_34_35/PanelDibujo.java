// Fig. 14.34: PanelDibujo.java
// Uso de la clase MouseMotionAdapter.
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel 
{
   private int cuentaPuntos = 0; // cuenta el n�mero de puntos

   // arreglo de 10000 referencias a java.awt.Point
   private Point[] puntos = new Point[ 10000 ];  

   // establece la GUI y registra el manejador de eventos del rat�n
   public PanelDibujo()
   {
      // maneja evento de movimiento del rat�n en el marco
      addMouseMotionListener(

         new MouseMotionAdapter() // clase interna an�nima
         {  
            // almacena las coordenadas de arrastre y vuelve a dibujar
            public void mouseDragged( MouseEvent evento )
            {
               if ( cuentaPuntos < puntos.length ) 
               {
                  puntos[ cuentaPuntos ] = evento.getPoint(); // busca el punto
                  cuentaPuntos++; // incrementa el n�mero de puntos en el arreglo
                  repaint(); // vuelve a dibujar JFrame
               } // fin de if
            } // fin del m�todo mouseDragged
         } // fin de la clase interna an�nima
      ); // fin de la llamada a addMouseMotionListener
   } // fin del constructor de PanelDibujo

   // dibuja un �valo en un cuadro delimitador de 4 x 4, en la ubicaci�n especificada en la ventana
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // borra el �rea de dibujo

      // dibuja todos los puntos en el arreglo
      for ( int i = 0; i < cuentaPuntos; i++ )
         g.fillOval( puntos[ i ].x, puntos[ i ].y, 4, 4 );
   } // fin del m�todo paint
} // fin de la clase PanelDibujo


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