package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void deveEmitirContratoIndividual() {
        AbstractFactory fabrica = new IndividualFactory();
        Client client = new Client(fabrica);
        assertEquals("Contrato de Pessoa Física", client.emitirContrato());
    }

    @Test
    void deveEmitirContratoCompany() {
        AbstractFactory fabrica = new CompanyFactory();
        Client client = new Client(fabrica);
        assertEquals("Contrato de Pessoa Jurídica", client.emitirContrato());
    }

    @Test
    void deveEmitirComprovanteIndividual() {
        AbstractFactory fabrica = new IndividualFactory();
        Client client = new Client(fabrica);
        assertEquals("Comprovante de Inscrição no CPF", client.emitirComprovante());
    }

    @Test
    void deveEmitirComprovanteCompany() {
        AbstractFactory fabrica = new CompanyFactory();
        Client client = new Client(fabrica);
        assertEquals("Comprovante de Inscrição no CNPJ", client.emitirComprovante());
    }
}
