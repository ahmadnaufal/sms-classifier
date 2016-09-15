/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.classifier;

import IndonesianNLP.IndonesianStemmer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmad
 */
public class SmsClassifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // File file = File.Input();
        File file = new File("text.txt");
        SpamPreprocess spamPreprocess = new SpamPreprocess();
        
        String dataset = spamPreprocess.spamStemming(file);
        
        // preprocessing(file);
        // IDTree idt = buildIDTree(file);
        // idt.isSpam(String);
    }
    
}
