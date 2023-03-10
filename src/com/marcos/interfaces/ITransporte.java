package com.marcos.interfaces;

public interface ITransporte {
    public static final int PALLET = 1;
    public static final int CAJA_MADERA = 2;
    public static final int CAJA_CARTON=3;

    public abstract Float costeTotal(Integer cp);
    public abstract Integer tipoEmbalage(Float x,Float y,Float z,Float peso);


}
