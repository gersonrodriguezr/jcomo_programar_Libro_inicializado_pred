// Fig. 14.43: MarcoGridLayout.java
// Demostraci�n de GridLayout.
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoGridLayout extends JFrame implements ActionListener 
{
   private JButton[] botones; // arreglo de botones
   private final String[] nombres = 
      { "uno", "dos", "tres", "cuatro", "cinco", "seis" };
   private boolean alternar = true; // alterna entre dos esquemas
   private Container contenedor; // contenedor del marco
   private GridLayout cuadricula1; // primer objeto GridLayout
   private GridLayout cuadricula2; // segundo objeto GridLayout

   // constructor sin argumentos
   public MarcoGridLayout()
   {
      super( "Demostracion de GridLayout" );
      cuadricula1 = new GridLayout( 2, 3, 5, 5 ); // 2 por 3; espacios de 5
      cuadricula2 = new GridLayout( 3, 2 ); // 3 por 2; sin espacios
      contenedor = getContentPane(); // obtiene el panel de contenido
      setLayout( cuadricula1 ); // establece esquema de objeto JFrame
      botones = new JButton[ nombres.length ]; // crea arreglo de objetos JButton

      for ( int cuenta = 0; cuenta < nombres.length; cuenta++ )
      {
         botones[ cuenta ] = new JButton( nombres[ cuenta ] );
         botones[ cuenta ].addActionListener( this ); // registra componente de escucha
         add( botones[ cuenta ] ); // agrega boton a objeto JFrame
      } // fin de for
   } // fin del constructor de MarcoGridLayout

   // maneja eventos de boton, alternando entre los esquemas
   public void actionPerformed( ActionEvent evento )
   { 
      if ( alternar )
         contenedor.setLayout( cuadricula2 ); // establece esquema al primero
      else
         contenedor.setLayout( cuadricula1 ); // establece esquema al segundo

      alternar = !alternar; // establece alternar a su valor opuesto
      contenedor.validate(); // redistribuye el contenedor
   } // fin del m�todo actionPerformed
} // fin de la clase MarcoGridLayout

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