// Fig. 17.19: PruebaLeerArchivoSecuencial.java
// Prueba de la clase LeerArchivoSecuencial.

public class PruebaLeerArchivoSecuencial
{
   public static void main( String[] args )
   {
      LeerArchivoSecuencial aplicacion = new LeerArchivoSecuencial();

      aplicacion.abrirArchivo();
      aplicacion.leerRegistros();
      aplicacion.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaLeerArchivoSecuencial

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