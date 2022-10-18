/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07.respotaexercicio;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author alex.lopes
 */
public class ReadTextFile {

    private static Scanner input;

    /*public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }*/
    public static void openFile() {
        try {
            input = new Scanner(Paths.get("clients.txt"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }
    // lê o registro no arquivo

    public static Cliente readRecords() {                      

        try {
            
            
            Cliente cliente = new Cliente(input.next(), input.next(), input.next(), input.nextDouble());
            // exibe o conteúdo de registro            
            return cliente;

        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
        
        return null;
    } // fim do método readRecords

    public static void closeFile() {
        if (input != null) {
            input.close();
        }
    }

}
