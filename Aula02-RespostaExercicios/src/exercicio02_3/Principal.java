/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02_3;

/**
 *
 * @author alex.lopes
 */
public class Principal {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.titular = "Reges";
        conta.agencia = "89887";
        conta.numero = 123;
        conta.saldo = 8888;

        System.out.println("Abertura de conta");
        conta.imprimir();

        System.out.println("------------------");
        System.out.println("Depois de depositar");
        conta.depositar(10);

        conta.imprimir();
        System.out.println("------------------");

        System.out.println("Depois de sacar");
        conta.sacar(20);
        conta.imprimir();
        System.out.println("------------------");

        System.out.println("Depois de investir");
        conta.investir();
        conta.imprimir();
        System.out.println("------------------");
        
        
        System.out.println("Conta Poupança");
        
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.titular = "Angelo";
        contaPoupanca.agencia = "9888";
        contaPoupanca.numero = 456;
        contaPoupanca.saldo = 80;

        System.out.println("Abertura de conta");
        contaPoupanca.imprimir();

        System.out.println("------------------");
        System.out.println("Depois de depositar");
        contaPoupanca.depositar(10);

        contaPoupanca.imprimir();
        System.out.println("------------------");

        System.out.println("Depois de sacar");
        contaPoupanca.sacar(20);
        contaPoupanca.imprimir();
        System.out.println("------------------");

        System.out.println("Depois de investir");
        contaPoupanca.investir();
        contaPoupanca.imprimir();
        System.out.println("------------------");
    }
}
