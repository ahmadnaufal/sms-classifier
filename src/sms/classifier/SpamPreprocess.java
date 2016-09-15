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
 * @author fauzanrifqy
 */
public class SpamPreprocess {
    
    public SpamPreprocess(){}
    
    public String spamStemming(File file){
        String stemmed = "";
        try {
            
            Scanner text = new Scanner(file);
            
            while(text.hasNextLine()){
                String line = text.nextLine();
                IndonesianStemmer stemmer = new IndonesianStemmer();
                stemmed = stemmer.stem(line);
                stemmed = stemmer.stemSentence(stemmed);
                stemmed = stemmer.stemRepeatedWord(stemmed);
                
                // Debugging print out
                System.out.println(line);
                System.out.println(stemmed);
            } 
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SmsClassifier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stemmed;
    }
}
