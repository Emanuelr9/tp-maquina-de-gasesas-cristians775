package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class MaquinaExpendedora {

    private int dinero;
    private List<Gaseosa> gaseosas = new ArrayList<>();
    private int gaseosaPrecio;
    private Estado estado;


    public MaquinaExpendedora(List<Gaseosa> gaseosa) {
        this.gaseosas = gaseosa;
        gaseosaPrecio = Gaseosa.gaseosa.getPrecio();
        this.maquinaSindinero();
    }

    public void ingresarDinero(int dinero) {


       estado.ingresarDinero(dinero);


    }
    public void setDinero(int dinero){

        this.dinero+=dinero;
    }

    public int getDinero() {

        return dinero;
    }

    public int getStock() {

        return gaseosas.size();
    }

    public void setEstado(Estado estado) {

        this.estado = estado;

    }
    public void setStock(Gaseosa gaseosa){

        gaseosas.add(gaseosa);

    }
    public void setStock(List<Gaseosa> gaseosa){

        gaseosas=gaseosa;

    }

    public int getPrecio() {

        return gaseosaPrecio;
    }

    public void restarDinero() {

        dinero -= gaseosaPrecio;
    }

    public void restarGaseosa() {

        gaseosas.remove(0);
    }

    public void bajarPalanca() {

        estado.bajarPalanca();
    }

    public void darVuelto(){
        int dineroTemporal;
        dineroTemporal=getDinero();
        dinero=0;
        System.out.println(dineroTemporal);
    }

    public void maquinaSindinero() {

        this.estado = new SinDinero(this);
    }




}
