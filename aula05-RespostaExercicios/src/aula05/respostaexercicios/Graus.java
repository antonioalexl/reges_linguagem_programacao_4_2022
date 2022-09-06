/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05.respostaexercicios;

/**
 *
 * @author alex.lopes
 */
public class Graus {

    public static double Fahrenheit(double c) {

        double retorno = (c * 1.8) + 32;
        return retorno;
    }

    public static double Kelvin(double c) {

        double retorno = c + 273.15;
        return retorno;
    }

    public static double Reaumur(double c) {

        double retorno = c * 0.8;
        return retorno;
    }

    public static double Rankine(double c) {

        double retorno = (c * 1.8) + 32 + 459.67;
        return retorno;
    }


    /*
    Fahrenheit (F), Kelvin (K), Réaumur (Re) e Rankine (Ra) De acordo com as  fórmulas:

    a) F = C * 1.8 + 32;
    
    b) K = C + 273.15;
    
    c) Re = C * 0.8;

    d) Ra = C * 1.8 + 32 + 459.67
     */
}
