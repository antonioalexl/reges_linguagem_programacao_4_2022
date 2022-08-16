/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01.respostaexercicios;

/**
 *
 * @author alex.lopes
 */
public class Pessoa {
    
    /*
    (nome, telefone, email, endereço e
valor desconto).
    */
 
    protected String nome;
    protected String telefone;
    protected String email;
    protected String endereco;
    protected float valorDesconto;
    
    
    public Pessoa(String nome, String telefone, String email, String endereco, float desconto)
    {    
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.valorDesconto = desconto;    
    }
    
    public void calcularDesconto(float valor)
    {
        this.valorDesconto =  (1 + (valor / 100) ) * this.valorDesconto;    
    }
    
    public void imprimir(){
        System.out.println("Nome: "  + nome);
        System.out.println("Telefone: "  + telefone);
        System.out.println("E-mail: "  + email);
        System.out.println("Valor Desconto: "  + valorDesconto);                   
    }
}


