// Fig. 14.31: MarcoDetallesRaton.java
// Demostraci�n de los clics del rat�n y c�mo diferenciar los botones del mismo.
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MarcoDetallesRaton extends JFrame 
{
   private String detalles; // String que representa al objeto JLabel
   private JLabel barraEstado; // JLabel que aparece en la parte inferior de la ventana

   // constructor establece String de la barra de t�tulo y registra componente de escucha del rat�n
   public MarcoDetallesRaton()
   {
      super( "Clics y botones del raton" );

      barraEstado = new JLabel( "Haga clic en el raton" );
      add( barraEstado, BorderLayout.SOUTH );
      addMouseListener( new ManejadorClicRaton() ); // agrega el manejador
   } // fin del constructor de MarcoDetallesRaton

   // clase interna para manejar los eventos del rat�n
   private class ManejadorClicRaton extends MouseAdapter 
   {
      // maneja evento de clic del rat�n y determina cu�l bot�n se oprimi�
      public void mouseClicked( MouseEvent evento )
      {
         int xPos = evento.getX(); // obtiene posici�n x del rat�n
         int yPos = evento.getY(); // obtiene posici�n y del rat�n

         detalles = String.format( "Se hizo clic %d vez(veces)", 
            evento.getClickCount() );
      
         if ( evento.isMetaDown() ) // bot�n derecho del rat�n   
            detalles += " con el boton derecho del raton";
         else if ( evento.isAltDown() ) // bot�n central del rat�n
            detalles += " con el boton central del raton";
         else // bot�n izquierdo del rat�n                       
            detalles += " con el boton izquierdo del raton";

         barraEstado.setText( detalles ); // muestra mensaje en barraEstado
      } // fin del m�todo mouseClicked
   } // fin de la clase interna privada ManejadorClicRaton
} // fin de la clase MarcoDetallesRaton

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