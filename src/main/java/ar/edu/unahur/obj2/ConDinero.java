package ar.edu.unahur.obj2;

public class ConDinero implements Estado {

    MaquinaExpendedora maquina;

    public ConDinero(MaquinaExpendedora maquina) {

        this.maquina = maquina;
    }

    @Override
    public void ingresarDinero(int dinero) {

        maquina.setDinero(dinero);
    }

    @Override
    public void bajarPalanca() {

        int precioTemporal = maquina.getPrecio();
        int dineroTemporal = maquina.getDinero();


            if (maquina.getDinero() >= maquina.getPrecio()) {

                maquina.restarDinero();
                maquina.restarGaseosa();
                maquina.maquinaSindinero();
                this.verificarStock();
                System.out.println("Su vuelto es de " + (dineroTemporal - precioTemporal));

            } else {

                System.out.println("Dinero insuficiente, faltan " + (precioTemporal - dineroTemporal));

            }

        }


        public void verificarStock(){
            if(maquina.getStock()==0){
               maquina.setEstado(new SinStock(maquina));
            }

        }

}