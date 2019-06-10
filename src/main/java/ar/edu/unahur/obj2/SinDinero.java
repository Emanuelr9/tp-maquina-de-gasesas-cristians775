package ar.edu.unahur.obj2;

public class SinDinero implements Estado {

    int precio;

    public SinDinero(int precio){

        this.precio=precio;

    }
    @Override
    public void bajarPalanca() {


        System.out.println("Ingrese "+ precio +" pesos para poder comprar");

    }
}
