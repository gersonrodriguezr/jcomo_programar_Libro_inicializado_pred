// Fig. 17.15: RegistroCuentaSerializable.java
// La clase RegistroCuentaSerializable para objetos serializables.
package com.deitel.cap17; // empaquetada para reutilizarla

import java.io.Serializable;

public class RegistroCuentaSerializable implements Serializable
{
   private int cuenta;
   private String primerNombre;
   private String apellidoPaterno;
   private double saldo;
   
   // el constructor sin argumentos llama al otro constructor con valores predeterminados
   public RegistroCuentaSerializable() 
   {
      this( 0, "", "", 0.0 );
   } // fin del constructor de RegistroCuentaSerializable sin argumentos
  
   // el constructor con cuatro argumentos inicializa un registro
   public RegistroCuentaSerializable(
      int cta, String nombre, String apellido, double sal )
   {
      establecerCuenta( cta );
      establecerPrimerNombre( nombre );
      establecerApellidoPaterno( apellido );
      establecerSaldo( sal );
   } // fin del constructor de RegistroCuentaSerializable con cuatro argumentos

   // establece el número de cuenta
   public void establecerCuenta( int cta )
   {
      cuenta = cta;
   } // fin del método establecerCuenta

   // obtiene el número de cuenta
   public int obtenerCuenta() 
   { 
      return cuenta; 
   } // fin del método obtenerCuenta
   
   // establece el primer nombre 
   public void establecerPrimerNombre( String nombre )
   {
      primerNombre = nombre;
   } // fin del método establecerPrimerNombre

   // obtiene el primer nombre 
   public String obtenerPrimerNombre() 
   { 
      return primerNombre; 
   } // fin del método obtenerPrimerNombre
   
   // establece el apellido paterno  
   public void establecerApellidoPaterno( String apellido )
   {
      apellidoPaterno = apellido;
   } // fin del método establecerApellidoPaterno

   // obtiene el apellido paterno
   public String obtenerApellidoPaterno() 
   {
      return apellidoPaterno; 
   } // fin del método obtenerApellidoPaterno
   
   // establece el saldo 
   public void establecerSaldo( double sal )
   {
      saldo = sal;
   } // fin del método establecerSaldo

   // obtiene el saldo
   public double obtenerSaldo() 
   { 
      return saldo; 
   } // fin del método obtenerSaldo
} // fin de la clase RegistroCuentaSerializable

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