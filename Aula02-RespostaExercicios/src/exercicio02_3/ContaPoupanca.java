/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02_3;

/**
 *
 * @author alex.lopes
 */
public final class ContaPoupanca extends Conta implements IConta {

    @Override
    public void depositar(float valor) {
       saldo = saldo + valor;
    }

    @Override
    public void sacar(float valor) {
        saldo = saldo - valor;
    }

    @Override
    public void investir() {
        saldo = saldo * 1.03;
    }

    @Override
    public void imprimir() {
       System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
    
}
