package com.marcos.factory;

import com.marcos.clases.Bicicleta;
import com.marcos.clases.Camion;
import com.marcos.interfaces.ITransporte;

public class Factory {
    public static final int BICICLETA = 1;
    public static final int CAMION = 2;



public static Object getProducto(int device){ //devolvemos Interfaz
    switch (device){
        case BICICLETA:
            return new Bicicleta();

        case CAMION:
            return new Camion();

        default:
            return null;

    }
}
}
