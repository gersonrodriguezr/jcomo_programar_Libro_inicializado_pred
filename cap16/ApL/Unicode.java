// Fig. L.4: Unicode.java
// Cómo mostrar Unicode en pantalla.
import javax.swing.JFrame;

public class Unicode
{
   public static void main( String[] args )
   {
      UnicodeJFrame unicodeJFrame = new UnicodeJFrame();
      unicodeJFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      unicodeJFrame.setSize( 350, 250 );
      unicodeJFrame.setVisible( true );
   } // fin del método main
} // fin de la clase Unicode