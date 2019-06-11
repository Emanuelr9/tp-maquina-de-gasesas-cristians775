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

    public int getPrecio() {

        return gaseosaPrecio;
    }

    public void restarDinero() {

        dinero -= gaseosaPrecio;
    }

    public void restarGaseosa() {

        gaseosas.remove(1);
    }

    public void bajarPalanca() {

        estado.bajarPalanca();
    }

    public void maquinaSindinero() {

        this.estado = new SinDinero(this);
    }


    public void maquinaConDinero() {

        this.estado = new ConDinero(this);
    }

    public void verificarStock(){

        if(getStock()==0){
            estado=new SinStock(this);
        }

    }

}
