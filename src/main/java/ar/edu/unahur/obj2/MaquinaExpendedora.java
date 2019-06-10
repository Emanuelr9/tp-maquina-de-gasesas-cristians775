package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class MaquinaExpendedora {

     private int dinero;
     private  List<Gaseosa>gaseosas=new ArrayList<>();
     private int gaseosaPrecio;
     private Estado estado;



    public MaquinaExpendedora(List<Gaseosa> gaseosa){

        this.gaseosas=gaseosa;
        gaseosaPrecio=Gaseosa.gaseosa.getPrecio();



    }

    public void ingresarDinero(int dinero){


         this.dinero=dinero;

    }

    public int getDinero() {

        return dinero;
    }
    public int getStock(){

        return gaseosas.size();
    }
    public void setEstado(Estado estado){

        this.estado=estado;

    }
    public int getPrecio(){

        return gaseosaPrecio;
    }
    public void restarDinero(){

        dinero-=gaseosaPrecio;
    }
    public void restarGaseosa(){


            gaseosas.remove(1);



    }

    public void bajarPalanca(){

        if(dinero == 0) {

            maquinaSindinero(gaseosaPrecio);
            estado.bajarPalanca();

        }else{

            maquinaConDinero();
            estado.bajarPalanca();
        }

    }

    public void maquinaSindinero(int precio){

        this.estado=new SinDinero(precio);
    }


    public void maquinaConDinero(){

        this.estado=new ConDinero(this);
    }

}
