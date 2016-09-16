/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.classifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ahmad
 */
public class StringToWordProcessor {
    
    private Map<String, Integer> totalWords;
    private List<String> processedSentences;

    /**
     *
     * @param l
     */
    public StringToWordProcessor(List<String> l) {
        totalWords = new HashMap<>();
        processedSentences = l;
    }
    
    public List<String> stringAttribute() {
        List<String> finalWords = new ArrayList<>();
        
        for (String line : processedSentences) {
            String words[] = line.split(" ");
            for (String word : words) {
                if (word.length() > 1 && !finalWords.contains(word)) {
                    finalWords.add(word);
                }
            }
        }
        
        return finalWords;
    }
    
}
