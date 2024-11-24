package ejercicioDos;

public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String mostrarEspecie() {
        return "Especie: " + especie;
    }
}
