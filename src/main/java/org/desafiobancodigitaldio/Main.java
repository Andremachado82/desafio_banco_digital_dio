package org.desafiobancodigitaldio;

import org.desafiobancodigitaldio.model.Cliente;
import org.desafiobancodigitaldio.model.Conta;
import org.desafiobancodigitaldio.model.ContaCorrente;
import org.desafiobancodigitaldio.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        System.out.println(venilton);

    }
}