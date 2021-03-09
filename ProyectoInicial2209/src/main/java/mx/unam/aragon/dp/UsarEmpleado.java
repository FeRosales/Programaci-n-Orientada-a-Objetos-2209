
package mx.unam.aragon.dp;


public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1=new Empleado(1,"Sistemas", 45000.0f , 15);
        emp1.setNombre("María Fernanda");
        emp1.setApPaterno("Sánchez");
        emp1.setApMaterno("Rosales");
        emp1.setEdad(18);
        emp1.setCurp("SARF020713MDFNSRA3");
        
        System.out.println( "info:" + emp1 );
        
    }
}
