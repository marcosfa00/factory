package com.marcos.clases;

import com.marcos.interfaces.ITransporte;

public class Bicicleta implements ITransporte {


    @Override
    public Float costeTotal(Integer cp) {
        if (cp >36200 && cp <=36500){
            return 60f;
        } else if (cp >=36501 && cp <=36500) {
            return 70f;
        }
        return null;
    }

    @Override
    public Integer tipoEmbalage(Float x, Float y, Float z, Float peso) {
        if (x < 40 && y < 40 || z <90){
            return ITransporte.CAJA_CARTON;
        }else{
            return null;
        }
    }
}
