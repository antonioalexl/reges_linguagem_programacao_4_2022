/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05.respostaexercicios;

/**
 *
 * @author alex.lopes
 */ 
public class ErroStringInteiro extends Exception  {
    
    
    @Override
    public String getMessage(){
        return "Erro ao converter string para inteiro";
    }
    
}
