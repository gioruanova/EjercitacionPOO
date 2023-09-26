package testing;


import domain.Mesa;
import domain.Restaurant;

public class TestingMesa {
    public static void main(String[] args) {

        Restaurant restoManu = new Restaurant("Manu");


        Mesa mesa1 = new Mesa(1,Mesa.MESA_DISPONIBLE,8);
        Mesa mesa2 = new Mesa(2, Mesa.MESA_OCUPADA,4);
        Mesa mesa3 = new Mesa(3,Mesa.MESA_OCUPADA,6);
        Mesa mesa4 = new Mesa(4,Mesa.MESA_DISPONIBLE,4);
        mesa1.setMesaCapacidad(2);

        System.out.println(mesa1 + "\n" + mesa2 + "\n" + mesa3);


    }
}
