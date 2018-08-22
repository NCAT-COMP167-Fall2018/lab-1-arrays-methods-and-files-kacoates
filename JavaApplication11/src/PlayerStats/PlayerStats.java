/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayerStats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KennediCoates
 */
public class PlayerStats{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names = new String [80];
        int[] scores = new int [80];
        
        readingNamesAndScore(names, scores, args[0]);
//        
//        int two;
//        two = 2;
//        
//        boolean true_false = false;
//        int five = 5;
//        String name = "Kennedi";
//        double fractions = 5.5;
    }
    
    private static void readingNamesAndScore(String[] names, int[] scores, String myFile){
        
        try {
            Scanner reader = new Scanner(new File(myFile));
            
            int currentIndex = 0;
            
            while(reader.hasNext()){
                String [] line = reader.nextLine().split("");
                
                names[currentIndex] = line[0];
                scores[currentIndex] = Integer.parseInt(line[1]);
                
                currentIndex++;
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("File could not be found in reading names and scores.");
            Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

