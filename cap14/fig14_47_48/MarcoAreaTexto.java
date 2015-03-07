// Fig. 14.47: MarcoAreaTexto.java
// Copia el texto seleccionado de un �rea de texto a otra. 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class MarcoAreaTexto extends JFrame 
{
   private JTextArea areaTexto1; // muestra cadena de demostraci�n
   private JTextArea areaTexto2; // el texto resaltado se copia aqu�
   private JButton botonCopiar; // inicia el copiado de texto

   // constructor sin argumentos
   public MarcoAreaTexto() 
   {
      super( "Demostracion de JTextArea" ); 
      Box cuadro = Box.createHorizontalBox(); // crea un cuadro
      String demo = "Esta es una cadena de\ndemostracion para\n" + 
         "ilustrar como copiar texto\nde un area de texto a \n" +
         "otra, usando un\nevento externo\n";

      areaTexto1 = new JTextArea( demo, 10, 15 ); // crea �rea de texto 1
      cuadro.add( new JScrollPane( areaTexto1 ) ); // agrega panel de desplazamiento

      botonCopiar = new JButton( "Copiar >>>" ); // crea bot�n para copiar
      cuadro.add( botonCopiar ); // agrega bot�n de copia al cuadro
      botonCopiar.addActionListener(

         new ActionListener() // clase interna an�nima
         {   
            // establece el texto en areaTexto2 con el texto seleccionado de areaTexto1
            public void actionPerformed( ActionEvent evento )
            {
               areaTexto2.setText( areaTexto1.getSelectedText() );
            } // fin del m�todo actionPerformed
         } // fin de la clase interna an�nima
      ); // fin de la llamada a addActionListener

      areaTexto2 = new JTextArea( 10, 15 ); // crea segunda �rea de texto
      areaTexto2.setEditable( false ); // deshabilita edici�n
      cuadro.add( new JScrollPane( areaTexto2 ) ); // agrega panel de desplazamiento

      add( cuadro ); // agrega cuadro al marco
   } // fin del constructor de MarcoAreaTexto
} // fin de la clase MarcoAreaTexto

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
