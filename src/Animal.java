public class Animal {
    private String especie;

    public Animal(String especie){
        this.especie = especie;
    }



    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }



    public void mostrarEspecie(){
        System.out.println("Especie: "+especie+" ");
    }

}

class Pez extends Animal{
     private String tipoAgua;

    public Pez(String especie, String tipoAgua){
        super(especie);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo de Agua: "+tipoAgua+" ");
    }
}


