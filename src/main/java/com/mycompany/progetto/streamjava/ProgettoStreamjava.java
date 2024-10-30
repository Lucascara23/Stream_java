/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progetto.streamjava;

/**
 *
 * @author lucascarabattoli
 */
import java.io.*;
public class ProgettoStreamjava {

    public static void main(String[] args) {

        try {
            Scrittura scrittura = new Scrittura(args[0]);
        } catch (IOException ex) {
            System.out.println("Errore di I/O.");
            System.exit(1);
        }
    }
}
