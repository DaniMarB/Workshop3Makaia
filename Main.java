package Workshop3;

public class Main {
    public static void main(String[] args) {
        Capitan capitan = new Capitan("Daniel","Marquez",123456789);
        Velero velero = new Velero(capitan,50000,2019,6.5F,3);
        Yate yate = new Yate(capitan,100000,2021,5.2F,6);

        velero.esGrande();
        yate.esLujo();
        System.out.println();
        System.out.println("Precio Monto alquiler: "+velero.montoAlquiler());
        System.out.println("Precio Monto alquiler: "+yate.montoAlquiler());

    }
}
