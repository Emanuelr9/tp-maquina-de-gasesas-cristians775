package ar.edu.unahur.obj2;

public class SinStock implements Estado {

    MaquinaExpendedora maquina;

    public SinStock(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    public void bajarPalanca(){

        System.out.println("No hay Stock");

    }
}
