package com.marcos.interfaces;

public interface ITransporte {
    /**
     * Aqui se elegira el tipo de embalaje que vamos a utilizar
     * además del coste total en funcion del tamaño y peso
     */
    public static final int CAJA_MADERA = 0;
    public static final int CAJA_CARTON = 1;
    public static final int PALLET = 2;

    //CÓDIGO POSTAL DE REFERENCIA CENTRO DE LA CIUDAD
    public static final int CENTRO_CIUDAD = 36200;

    /**
     * Este metodo nos calculará el coste total en función del CP en el que vivamos
     * @param cp Le pasamos el codigo Postal de la ciudad
     * @return Nos devuelve el precio
     */
    public abstract Float costeTotal(Integer cp);

    /**
     * Este metodo le pasaremos las dimensiones del obj a embalar para calcular el tipo de embalage.
     * @param x será el ancho del obj
     * @param y será el largo del obj
     * @param z será el alto del obj
     * @param peso será cuanto pesa el obj
     * @return devuelve la selección del embalage
     */
    public abstract Integer tipoEmbalage(Float x,Float y,Float z,Float peso);


}
