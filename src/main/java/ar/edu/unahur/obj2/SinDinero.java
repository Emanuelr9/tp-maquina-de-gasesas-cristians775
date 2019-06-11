package ar.edu.unahur.obj2;

public class SinDinero implements Estado {

    MaquinaExpendedora maquina;

    public SinDinero(MaquinaExpendedora maquina){

        this.maquina=maquina;

    }

    @Override
    public void ingresarDinero(int dinero) {

        maquina.setEstado(new ConDinero(maquina));
        maquina.setDinero(dinero);


    }

    @Override
    public void bajarPalanca() {


        System.out.println("Ingrese "+ maquina.getPrecio() +" pesos para poder comprar");

    }
}
