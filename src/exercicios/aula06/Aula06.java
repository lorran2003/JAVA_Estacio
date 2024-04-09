package com.mycompany.aula06;

import java.util.concurrent.TimeUnit;

public class Aula06 {
    public static void main(String[] args) throws InterruptedException {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setSaldo(1000);
        conta1.Depositar(1500);
        System.out.println("Inicio da Conta: " + conta1.getDataDeAbertura() + "\nSaldo: " + conta1.getSaldo());
        System.out.println("Valorde Saque: R$:1.000,00");
        conta1.Sacar(1000);
        System.out.println("Contando Notas...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Novo Saldo: " + conta1.getSaldo());
    }
}
