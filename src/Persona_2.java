public class Persona_2 {
    private String nombre;
    private int edad;

    public Persona_2(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }


    public void mostrarDetalles(){

        System.out.println("Nombre: "+nombre+" Edad: "+edad+" ");


    }




}

class Empleado_2 extends Persona_2 {
    private String departamento;

    public Empleado_2(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

 /*   @Override
    public void mostrarDetalles() {
        System.out.println(super.edad);
    }

    Acá genera  error de compliacion debido a que estamos intentando
     acceder al atributo de la clase padre. Solamente él puede
     tener acceso.


*/



}