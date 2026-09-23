package org.example;

public class Client {

    private Contract contrato;
    private Receipt comprovante;

    public Client(AbstractFactory fabrica) {
        this.contrato = fabrica.createContract();
        this.comprovante = fabrica.createReceipt();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirComprovante() {
        return this.comprovante.emitir();
    }
}
