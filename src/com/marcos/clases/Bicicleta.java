package com.marcos.clases;

import com.marcos.interfaces.ITransporte;

public class Bicicleta implements ITransporte {
    /**
     * Calculamos el coste total Para la BICICLETA en funcion del codigo postal
     * @param cp Le pasamos el codigo Postal de la ciudad
     * @return nos devuelve el coste total
     */
    @Override
    public Float costeTotal(Integer cp) {
        int diferencia = cp - CENTRO_CIUDAD;
        if (diferencia > 10){
            return 3.7f;
        } else if (diferencia > 20) {
            return 5.7f;
        } else if (diferencia >40) {
            return 6f;
        }else {
            return 8f;
        }
    }

    /**
     * Calculamos el tipo de embajale para la bicicleta, en este caso solo devolverá caja de cartón
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
        }else {
            return null;
        }
    }
}
