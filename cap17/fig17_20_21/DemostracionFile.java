// Fig. 17.20: DemostracionFile.java
// Demostración de la clase JFileChooser.
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DemostracionFile extends JFrame
{
   private JTextArea areaSalida; // se utiliza para salida
   private JScrollPane panelDespl; // se utiliza para que la salida pueda desplazarse
   
   // establece la GUI
   public DemostracionFile()
   {
      super( "Prueba de la clase File" );

      areaSalida = new JTextArea();

      // agrega areaSalida a panelDespl
      panelDespl = new JScrollPane( areaSalida ); 

      add( panelDespl, BorderLayout.CENTER ); // agrega panelDespl a la GUI

      setSize( 400, 400 ); // establece el tamaño de la GUI
      setVisible( true ); // muestra la GUI

      analizarRuta(); // crea y analiza un objeto File
   } // fin del constructor de DemostracionFile

   // permite al usuario especificar el nombre del archivo o directorio
   private File obtenerArchivoODirectorio()
   {
      // muestra el cuadro de diálogo de archivos, para que el usuario pueda elegir el archivo a abrir
      JFileChooser selectorArchivos = new JFileChooser();
      selectorArchivos.setFileSelectionMode(
         JFileChooser.FILES_AND_DIRECTORIES );

      int resultado = selectorArchivos.showOpenDialog( this );

      // si el usuario hizo clic en el botón Cancelar en el cuadro de diálogo, regresa
      if ( resultado == JFileChooser.CANCEL_OPTION )
         System.exit( 1 );

      File nombreArchivo = selectorArchivos.getSelectedFile(); // obtiene el archivo seleccionado

      // muestra error si es inválido
      if ( ( nombreArchivo == null ) || ( nombreArchivo.getName().equals( "" ) ) )
      {
         JOptionPane.showMessageDialog( this, "Nombre de archivo inválido",
            "Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE );
         System.exit( 1 );
      } // fin de if

      return nombreArchivo;
   } // fin del método obtenerArchivoODirectorio

   // muestra información acerca del archivo que especifica el usuario
   public void analizarRuta()
   {
      // crea un objeto File basado en la entrada del usuario
      File nombre = obtenerArchivoODirectorio();

      if ( nombre.exists() ) // si el nombre existe, muestra información sobre él
      {
         // muestra la información sobre el archivo (o directorio)
         areaSalida.setText( String.format(
            "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
            nombre.getName(), " existe",
            ( nombre.isFile() ? "es un archivo" : "no es un archivo" ),
            ( nombre.isDirectory() ? "es un directorio" : 
               "no es un directorio" ),
            ( nombre.isAbsolute() ? "es una ruta absoluta" : 
               "no es una ruta absoluta" ), "Ultima modificacion: ",
            nombre.lastModified(), "Tamanio: ", nombre.length(), 
            "Ruta: ", nombre.getPath(), "Ruta absoluta: ",
            nombre.getAbsolutePath(), "Padre: ", nombre.getParent() ) );

         if ( nombre.isDirectory() ) // imprime el listado del directorio
         {
            String[] directorio = nombre.list();
            areaSalida.append( "\n\nContenido del directorio:\n" );
   
            for ( String nombreDirectorio : directorio )
               areaSalida.append( nombreDirectorio + "\n" );
         } // fin de else
      } // fin de if exterior
      else // no es archivo ni directorio, imprime mensaje de error
      {
         JOptionPane.showMessageDialog( this, nombre +
            " no existe.", "ERROR", JOptionPane.ERROR_MESSAGE );
      } // fin de else  
   } // fin del método analizarRuta
} // fin de la clase DemostracionFile

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