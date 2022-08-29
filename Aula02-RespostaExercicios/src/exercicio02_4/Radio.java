/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02_4;

/**
 *
 * @author alex.lopes
 */
public final class Radio extends Device implements IDevice {

      @Override
    /* 0 - desligado 1-ligado*/
    public void ligarDesligar() {
        ligado = !ligado;
        
         System.out.println("ligado:" + ligado);
    }

    @Override
    public void aumentarVolume() {

        if (volume < 100) {
            volume++;
        }
        System.out.println("Volume:" + volume);
    }

    @Override
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("Volume:" + volume);
    }

    @Override
    public void aumentarCanal() {
        if (canal < 100) {
            canal = canal + 10;
        }

        System.out.println("Canal:" + canal);

    }

    @Override
    public void diminuirCanal() {
         if (canal > 0) {
            canal = canal - 10;
        }

        System.out.println("Canal:" + canal);

    }
    
}
