package ar.edu.unahur.obj2;

public class ConDinero implements Estado {

    MaquinaExpendedora maquina;

    public ConDinero(MaquinaExpendedora maquina) {

        this.maquina = maquina;
    }

    @Override
    public void bajarPalanca() {

        int precioTemporal = maquina.getPrecio();
        int dineroTemporal = maquina.getDinero();
        if (maquina.getStock() >= 1) {

            if (maquina.getDinero() >= maquina.getPrecio()) {

                maquina.restarDinero();
                maquina.restarGaseosa();

                System.out.println("Su vuelto es de " + (dineroTemporal - precioTemporal));

            } else {

                System.out.println("Dinero insuficiente, faltan " + (precioTemporal - dineroTemporal));

            }
        } else {

            {

                System.out.println("No hay Stock");

            }
        }
    }

}