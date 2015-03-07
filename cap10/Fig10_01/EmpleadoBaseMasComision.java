// EmpleadoBaseMasComision.java
// La clase EmpleadoBaseMasComision hereda de EmpleadoPorComision y
// accede a los datos private de la superclase a trav�s de los
// m�todos public heredados.

public class EmpleadoBaseMasComision extends EmpleadoPorComision
{
   private double salarioBase; // salario base por semana

   // constructor con seis argumentos
   public EmpleadoBaseMasComision( String nombre, String apellido, 
      String nss, double ventas, double tarifa, double salario )
   {
      super( nombre, apellido, nss, ventas, tarifa );
      establecerSalarioBase( salario ); // valida y almacena el salario base
   } // fin del constructor de EmpleadoBaseMasComision con seis argumentos
   
   // establece el salario base
   public void establecerSalarioBase( double salario )
   {
       if ( salario >= 0.0 )
          salarioBase = salario;
       else
          throw new IllegalArgumentException(
             "El salario base debe ser >= 0.0" );
   } // fin del m�todo establecerSalarioBase

   // devuelve el salario base
   public double obtenerSalarioBase()
   {
      return salarioBase;
   } // fin del m�todo obtenerSalarioBase

   // calcula los ingresos
   @Override // indica que este m�todo sobrescribe el m�todo de la superclase
   public double ingresos()
   {
      return obtenerSalarioBase() + super.ingresos();
   } // fin del m�todo ingresos

   // devuelve representaci�n String de EmpleadoBaseMasComision
   @Override // indica que este m�todo sobrescribe el m�todo de la superclase
   public String toString()
   {
      return String.format( "%s %s\n%s: %.2f", "con sueldo base", 
         super.toString(), "sueldo base", obtenerSalarioBase() );
   } // fin del m�todo toString
} // fin de la clase EmpleadoBaseMasComision


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