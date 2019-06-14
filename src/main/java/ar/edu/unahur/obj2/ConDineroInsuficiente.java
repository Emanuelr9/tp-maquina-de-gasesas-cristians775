package ar.edu.unahur.obj2;

public class ConDineroInsuficiente implements Estado{

    MaquinaExpendedora maquina;

    public ConDineroInsuficiente(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void bajarPalanca() {
        int dineroTemporal;

        dineroTemporal=maquina.getPrecio()-maquina.getDinero();
        System.out.println("La gaseosa vale "+maquina.getPrecio()+" faltan "+dineroTemporal);



    }

    @Override
    public void ingresarDinero(int dinero) {
       maquina.setDinero(dinero);
       maquina.setEstado(new ConDinero(maquina));
    }
}
