package ar.edu.unahur.obj2;

public enum Gaseosa {

    gaseosa(10);
    int precio;

    Gaseosa(int precio) {
        this.precio = precio;
    }

   public int getPrecio(){

        return precio;
   }
}
