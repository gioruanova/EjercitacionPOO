package testing;

import domain.Mesa;
import domain.Restaurant;

import java.sql.SQLOutput;

public class TestRestaurant {
    public static void main(String[] args){

        Restaurant restoUno = new Restaurant("La Strettola");

        Mesa mesaUno = new Mesa(1,Mesa.MESA_DISPONIBLE,2);
        Mesa mesaDos = new Mesa(2,Mesa.MESA_DISPONIBLE,3);
        Mesa mesaTres = new Mesa(3,Mesa.MESA_OCUPADA,5);
        Mesa mesaCuatro = new Mesa(4,Mesa.MESA_OCUPADA,7);
        Mesa mesaCinco = new Mesa(5,Mesa.MESA_DISPONIBLE,8);
        Mesa mesaSeis = new Mesa(6,Mesa.MESA_DISPONIBLE,12);

        restoUno.addMesa(mesaUno);
        restoUno.addMesa(mesaDos);
        restoUno.addMesa(mesaTres);
        restoUno.addMesa(mesaCuatro);
        restoUno.addMesa(mesaCinco);
        restoUno.addMesa(mesaSeis);

        System.out.println("Restaurant1: " + restoUno.toString());
        System.out.println("Mesa Uno: " + mesaUno);
        System.out.println("Cantidad de mesas disponibles: " + restoUno.obtenerMesasDisponibles());
        System.out.println("Cantidad de mesas ocupadas: " + restoUno.obtenerMesasOcupadas());
        System.out.println("Cantidad de mesas totales: " + restoUno.obtenerTotalMesas());
    }
}
