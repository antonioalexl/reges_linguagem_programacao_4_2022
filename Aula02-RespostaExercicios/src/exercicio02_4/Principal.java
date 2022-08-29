/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02_4;

/**
 *
 * @author alex.lopes
 */
public class Principal {
    
    public static void main(String[] args) {
         /*TV tv = new TV();
         tv.ligarDesligar();
         tv.ligarDesligar();
         
         for (int i = 0; i < 1000; i++) {
            tv.aumentarCanal();
            tv.aumentarVolume();
        }
         
          for (int i = 0; i < 1000; i++) {
            tv.diminuirCanal();
            tv.diminuirVolume();
        }*/
         
          
          
                 Radio radio = new Radio();
         radio.ligarDesligar();
         radio.ligarDesligar();
         
         for (int i = 0; i < 1000; i++) {
            radio.aumentarCanal();
            radio.aumentarVolume();
        }
         
         System.out.println("------------------");
         
         for (int i = 0; i < 100; i++) {
            radio.diminuirCanal();
            radio.diminuirVolume();
        }
         
    }
}
