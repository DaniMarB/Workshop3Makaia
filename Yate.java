package Workshop3;

public class Yate extends Embarcacion{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, int anioFabricacion, float eslora, int cantidadCamarotes) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
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

    public void esLujo(){
        if(cantidadCamarotes > 7){
            System.out.println("Es yate de lujo y puede ser comprado");
        }else{
            System.out.println("No es yate de lujo y puede ser comprado");
        }
    }


}
