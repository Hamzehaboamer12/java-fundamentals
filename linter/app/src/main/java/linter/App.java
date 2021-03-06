package linter;
import java.io.*;
import java.nio.file.*;

import java.util.*;

public class App {
    public static ArrayList<String> readFile(String filePath){
        ArrayList<String> line=new ArrayList<>();

        File file=new File(filePath);
        Scanner fileScanner;

        try{
            fileScanner =  new Scanner(file);

        }catch (Exception e){
            System.out.println("The file dose not exist. ");
            return line;
        }

        int currentLine=1;

        while (fileScanner.hasNextLine()){
            String nextLine=fileScanner.nextLine();

            if (!nextLine.contains(";")&&
                    nextLine.length() != 0 &&
                    !nextLine.contains("if")   &&
                    !nextLine.contains("else") &&
                    nextLine.charAt(nextLine.length()-1) !='{' &&
                    nextLine.charAt(nextLine.length()-1) != '}'
            ) {
                String alert =  "Line " + currentLine + ": Missing semicolon";
                System.out.println(alert);
                line.add(alert);
            }
            currentLine++;
        }
        System.out.println(line.size());
        return line;

    }
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}