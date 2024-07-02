package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            try {
                Scanner fileIn = new Scanner(new File("/Users/qian/Desktop/ZipCode/Java/FileIOJava/Step4/input.txt"));
                int sum =0;
                while(fileIn.hasNext()){
                    String lineIn = fileIn.nextLine();

                    String[] input = lineIn.split("\n");
                    //int sum=0;
                    for(int i=0;i<input.length;i++){
                        sum += Integer.parseInt(input[i]);
                        System.out.println("running total is " +sum+"\n");
                    }


                }

            }catch (IOException e){
                System.out.println("File not found.");
            }
        }
}