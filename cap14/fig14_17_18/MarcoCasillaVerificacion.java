// Fig. 14.17: MarcoCasillaVerificacion.java
// Creación de botones JCheckBox.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
 
public class MarcoCasillaVerificacion extends JFrame 
{
   private JTextField campoTexto; // muestra el texto en tipos de letra cambiantes
   private JCheckBox negritaJCheckBox; // para seleccionar/deseleccionar negrita
   private JCheckBox cursivaJCheckBox; // para seleccionar/deseleccionar cursiva
 
   // El constructor de MarcoCasillaVerificacion agrega objetos JCheckBox a JFrame
   public MarcoCasillaVerificacion()
   {
      super( "Prueba de JCheckBox" );
      setLayout( new FlowLayout() ); // establece el esquema del marco
 
      // establece JTextField y su tipo de letra
      campoTexto = new JTextField( "Observe como cambia el estilo de tipo de letra", 27 ); 
      campoTexto.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
      add( campoTexto ); // agrega campoTexto a JFrame

      negritaJCheckBox = new JCheckBox( "Negrita" ); // crea casilla de verificación "negrita"
      cursivaJCheckBox = new JCheckBox( "Cursiva" ); // crea casilla de verificación "cursiva"
      add( negritaJCheckBox ); // agrega casilla de verificación "negrita" a JFrame
      add( cursivaJCheckBox ); // agrega casilla de verificación "cursiva" a JFrame
  
      // registra componentes de escucha para objetos JCheckBox
      ManejadorCheckBox manejador = new ManejadorCheckBox();
      negritaJCheckBox.addItemListener( manejador );
      cursivaJCheckBox.addItemListener( manejador );
   } // fin del constructor de MarcoCasillaVerificacion

   // clase interna privada para el manejo de eventos ItemListener
   private class ManejadorCheckBox implements ItemListener 
   {
      // responde a los eventos de casilla de verificación
      public void itemStateChanged( ItemEvent evento )
      {
         Font tipoletra = null; // almacena el nuevo objeto Font

         // determina cuales objetos CheckBox están seleccionados y crea el objeto Font
         if ( negritaJCheckBox.isSelected() && cursivaJCheckBox.isSelected() )
            tipoletra = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
         else if ( negritaJCheckBox.isSelected() )
   	    tipoletra = new Font( "Serif", Font.BOLD, 14 );
         else if ( cursivaJCheckBox.isSelected() )
    	    tipoletra = new Font( "Serif", Font.ITALIC, 14 );
         else
 	    tipoletra = new Font( "Serif", Font.PLAIN, 14 );

         campoTexto.setFont( tipoletra ); // establece el tipo de letra del campo de texto
      } // fin del método itemStateChanged
   } // fin de la clase interna privada ManejadorCheckBox
} // fin de la clase MarcoCasillaVerificacion

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