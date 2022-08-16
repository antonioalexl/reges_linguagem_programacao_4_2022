/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02_abstracao;

/**
 *
 * @author alex.lopes
 */
public class Formato extends Forma {

    @Override
    float quadrado(float lado) {
       return lado * lado;
    }

    @Override
    float triangulo(float base, float altura) {
        return ((base * altura) / 2 );
    }

    @Override
    float circunferencia(float raio) {
        return (float)Math.PI * raio * raio;
    }
    
}
