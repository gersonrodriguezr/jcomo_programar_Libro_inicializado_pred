// Fig. 9.8: EmpleadoBaseMasComision.java
// Los miembros private de la superclase no se pueden utilizar en una subclase.

public class EmpleadoBaseMasComision extends EmpleadoPorComision
{
   private double salarioBase; // salario base por semana

   // constructor con seis argumentos
   public EmpleadoBaseMasComision( String nombre, String apellido, 
      String nss, double ventas, double tarifa, double salario )
   {
      // llamada explícita al constructor de la superclase EmpleadoPorComision
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
   } // fin del método establecerSalarioBase

   // devuelve el salario base
   public double obtenerSalarioBase()
   {
      return salarioBase;
   } // fin del método obtenerSalarioBase

   // calcula los ingresos
   @Override  // indica que este método sobrescribe al método de la superclase
   public double ingresos()
   {
      // no está permitido: tarifaComision y ventasBrutas son private en la superclase
      return salarioBase + ( tarifaComision * ventasBrutas );
   } // fin del método ingresos

   // devuelve representación String de EmpleadoBaseMasComision
   @Override // indica que este método sobrescribe al método de la superclase
   public String toString()
   {
      // no está permitido: intentos por acceder a los miembros private de la superclase 
      return String.format( 
         "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
         "empleado por comision con sueldo base", primerNombre, apellidoPaterno, 
         "numero de seguro social", numeroSeguroSocial, 
         "ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision, 
         "salario base", salarioBase );
   } // fin del método toString
} // fin de la clase EmpleadoBaseMasComision


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
