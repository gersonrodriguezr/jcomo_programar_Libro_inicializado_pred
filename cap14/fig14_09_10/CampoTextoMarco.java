// Fig. 14.9: CampoTextoMarco.java
// Demostraci�n de la clase JTextField.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class CampoTextoMarco extends JFrame 
{
   private JTextField campoTexto1; // campo de texto con tama�o fijo
   private JTextField campoTexto2; // campo de texto construido con texto
   private JTextField campoTexto3; // campo de texto con texto y tama�o
   private JPasswordField campoContrasenia; // campo de contrase�a con texto

   // El constructor de CampoTextoMarco agrega objetos JTextField a JFrame
   public CampoTextoMarco()
   {
      super( "Prueba de JTextField y JPasswordField" );
      setLayout( new FlowLayout() ); // establece el esquema del marco

      // construye campo de texto con 10 columnas
      campoTexto1 = new JTextField( 10 ); 
      add( campoTexto1 ); // agrega campoTexto1 a JFrame

      // construye campo de texto con texto predeterminado
      campoTexto2 = new JTextField( "Escriba el texto aqui" );
      add( campoTexto2 ); // agrega campoTexto2 a JFrame

      // construye campo de texto con texto predeterminado y 21 columnas
      campoTexto3 = new JTextField( "Campo de texto no editable", 21 );
      campoTexto3.setEditable( false ); // deshabilita la edici�n
      add( campoTexto3 ); // agrega campoTexto3 a JFrame

      // construye campo de contrase�a con texto predeterminado
      campoContrasenia = new JPasswordField( "Texto oculto" );
      add( campoContrasenia ); // agrega campoContrasenia a JFrame

      // registra los manejadores de eventos
      ManejadorCampoTexto manejador = new ManejadorCampoTexto();
      campoTexto1.addActionListener( manejador );
      campoTexto2.addActionListener( manejador );
      campoTexto3.addActionListener( manejador );
      campoContrasenia.addActionListener( manejador );
   } // fin del constructor de CampoTextoMarco

   // clase interna privada para el manejo de eventos
   private class ManejadorCampoTexto implements ActionListener 
   {
      // procesa los eventos de campo de texto
      public void actionPerformed( ActionEvent evento )
      {
         String cadena = ""; // declara la cadena a mostrar

         // el usuario oprimi� Intro en el objeto JTextField campoTexto1
         if ( evento.getSource() == campoTexto1 )
            cadena = String.format( "campoTexto1: %s",
               evento.getActionCommand() );

         // el usuario oprimi� Intro en el objeto JTextField campoTexto2
         else if ( evento.getSource() == campoTexto2 )
            cadena = String.format( "campoTexto2: %s",
               evento.getActionCommand() );

         // el usuario oprimi� Intro en el objeto JTextField campoTexto3
         else if ( evento.getSource() == campoTexto3 )
            cadena = String.format( "campoTexto3: %s", 
               evento.getActionCommand() );

         // el usuario oprimi� Intro en el objeto JTextField campoContrasenia
         else if ( evento.getSource() == campoContrasenia )
            cadena = String.format( "campoContrasenia: %s", 
               new String( campoContrasenia.getPassword() ) );

         // muestra el contenido del objeto JTextField
         JOptionPane.showMessageDialog( null, cadena ); 
      } // fin del m�todo actionPerformed
   } // fin de la clase interna privada ManejadorCampoTexto
} // fin de la clase CampoTextoMarco

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