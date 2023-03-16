package com.marcos.clases;

import com.marcos.interfaces.ITransporte;

public class Camion implements ITransporte {


    /**
     * El método que implementamos aquí para el precio está personalizado para camión en funcion de las diferencias de codigo postal
     * @param cp Le pasamos el codigo Postal de la ciudad
     * @return devuelve el precio, que este será mayor en cuanto aumente la diferenia
     */
    @Override
    public Float costeTotal(Integer cp) {
        int diferencia =  cp - CENTRO_CIUDAD;
        if (diferencia > 100){
            return 5.7f;
        } else if (diferencia > 200) {
            return 6.7f;
        } else if (diferencia >400) {
            return 8f;
        }else {
            return 10f;
        }

    }

    /**
     * Metodo que calcula el tipo de embalage a usar en función de los siguientes parámetros
     * @param x será el ancho del obj
     * @param y será el largo del obj
     * @param z será el alto del obj
     * @param peso será cuanto pesa el obj
     * @return
     */
    @Override
    public Integer tipoEmbalage(Float x, Float y, Float z, Float peso) {
        if (x < 10 && y < 20 && z<20 || peso <=10){
            return CAJA_CARTON;
        }else if (x < 20 && y < 40 && z<40 || peso >10 && peso <20){
            return CAJA_MADERA;
        }else {
            return PALLET;
        }
    }
}
