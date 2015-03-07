// Fig. 14.25: MarcoSeleccionMultiple.java
// Copiar elementos de un objeto List a otro.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MarcoSeleccionMultiple extends JFrame 
{
   private JList listaJListColores; // lista para guardar los nombres de los colores
   private JList listaJListCopia; // lista en la que se van a copiar los nombres de los colores
   private JButton botonJButtonCopiar; // botón para copiar los nombres seleccionados
   private final String[] nombresColores = { "Negro", "Azul", "Cyan", 
      "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta", "Naranja", 
      "Rosa", "Rojo", "Blanco", "Amarillo" };

   // Constructor de MarcoSeleccionMultiple
   public MarcoSeleccionMultiple()
   {
      super( "Listas de seleccion multiple" );
      setLayout( new FlowLayout() ); // establece el esquema del marco

      listaJListColores = new JList( nombresColores ); // contiene nombres de todos los colores
      listaJListColores.setVisibleRowCount( 5 ); // muestra cinco filas
      listaJListColores.setSelectionMode( 
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
      add( new JScrollPane( listaJListColores ) ); // agrega lista con panel de desplazamiento

      botonJButtonCopiar = new JButton( "Copiar >>>" ); // crea botón para copiar
      botonJButtonCopiar.addActionListener(

         new ActionListener() // clase interna anónima 
         {  
            // maneja evento de botón
            public void actionPerformed( ActionEvent evento )
            {
               // coloca los valores seleccionados en listaJListCopia
               listaJListCopia.setListData( listaJListColores.getSelectedValues() );
            } // fin del método actionPerformed
         } // fin de la clase interna anónima
      ); // fin de la llamada a addActionListener

      add( botonJButtonCopiar ); // agrega el botón copiar a JFrame

      listaJListCopia = new JList(); // crea lista para guardar nombres de colores copiados
      listaJListCopia.setVisibleRowCount( 5 ); // muestra 5 filas
      listaJListCopia.setFixedCellWidth( 100 ); // establece la anchura
      listaJListCopia.setFixedCellHeight( 15 ); // establece la altura
      listaJListCopia.setSelectionMode( 
         ListSelectionModel.SINGLE_INTERVAL_SELECTION );
      add( new JScrollPane( listaJListCopia ) ); // agrega lista con panel de desplazamiento
   } // fin del constructor de MarcoSeleccionMultiple
} // fin de la clase MarcoSeleccionMultiple


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


