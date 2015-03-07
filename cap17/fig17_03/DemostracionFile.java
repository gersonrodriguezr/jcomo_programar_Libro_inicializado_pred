// Fig. 17.3: DemostracionFile.java
// Clase File utilizada para obtener información sobre archivos y directorios.
import java.io.File;
import java.util.Scanner;

public class DemostracionFile
{
   public static void main( String[] args )
   {
      Scanner entrada = new Scanner( System.in );

      System.out.print( "Escriba aqui el nombre del archivo o directorio: " );
      analizarRuta( entrada.nextLine() );
   } // fin de main

   // muestra información acerca del archivo especificado por el usuario
   public static void analizarRuta( String ruta )
   {
      // crea un objeto File con base en la entrada del usuario
      File nombre = new File( ruta );

      if ( nombre.exists() ) // si existe el nombre, muestra información sobre él
      {
         // muestra información del archivo (o directorio)
         System.out.printf(
            "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
            nombre.getName(), " existe",
            ( nombre.isFile() ? "es un archivo" : "no es un archivo" ),
            ( nombre.isDirectory() ? "es un directorio" : 
               "no es un directorio" ),
            ( nombre.isAbsolute() ? "es ruta absoluta" : 
               "no es ruta absoluta" ), "Ultima modificacion: ",
            nombre.lastModified(), "Tamanio: ", nombre.length(), 
            "Ruta: ", nombre.getPath(), "Ruta absoluta: ",
            nombre.getAbsolutePath(), "Padre: ", nombre.getParent() );

         if ( nombre.isDirectory() ) // muestra el listado del directorio
         {
            String[] directorio = nombre.list();
            System.out.println( "\n\nContenido del directorio:\n" );
   
            for ( String nombreDirectorio : directorio )
               System.out.printf( "%s\n", nombreDirectorio );
         } // fin de if
      } // fin de if exterior
      else // no es archivo o directorio, muestra mensaje de error
      {
         System.out.printf( "%s %s", ruta, "no existe." );
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