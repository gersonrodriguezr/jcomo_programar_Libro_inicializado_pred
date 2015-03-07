// Fig. L.3: UnicodeJFrame.java
// Demostración de cómo usar Unicode en programas de Java.
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnicodeJFrame extends JFrame
{
   // el constructor crea componentes JLabel para mostrar Unicode
   public UnicodeJFrame()
   {
      super ( "Demostración de Unicode" );
   
      setLayout( new GridLayout( 8, 1 ) );  // establece esquema de marco

      // crea componentes JLabel que usan Unicode
      JLabel inglesJLabel = new JLabel( "\u0057\u0065\u006C\u0063\u006F" +
         "\u006D\u0065\u0020\u0074\u006F\u0020Unicode\u0021" );
      inglesJLabel.setToolTipText( "Esto es inglés" );
      add( inglesJLabel );

      JLabel chinoJLabel = new JLabel( "\u6B22\u8FCE\u4F7F\u7528" +
         "\u0020\u0020Unicode\u0021" );
      chinoJLabel.setToolTipText( "Esto es chino tradicional" );
      add( chinoJLabel );
      
      JLabel cirilicoJLabel = new JLabel( "\u0414\u043E\u0431\u0440" +
         "\u043E\u0020\u043F\u043E\u0436\u0430\u043B\u043E\u0432" +
	 "\u0430\u0442\u044A\u0020\u0432\u0020Unicode\u0021" );
      cirilicoJLabel.setToolTipText( "Esto es ruso" );
      add( cirilicoJLabel );

      JLabel francesJLabel = new JLabel( "\u0042\u0069\u0065\u006E\u0076" +
         "\u0065\u006E\u0075\u0065\u0020\u0061\u0075\u0020Unicode\u0021"); 
      francesJLabel.setToolTipText( "Esto es francés" );
      add( francesJLabel );
      
      JLabel alemanJLabel = new JLabel( "\u0057\u0069\u006C\u006B\u006F" +
         "\u006D\u006D\u0065\u006E\u0020\u007A\u0075\u0020Unicode\u0021" );
      alemanJLabel.setToolTipText( "Esto es alemán" );
      add( alemanJLabel );
        
      JLabel japonesJLabel = new JLabel( "Unicode\u3078\u3087\u3045" +
         "\u3053\u305D\u0021" );
      japonesJLabel.setToolTipText( "Esto es japonés" );
      add( japonesJLabel );

      JLabel portuguesJLabel = new JLabel( "\u0053\u00E9\u006A\u0061" +
 	 "\u0020\u0042\u0065\u006D\u0076\u0069\u006E\u0064\u006F\u0020" +
         "Unicode\u0021" );
      portuguesJLabel.setToolTipText( "Esto es portugués" );
      add( portuguesJLabel );

      JLabel espaniolJLabel = new JLabel( "\u0042\u0069\u0065\u006E" +
         "\u0076\u0065\u006E\u0069\u0064\u0061\u0020\u0061\u0020" +
         "Unicode\u0021" );
      espaniolJLabel.setToolTipText( "Esto es español" );
      add( espaniolJLabel );
    } // fin del constructor de Unicode
} // fin de la clase UnicodeJFrame      
