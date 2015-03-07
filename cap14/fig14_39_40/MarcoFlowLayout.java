// Fig. 14.39: MarcoFlowLayout.java
// Demostración de las alineaciones de FlowLayout.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame 
{
   private JButton botonJButtonIzquierda; // botón para establecer la alineación a la izquierda
   private JButton botonJButtonCentro; // botón para establecer la alineación al centro
   private JButton botonJButtonDerecha; // botón para establecer la alineación a la derecha
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
      botonJButtonIzquierda = new JButton( "Izquierda" ); // crea botón Izquierda
      add( botonJButtonIzquierda ); // agrega botón Izquierda al marco
      botonJButtonIzquierda.addActionListener(

         new ActionListener() // clase interna anónima
         {  
            // procesa evento de botonJButtonIzquierda  
            public void actionPerformed( ActionEvent evento )
            {
               esquema.setAlignment( FlowLayout.LEFT );

               // realinea los componentes adjuntos
               esquema.layoutContainer( contenedor );
            } // fin del método actionPerformed
         } // fin de la clase interna anónima
      ); // fin de la llamada a addActionListener

      // establece botonJButtonCentro y registra componente de escucha
      botonJButtonCentro = new JButton( "Centro" ); // crea botón Centro
      add( botonJButtonCentro ); // agrega botón Centro al marco
      botonJButtonCentro.addActionListener(

         new ActionListener() // clase interna anónima
         { 
            // procesa evento de botonJButtonCentro 
            public void actionPerformed( ActionEvent evento )
            {
               esquema.setAlignment( FlowLayout.CENTER );

               // realinea los componentes adjuntos
               esquema.layoutContainer( contenedor );
            } // fin del método actionPerformed
         } // fin de la clase interna anónima
      ); // fin de la llamada a addActionListener

      // establece botonJButtonDerecha y registra componente de escucha
      botonJButtonDerecha = new JButton( "Derecha" ); // crea botón Derecha
      add( botonJButtonDerecha ); // agrega botón Derecha al marco
      botonJButtonDerecha.addActionListener(

         new ActionListener() // clase interna anónima
         {  
            // procesa evento de botonJButtonDerecha 
            public void actionPerformed( ActionEvent evento )
            {
               esquema.setAlignment( FlowLayout.RIGHT );

               // realinea los componentes adjuntos
               esquema.layoutContainer( contenedor );
            } // fin del método actionPerformed
         } // fin de la clase interna anónima
      ); // fin de la llamada a addActionListener
   } // fin del constructor de MarcoFlowLayout
} // fin de la clase MarcoFlowLayout


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
