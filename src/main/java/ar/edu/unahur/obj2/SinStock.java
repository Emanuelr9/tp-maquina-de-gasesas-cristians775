package ar.edu.unahur.obj2;

public class SinStock implements Estado {

    MaquinaExpendedora maquina;

    public SinStock(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void ingresarDinero(int dinero) {
        if (maquina.getStock() >= 1) {


            maquina.setEstado(new ConDinero(maquina));
            maquina.ingresarDinero(dinero);
        } else {

            maquina.setDinero(dinero);
            maquina.bajarPalanca();
        }
    }
    public void bajarPalanca() {


        System.out.println("No hay Stock");
        maquina.darVuelto();
    }
}
