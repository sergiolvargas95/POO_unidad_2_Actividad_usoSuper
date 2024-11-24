package ejercicioDos;

public class Pez extends Animal 
{
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) 
    {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public String mostrarEspecie() {
        return super.mostrarEspecie();
    }
}
