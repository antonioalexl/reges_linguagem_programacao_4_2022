/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio02_interface;

/**
 *
 * @author alex.lopes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Forma forma = new Forma();
        
        System.out.println("Quadrado: " + forma.quadrado(3));
        System.out.println("Triângulo: " + forma.triangulo(3,4));
        System.out.println("Circulo: " + forma.quadrado(30));
        
                           
    }
    
}
