package org.example;

public class IndividualFactory implements AbstractFactory {

    @Override
    public Contract createContract() {
        return new IndividualContract();
    }

    @Override
    public Receipt createReceipt() {
        return new IndividualReceipt();
    }
}
