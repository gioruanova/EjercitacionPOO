package ejBicicleta.test;


import ejBicicleta.domain.Bicicleta;
import ejBicicleta.domain.Estacion;

public class EstacionTest {
    public static void main(String[] args) {
        System.out.println("------");

        Estacion estacion1 = new Estacion(123, "DaVinci");
        
        System.out.println("Estacion1: " + estacion1.toString());
        System.out.println("Cantidad en uso: " + estacion1.obtenerEnUso());
        System.out.println("Cantidad disponible: " + estacion1.obtenerDisponibles());
        System.out.println("Cantidad Reparacion: " + estacion1.obtenerEnReparacion());
        System.out.println("%");
        System.out.println("Disponible: %" + estacion1.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_DISPONIBLE));
        System.out.println("Reparacion: %" + estacion1.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_REPARACION));
        System.out.println("En uso: %" + estacion1.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_EN_USO));
        System.out.println("------");


        Bicicleta bici1 = new Bicicleta(1234, Bicicleta.ESTADO_DISPONIBLE);

        Bicicleta bici2 = new Bicicleta(456, Bicicleta.ESTADO_DISPONIBLE);

        Bicicleta bici3 = new Bicicleta(789, Bicicleta.ESTADO_EN_USO);


//        Bicicleta[] bicicletas = new Bicicleta[3];
//        bicicletas[0] = bici1;
//        bicicletas[1] = bici2;
//        bicicletas[2] = bici3;

//        METODO PRIVADO
//        estacion1.setBicicletas(bicicletas);
        estacion1.addBicicleta(bici1);
        estacion1.addBicicleta(bici2);
        estacion1.addBicicleta(bici3);
        System.out.println("Estacion1: " + estacion1.toString());

        System.out.println("Cantidad en uso: " + estacion1.obtenerEnUso());
        System.out.println("Cantidad disponible: " + estacion1.obtenerDisponibles());
        System.out.println("Cantidad Reparacion: " + estacion1.obtenerEnReparacion());
        System.out.println("%");
        System.out.println("Disponible: %" + estacion1.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_DISPONIBLE));
        System.out.println("Reparacion: %" + estacion1.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_REPARACION));
        System.out.println("En uso: %" + estacion1.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_EN_USO));


        System.out.println("------");
        System.out.println("------");

        Estacion estacion2 = new Estacion(345, "DaVinci2", 10);
        System.out.println("Estacion 2 " + estacion2.toString());
        System.out.println("Cantidad en uso: " + estacion2.obtenerEnUso());
        System.out.println("Cantidad disponible: " + estacion2.obtenerDisponibles());
        System.out.println("Cantidad Reparacion: " + estacion2.obtenerEnReparacion());
        System.out.println("%");
        System.out.println("Disponible: %" + estacion1.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_DISPONIBLE));
        System.out.println("Reparacion: %" + estacion1.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_REPARACION));
        System.out.println("En uso: %" + estacion1.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_EN_USO));


        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);
        estacion2.addBicicleta(bici1);

        System.out.println("------");
        System.out.println("------");

        System.out.println("Estacion 2: " + estacion2.toString());
        System.out.println("Cantidad en uso: " + estacion2.obtenerEnUso());
        System.out.println("Cantidad disponible: " + estacion2.obtenerDisponibles());
        System.out.println("Cantidad Reparacion: " + estacion2.obtenerEnReparacion());
        System.out.println("%");
        System.out.println("Disponible: %" + estacion2.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_DISPONIBLE));
        System.out.println("Reparacion: %" + estacion2.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_REPARACION));
        System.out.println("En uso: %" + estacion2.mostrarEstadoDeLaEstacion(Bicicleta.ESTADO_EN_USO));

    }

}
