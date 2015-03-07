// Fig. 14.23: MarcoLista.java
// Objeto JList que muestra una lista de colores.
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class MarcoLista extends JFrame 
{
   private JList listaJListColores; // lista para mostrar colores
   private static final String[] nombresColores = { "Negro", "Azul", "Cyan", 
      "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta",
      "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };
   private static final Color[] colores = { Color.BLACK, Color.BLUE,  
      Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,  
      Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,  
      Color.RED, Color.WHITE, Color.YELLOW };

   // El constructor de MarcoLista agrega a JFrame el JScrollPane que contiene a JList
   public MarcoLista()
   {
      super( "Prueba de JList" );
      setLayout( new FlowLayout() ); // establece el esquema del marco

      listaJListColores = new JList( nombresColores ); // crea con nombresColores
      listaJListColores.setVisibleRowCount( 5 ); // muestra cinco filas a la vez
      
      // no permite selecciones m�ltiples
      listaJListColores.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );

      // agrega al marco un objeto JScrollPane que contiene a JList
      add( new JScrollPane( listaJListColores ) );

      listaJListColores.addListSelectionListener(
         new ListSelectionListener() // clase interna an�nima
         {   
            // maneja los eventos de selecci�n de la lista
            public void valueChanged( ListSelectionEvent evento )
            {
               getContentPane().setBackground( 
                  colores[ listaJListColores.getSelectedIndex() ] );
            } // fin del m�todo valueChanged
         } // fin de la clase interna an�nima
      ); // fin de la llamada a addListSelectionListener
   } // fin del constructor de MarcoLista
} // fin de la clase MarcoLista

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

