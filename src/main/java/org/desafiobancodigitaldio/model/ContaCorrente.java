package org.desafiobancodigitaldio.model;

import lombok.ToString;

@ToString
public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
}
