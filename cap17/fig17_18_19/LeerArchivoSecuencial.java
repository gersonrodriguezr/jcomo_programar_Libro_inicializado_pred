// Fig. 17.18: LeerArchivoSecuencial.java
// Leer un archivo de objetos en forma secuencial con ObjectInputStream
// y mostrar cada registro en pantalla.
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.deitel.cap17.RegistroCuentaSerializable;

public class LeerArchivoSecuencial
{
   private ObjectInputStream entrada;

   // permite al usuario seleccionar el archivo a abrir
   public void abrirArchivo()
   {
      try // abre el archivo
      {
         entrada = new ObjectInputStream(
            new FileInputStream( "clientes.ser" ) );
      } // fin de try
      catch ( IOException ioException )
      {
         System.err.println( "Error al abrir el archivo." );
      } // fin de catch
   } // fin del m�todo abrirArchivo

   // lee el registro del archivo
   public void leerRegistros()
   {
      RegistroCuentaSerializable registro;
      System.out.printf( "%-10s%-15s%-15s%10s\n", "Cuenta",
         "Primer nombre", "Apellido paterno", "Saldo" );

      try // recibe los valores del archivo
      { 
         while ( true )
         {
            registro = ( RegistroCuentaSerializable ) entrada.readObject();

            // muestra el contenido del registro
            System.out.printf( "%-10d%-15s%-15s%11.2f\n",
               registro.obtenerCuenta(), registro.obtenerPrimerNombre(),
               registro.obtenerApellidoPaterno(), registro.obtenerSaldo() );
         } // fin de while
      } // fin de try
      catch ( EOFException endOfFileException )
      {
         return; // se lleg� al fin del archivo
      } // fin de catch
      catch ( ClassNotFoundException classNotFoundException )
      {
         System.err.println( "No se pudo crear el objeto." );
      } // fin de catch
      catch ( IOException ioException )
      {
         System.err.println( "Error al leer del archivo." );
      } // fin de catch
   } // fin del m�todo leerRegistros

   // cierra el archivo y termina la aplicaci�n
   public void cerrarArchivo()
   {
      try // cierra el archivo y sale
      {
         if ( entrada != null )
            entrada.close();
         System.exit( 0 );
      } // fin de try
      catch ( IOException ioException )
      {
         System.err.println( "Error al cerrar el archivo." );
         System.exit( 1 );
      } // fin de catch
   } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoSecuencial

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