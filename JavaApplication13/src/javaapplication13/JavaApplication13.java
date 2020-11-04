/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename to write to: ");
        String fileName = keyboard.nextLine();
        File fileToWrite = new File(fileName);
       FileWriter fileWriter = new FileWriter(fileToWrite, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
System.out.println("Enter a filename to write to: ");
        String fileName = keyboard.nextLine();
        File fileToWrite = new File(fileName);
       FileWriter fileWriter = new FileWriter(fileToWrite, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);System.out.println("Enter a filename to write to: ");
        String fileName = keyboard.nextLine();
        File fileToWrite = new File(fileName);
       FileWriter fileWriter = new FileWriter(fileToWrite, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
System.out.println("Enter a filename to write to: ");
        String fileName = keyboard.nextLine();
        File fileToWrite = new File(fileName);
       FileWriter fileWriter = new FileWriter(fileToWrite, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
System.out.println("Enter a filename to write to: ");
        String fileName = keyboard.nextLine();
        File fileToWrite = new File(fileName);
       FileWriter fileWriter = new FileWriter(fileToWrite, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
    }
}