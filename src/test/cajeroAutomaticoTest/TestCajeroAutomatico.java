package test.cajeroAutomaticoTest;

import clases.cajeroAutomatico.CajeroAutomatico;

public class TestCajeroAutomatico {
    public static void main(String[] args) {

        System.out.println("\n-----------\n");
        CajeroAutomatico cajeroUno = new CajeroAutomatico("Palermo");
        cajeroUno.IngresarCajero();

        System.out.println("\n-----------\n");

        CajeroAutomatico cajeroDos = new CajeroAutomatico("Obelisco");
        cajeroDos.IngresarCajero();
        System.out.println("\n-----------\n");

    }
}
