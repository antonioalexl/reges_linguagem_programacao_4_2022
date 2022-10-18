/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07.respotaexercicio;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author alex.lopes
 */
public class CreateTextFile {

    private static Formatter output; // envia uma saída de texto para um arquivoÿ

    /*public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }*/
    public static void openFile() {
        try {
            output = new Formatter("clients.txt"); // abre o arquivo
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // termina o programa
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // termina o programa
        }
    }

    public static void addRecords(String nome, String telefone, String email, double salario) {

        try {
            // gera saída do novo registro para o arquivo; supõe entrada válida                              
            output.format("%s %s %s %.2f%n", nome,
                    telefone, email, salario);

        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file. Terminating.");

        } catch (NoSuchElementException elementException) {
            System.err.println("Invalid input. Please try again.");
        }
        System.out.print("? ");

    } //

    public static void closeFile() {
        if (output != null) {
            output.close();
        }
    }
}
