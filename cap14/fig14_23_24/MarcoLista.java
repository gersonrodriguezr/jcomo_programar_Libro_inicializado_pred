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
      
      // no permite selecciones múltiples
      listaJListColores.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );

      // agrega al marco un objeto JScrollPane que contiene a JList
      add( new JScrollPane( listaJListColores ) );

      listaJListColores.addListSelectionListener(
         new ListSelectionListener() // clase interna anónima
         {   
            // maneja los eventos de selección de la lista
            public void valueChanged( ListSelectionEvent evento )
            {
               getContentPane().setBackground( 
                  colores[ listaJListColores.getSelectedIndex() ] );
            } // fin del método valueChanged
         } // fin de la clase interna anónima
      ); // fin de la llamada a addListSelectionListener
   } // fin del constructor de MarcoLista
} // fin de la clase MarcoLista

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

