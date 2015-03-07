// Fig 9.13: DemoLabel.java
// Demuestra el uso de etiquetas.
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class DemoLabel
{
   public static void main( String[] args )
   {
      // Crea una etiqueta con texto solamente
      JLabel etiquetaNorte = new JLabel( "Norte" );
      
      // crea un ícono a partir de una imagen, para poder colocarla en un objeto JLabel
      ImageIcon etiquetaIcono = new ImageIcon( "GUItip.gif" );
      
      // crea una etiqueta con un icono en vez de texto
      JLabel etiquetaCentro = new JLabel( etiquetaIcono );
      
      // crea otra etiqueta con un icono
      JLabel etiquetaSur = new JLabel( etiquetaIcono );
      
      // establece la etiqueta para mostrar texto (así como un icono)
      etiquetaSur.setText( "Sur" );
      
       // crea un marco para contener las etiquetas
      JFrame aplicacion = new JFrame();
      
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      // agrega las etiquetas al marco; el segundo argumento especifica
      // en que parte del marco se va a agregar la etiqueta 
      aplicacion.add( etiquetaNorte, BorderLayout.NORTH );
      aplicacion.add( etiquetaCentro, BorderLayout.CENTER );      
      aplicacion.add( etiquetaSur, BorderLayout.SOUTH );      

      aplicacion.setSize( 300, 300 ); // establece el tamaño del marco
      aplicacion.setVisible( true ); // muestra el marco
   } // fin de main
} // fin de la clase DemoLabel


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
