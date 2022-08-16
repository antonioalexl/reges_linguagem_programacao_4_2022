/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02.respostaexercicios;

/**
 *
 * @author alex.lopes
 */
public class Aula02RespostaExercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       // Pessoa pessoa = new Pessoa("Bruce Banner", "122211", "bruce@stark.cm", "Torre Stark", 80);

        
        
        PessoaJuridica pesJuridica = new PessoaJuridica("Bruce Banner", "122211", "bruce@stark.cm", "Torre Stark", 80, "3321212");
        pesJuridica.imprimir();
        System.out.println("-----------------Após desconto----------");
        pesJuridica.calcularDesconto(10);
        pesJuridica.imprimir();
        
        
        PessoaFisica pesFisica = new PessoaFisica("Bruce Banner", "122211", "bruce@stark.cm", "Torre Stark", 80, "3321212");
        pesFisica.imprimir();
        System.out.println("-----------------Após desconto----------");
        pesFisica.calcularDesconto(10);
        pesFisica.imprimir();
    }

}
