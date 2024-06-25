package org.desafiobancodigitaldio.model;

import lombok.ToString;

@ToString
public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
}
