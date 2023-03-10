package com.marcos.clases;

import com.marcos.interfaces.ITransporte;

public class Camion implements ITransporte {
    @Override
    public Float costeTotal(Integer cp) {
        return null;
    }

    @Override
    public Integer tipoEmbalage(Float x, Float y, Float z, Float peso) {
        if (x > (y+z)){
            return ITransporte.PALLET;
        } else if (x>(x+y+z)) {
            return ITransporte.CAJA_MADERA;
        }else{
            return ITransporte.CAJA_CARTON;
        }
    }
}
