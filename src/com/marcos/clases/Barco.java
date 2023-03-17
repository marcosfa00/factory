package com.marcos.clases;

import com.marcos.interfaces.ITransporte;

/*
Ahora tenemos que implementar la interfaz ITransporte
 */
public class Barco implements ITransporte {
    /**
     * Calculamos el coste en funcion del codigo postal, esta vez los parámetros serán más amplios
     * ya que un barco se desplazará en codigos postales más amplios
     * @param cp Le pasamos el codigo Postal de la ciudad
     * @return Nos devuelve el coste total
     */
    @Override
    public Float costeTotal(Integer cp) {
        int diferencia =  cp - CENTRO_CIUDAD;
        if (diferencia > 1000){
            return 20f;
        } else if (diferencia > 2000) {
            return 50f;
        } else if (diferencia >4000) {
            return 80f;
        }else {
            return 120.5f;
        }
    }

    /**
     * Eb este método seleccionamos el tipo de embalage en funcion de las dimensiones ó el peso del paquete
     * @param x será el ancho del obj
     * @param y será el largo del obj
     * @param z será el alto del obj
     * @param peso será cuanto pesa el obj
     * @return
     */
    @Override
    public Integer tipoEmbalage(Float x, Float y, Float z, Float peso) {
        if (x < 30 && y < 60 && z<60 || peso <=50){
            return CAJA_CARTON;
        }else if (x < 60 && y < 80 && z<80 || peso >50 && peso <120){
            return CAJA_MADERA;
        }else {
            return PALLET;
        }
    }
}
