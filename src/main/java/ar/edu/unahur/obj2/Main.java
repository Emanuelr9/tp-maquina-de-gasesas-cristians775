package ar.edu.unahur.obj2;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        MaquinaExpendedora maquina=new MaquinaExpendedora(Stream.of(Gaseosa.gaseosa,Gaseosa.gaseosa,Gaseosa.gaseosa,Gaseosa.gaseosa,Gaseosa.gaseosa).collect(Collectors.toList()));
        maquina.bajarPalanca();
        System.out.println(maquina.getPrecio());
        maquina.ingresarDinero(2);
        maquina.bajarPalanca();
        maquina.ingresarDinero(10);
        maquina.bajarPalanca();
    }
}
