
package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main
{
// creating a file with text and removing the element "e" in each word in the file and replacing it with "_"
    public static void main(String[] args) throws IOException {
        // Open the file to read the content and modify  it in a while loop
        File file =  new File("C:\\Users\\NEAK\\Documents\\Moby Dick\\md.txt");
        Scanner scan = new Scanner(file);
        String file_content = "";
        // extracting sentence by sentence and replacing the character "e" with "_" in a while loop 
        while(scan.hasNextLine())
        {
            // loop extract each sentence and passes to the variable sentence
            String sentence = scan.nextLine();
            // the replace method is used to replace the character "e" with "_"
            sentence = sentence.replace("e", "_");
            // the sentences are then concatenated 
            file_content = file_content.concat(sentence + "\n");
            System.out.println(sentence);
        }
        // Writing the sentence modified in the loop to a new file
        FileWriter writer = new FileWriter("C:\\Users\\NEAK\\Documents\\Moby Dick\\md2.txt");        
        writer.write(file_content);
        writer.close();
    }
}
