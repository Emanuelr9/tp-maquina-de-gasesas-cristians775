package ar.edu.unahur.obj2;

public class ConDinero implements Estado {

    MaquinaExpendedora maquina;

    public ConDinero(MaquinaExpendedora maquina) {

        this.maquina = maquina;
    }

    @Override
    public void ingresarDinero(int dinero) {
        maquina.setDinero(dinero);
        if (maquina.getPrecio() > maquina.getDinero()) {

            maquina.setEstado(new ConDineroInsuficiente(maquina));


        }

    }

    @Override
    public void bajarPalanca() {
        if (maquina.getStock() >= 1) {


            maquina.restarGaseosa();
            maquina.restarDinero();
            System.out.println("Tome su gaseosa " + "su vuelto es de ");
            maquina.darVuelto();
            maquina.setEstado(new SinDinero(maquina));

        } else {

            maquina.setEstado(new SinStock(maquina));


        }
    }


    }
