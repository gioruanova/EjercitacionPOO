package clases.cajeroAutomatico;

//Crear una clase llamada CajeroAutomatico y determinar 3 atributos y 3
// funcionalidades.

import javax.swing.*;


public class CajeroAutomatico {

    public String tipoOperacion;
    public String sucursal;
    Double valorOperacion;
    Double saldoTotal;

    public CajeroAutomatico(String sucursal) {
        this.saldoTotal = 3000.00;
        this.sucursal = sucursal;
    }

    // Metodos
    // tipo de operacion
    public void IngresarCajero() {
        this.tipoOperacion = JOptionPane.showInputDialog("Ingrese el tipo de operacion a realizar:\nE para extraccion\nD para deposito\nS para consulta de saldo");
        switch (this.tipoOperacion.toUpperCase()) {
            case "S":
                System.out.println("Sucursal " + this.sucursal + " informa:\nSu saldo es: $" + this.saldoTotal);
                break;
            case "E":
            case "D":
                ValidarMonto();
                break;
            default:
                System.out.println("Sucursal " + this.sucursal + " informa:\nOperacion invalida");
        }
    }

    //VALIDAR INGRESO
    public void ValidarMonto() {
        String valorIngresado = JOptionPane.showInputDialog("Ingrese el importe a operar:");
        try {
            Double.parseDouble(String.valueOf(valorIngresado));
            this.valorOperacion = Double.parseDouble(valorIngresado);
            Operar();
        } catch (NumberFormatException e) {
            System.out.println("Valor erroneo. Operacion anulada");
        }
    }

    // Valor operacion
    public void Operar() {
        if (this.tipoOperacion.equalsIgnoreCase("E")) {
            this.saldoTotal = this.saldoTotal - this.valorOperacion;
            Imprimir();
        } else {
            this.saldoTotal = this.saldoTotal + this.valorOperacion;
            Imprimir();
        }
    }

    public void Imprimir() {
        if (this.saldoTotal > 0) {
            System.out.println("Sucursal " + this.sucursal + " informa:\nSu saldo es: $" + this.saldoTotal);
        } else {
            System.out.println("Sucursal " + this.sucursal + " informa:\nSu saldo es: $" + this.saldoTotal + " y posee un descubierto");
        }
    }
}
