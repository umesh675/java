package assignment.assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {

        Scanner inFile;
        HashMap<Character,Integer> countCharacter = new HashMap<>();

        try {
            inFile = new Scanner(new File("F:\\Internship\\src\\main\\java\\assignment\\assignment11\\TextFile"));

            while (inFile.hasNext()){
                String string = inFile.nextLine();
                char chArr[] = string.toCharArray();

                for(char ch :chArr){

                    if(countCharacter.containsKey(ch)){
                        countCharacter.put(ch,(countCharacter.get(ch)+1));
                    }
                    else{
                        countCharacter.put(ch,1);
                    }
                }
            }

            for (char ch : countCharacter.keySet()) {
                System.out.println(ch + " occurs " + countCharacter.get(ch) + " times");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
