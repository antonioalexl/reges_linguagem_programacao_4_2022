/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02.respostaexercicios;

/**
 *
 * @author alex.lopes
 */
public final class PessoaFisica extends Pessoa implements IPessoa {

    private String cpf;

    public PessoaFisica(String nome, String telefone, String email, String endereco, float desconto, String cpf) {
        super(nome, telefone, email, endereco, desconto);
        this.cpf = cpf;
    }

    @Override
    public void calcularDesconto(float valor) {
        valor = valor + 10;
        valorDesconto = (1 + (valor / 100)) * valorDesconto;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
        System.out.println("Valor Desconto: " + valorDesconto);
        System.out.println("Cpf: " + cpf);
    }

    

}
