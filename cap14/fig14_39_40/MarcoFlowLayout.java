// Fig. 14.39: MarcoFlowLayout.java
// Demostraci�n de las alineaciones de FlowLayout.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame 
{
   private JButton botonJButtonIzquierda; // bot�n para establecer la alineaci�n a la izquierda
   private JButton botonJButtonCentro; // bot�n para establecer la alineaci�n al centro
   private JButton botonJButtonDerecha; // bot�n para establecer la alineaci�n a la derecha
   private FlowLayout esquema; // objeto esquema
   private Container contenedor; // contenedor para establecer el esquema
   
   // establece la GUI y registra los componentes de escucha de botones
   public MarcoFlowLayout()
   {
      super( "Demostracion de FlowLayout" );

      esquema = new FlowLayout(); // crea objeto FlowLayout
      contenedor = getContentPane(); // obtiene contenedor para esquema
      setLayout( esquema ); // establece el esquema del marco

      // establece botonJButtonIzquierda y registra componente de escucha
      botonJButtonIzquierda = new JButton( "Izquierda" ); // crea bot�n Izquierda
      add( botonJButtonIzquierda ); // agrega bot�n Izquierda al marco
      botonJButtonIzquierda.addActionListener(

         new ActionListener() // clase interna an�nima
         {  
            // procesa evento de botonJButtonIzquierda  
            public void actionPerformed( ActionEvent evento )
            {
               esquema.setAlignment( FlowLayout.LEFT );

               // realinea los componentes adjuntos
               esquema.layoutContainer( contenedor );
            } // fin del m�todo actionPerformed
         } // fin de la clase interna an�nima
      ); // fin de la llamada a addActionListener

      // establece botonJButtonCentro y registra componente de escucha
      botonJButtonCentro = new JButton( "Centro" ); // crea bot�n Centro
      add( botonJButtonCentro ); // agrega bot�n Centro al marco
      botonJButtonCentro.addActionListener(

         new ActionListener() // clase interna an�nima
         { 
            // procesa evento de botonJButtonCentro 
            public void actionPerformed( ActionEvent evento )
            {
               esquema.setAlignment( FlowLayout.CENTER );

               // realinea los componentes adjuntos
               esquema.layoutContainer( contenedor );
            } // fin del m�todo actionPerformed
         } // fin de la clase interna an�nima
      ); // fin de la llamada a addActionListener

      // establece botonJButtonDerecha y registra componente de escucha
      botonJButtonDerecha = new JButton( "Derecha" ); // crea bot�n Derecha
      add( botonJButtonDerecha ); // agrega bot�n Derecha al marco
      botonJButtonDerecha.addActionListener(

         new ActionListener() // clase interna an�nima
         {  
            // procesa evento de botonJButtonDerecha 
            public void actionPerformed( ActionEvent evento )
            {
               esquema.setAlignment( FlowLayout.RIGHT );

               // realinea los componentes adjuntos
               esquema.layoutContainer( contenedor );
            } // fin del m�todo actionPerformed
         } // fin de la clase interna an�nima
      ); // fin de la llamada a addActionListener
   } // fin del constructor de MarcoFlowLayout
} // fin de la clase MarcoFlowLayout


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
