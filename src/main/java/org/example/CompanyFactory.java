package org.example;

public class CompanyFactory implements AbstractFactory {

    @Override
    public Contract createContract() {
        return new CompanyContract();
    }

    @Override
    public Receipt createReceipt() {
        return new CompanyReceipt();
    }
}
