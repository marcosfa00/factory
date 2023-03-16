package com.marcos.factory;

import com.marcos.clases.Bicicleta;
import com.marcos.clases.Camion;
import com.marcos.interfaces.ITransporte;

public class Factory {
    //Declaramos la opcion camion
    public static final int CAMION = 0;
    //declaramos la opcion bicicleta
    public static final int BICICLETA = 1;


    public static ITransporte getProducto(int device){
        switch (device){
            case CAMION -> {
                return new Camion();
            }
            case BICICLETA -> {
                return new Bicicleta();
            }
            default -> {
                return null;
            }
        }
    }

}
