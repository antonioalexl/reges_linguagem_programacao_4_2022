/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aula09;

/**
 *
 * @author alex.lopes
 */
public interface IClienteData {
    
    public boolean inserir(Cliente cliente);
    
    public boolean alterar(Cliente cliente);
    
     public void remover(int id);
}
