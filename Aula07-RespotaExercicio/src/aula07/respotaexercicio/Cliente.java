/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07.respotaexercicio;

/**
 *
 * @author alex.lopes
 */
public class Cliente {

    
    private String nome;
    private String telefone;
    private String email;
    private double salario;
    
    
    public Cliente(String nome, String telefone, String email, double salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.salario = salario;
    }   
    
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public double getSalario() {
        return salario;
    }
 

    
            
            
    
}
