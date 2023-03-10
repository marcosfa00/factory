import com.marcos.factory.Factory;
import com.marcos.interfaces.ITransporte;
import com.marcosfa.entradasalida.EntradaSalida;

public class Main {

    static Object obj;//es objeto, después se iguala con un new NombreClase
    public static void main(String[] args) {
        Float coste = 0f;


       int device = EntradaSalida.EmtradaInt("Que metodo de transporte seleccionas: \n 1-Bicicleta \n 2-Camion");

        switch(device){
            case Factory.BICICLETA:
                obj = Factory.getProducto(device);
                break;
            case Factory.CAMION:
                obj = Factory.getProducto(device);
                break;
        }


    }
}