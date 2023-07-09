package Workshop3;

public class Velero extends Embarcacion{

    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, int anioFabricacion, float eslora, int cantidadMastiles) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public double montoAlquiler() {
        double calcularMonto=0;
        if(anioFabricacion>2020){
            calcularMonto = precioBase+valorAdicional;
        }else{
            calcularMonto = precioBase;
        }
        return calcularMonto;
    }

    public void esGrande(){
        if(cantidadMastiles > 4){
            System.out.println("El velero es grande");
        }else{
            System.out.println("El velero es pequeño");
        }
    }
}
