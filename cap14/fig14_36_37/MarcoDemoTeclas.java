// Fig. 14.36: MarcoDemoTeclas.java
// Demostraci�n de los eventos de pulsaci�n de teclas.
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MarcoDemoTeclas extends JFrame implements KeyListener 
{
   private String linea1 = ""; // primera l�nea del �rea de texto
   private String linea2 = ""; // segunda l�nea del �rea de texto
   private String linea3 = ""; // tercera l�nea del �rea de texto
   private JTextArea areaTexto; // �rea de texto para mostrar la salida

   // constructor de MarcoDemoTeclas
   public MarcoDemoTeclas()
   {
      super( "Demostraci�n de los eventos de pulsacion de teclas" );

      areaTexto = new JTextArea( 10, 15 ); // establece el objeto JTextArea
      areaTexto.setText( "Oprima cualquier tecla en el teclado..." );
      areaTexto.setEnabled( false ); // deshabilita el �rea de texto
      areaTexto.setDisabledTextColor( Color.BLACK ); // establece el color del texto
      add( areaTexto ); // agrega areaTexto a JFrame

      addKeyListener( this ); // permite al marco procesar los eventos de teclas
   } // fin del constructor de MarcoDemoTeclas

   // maneja el evento de oprimir cualquier tecla
   public void keyPressed( KeyEvent evento )
   {
      linea1 = String.format( "Tecla oprimida: %s", 
         evento.getKeyText( evento.getKeyCode() ) ); // imprime la tecla oprimida
      establecerLineas2y3( evento ); // establece las l�neas de salida dos y tres
   } // fin del m�todo keyPressed

   // maneja el evento de liberar cualquier tecla
   public void keyReleased( KeyEvent evento )
   {
      linea1 = String.format( "Tecla liberada: %s",
         evento.getKeyText( evento.getKeyCode() ) ); // imprime la tecla liberada
      establecerLineas2y3( evento ); // establece las l�neas de salida dos y tres
   } // fin del m�todo keyReleased

   // maneja el evento de oprimir una tecla de acci�n
   public void keyTyped( KeyEvent evento )
   {
      linea1 = String.format( "Tecla oprimida: %s", evento.getKeyChar() );
      establecerLineas2y3( evento ); // establece las l�neas de salida dos y tres
   } // fin del m�todo keyTyped

   // establece las l�neas de salida dos y tres
   private void establecerLineas2y3( KeyEvent evento )
   {
      linea2 = String.format( "Esta tecla %s es una tecla de accion", 
         ( evento.isActionKey() ? "" : "no " ) );

      String temp = evento.getKeyModifiersText( evento.getModifiers() );

      linea3 = String.format( "Teclas modificadoras oprimidas: %s", 
         ( temp.equals( "" ) ? "ninguna" : temp ) ); // imprime modificadoras

      areaTexto.setText( String.format( "%s\n%s\n%s\n", 
         linea1, linea2, linea3 ) ); // imprime tres l�neas de texto
   } // fin del m�todo establecerLineas2y3
} // fin de la clase MarcoDemoTeclas


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