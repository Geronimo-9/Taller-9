public class Persona {
private String nombre;
private int edad;

public Persona(String nombre, int edad){
    this.nombre = nombre;
    setEdad(edad);

}

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad >= 0){
            this.edad = edad;
        }

    }


    public void mostrarDetalles(){

        System.out.println("Nombre: "+nombre+" Edad: "+edad+" ");


    }




}

class Empleado extends Persona{
private String departamento;

public Empleado(String nombre, int edad, String departamento){
    super(nombre,edad);
    this.departamento = departamento;
}

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: "+departamento+" ");
    }




}
