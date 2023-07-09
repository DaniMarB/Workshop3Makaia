package Workshop3;

public abstract class Embarcacion {
    private Capitan capitan;
    public double precioBase;
    public final double valorAdicional=20000;
    public int anioFabricacion;
    private float eslora;

    public Embarcacion(Capitan capitan, double precioBase, int anioFabricacion, float eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public abstract double montoAlquiler();
}
