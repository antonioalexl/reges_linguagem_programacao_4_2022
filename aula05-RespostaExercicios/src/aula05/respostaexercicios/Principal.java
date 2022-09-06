/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05.respostaexercicios;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex.lopes
 */
public class Principal {

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FrmDivisao().setVisible(true);
            }
        });

       /* try {
            converter();
        } catch (ErroStringInteiro ex) {
            System.out.println(ex.getMessage());
        }*/
       
       
      // Formas f = new Formas();
       
       /* System.out.println(Formas.circulo(80));
        System.out.println(Formas.quadrado(20,20));
        System.out.println(Formas.tringulo(2,4));
        */
        
        
        System.out.println("Fahrenheit: " +  Graus.Fahrenheit(35));
        System.out.println("Kelvin:" +  Graus.Kelvin(35));
        System.out.println("Rankine:" + Graus.Rankine(35));
        System.out.println("Reaumur:" + Graus.Reaumur(35));

    }

    private static void converter() throws ErroStringInteiro {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");

        try {
            int numero = scan.nextInt();

        } catch (Exception ex) {
            throw new ErroStringInteiro();
        }

    }

}
