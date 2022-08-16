/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01.respostaexercicios;

/**
 *
 * @author alex.lopes
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, String endereco, float desconto, String cnpj) {
        super(nome, telefone, email, endereco, desconto);
        this.cnpj = cnpj;
    }

    @Override
    public void calcularDesconto(float valor) {

        // 1 - FORMA
        /*valor = valor + 20;        
        float valorTemp = valorDesconto *  (valor / 100);        
        valorDesconto = valorDesconto - valorTemp;*/
        
        // 2 - FORMA
        /*float valorTemp = valorDesconto *  ((valor + 20) / 100); 
         valorDesconto = valorDesconto - valorTemp;*/
        
        // 3 - FORMA
        valorDesconto = valorDesconto - (valorDesconto * ((valor + 20) / 100));

    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
        System.out.println("Valor Desconto: " + valorDesconto);
        System.out.println("Cnpj: " + cnpj);
    }

}
