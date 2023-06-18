/* Write a java program to read external file. 
Create a function to encrypt and decrypt data 
and store it into an external target file */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Target;

import javax.xml.transform.Source;

public class Exp4_ExternalFile {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer;

    public static String Source ="E:\\OPJU\\6th Sem FEB2023_JUNE2023\\Cryptography\\souce.txt";
    public static String Target ="E:\\OPJU\\6th Sem FEB2023_JUNE2023\\Cryptography\\target.txt";
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("Select one of the following:");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. View encrypted");
            System.out.println("4. View decrypted");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            try {
                choice = Integer.parseInt(reader.readLine());
                switch (choice) {
                    case 1:
                        encrypt();
                        break;
                    case 2:
                        decrypt();
                        break;
                    case 3:
                        viewEncrypted();
                        break;
                    case 4:
                        viewDecrypted();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error occurred: " + e.getMessage());
            }
        }
    }

    public static void encrypt() throws IOException {
        System.out.println();
        BufferedReader inputFile = new BufferedReader(new FileReader(Source));
        writer = new BufferedWriter(new FileWriter(Target));

        int ch;
        while ((ch = inputFile.read()) != -1) {
            ch = ch - 40;
            writer.write(ch);
        }

        inputFile.close();
        writer.close();
        System.out.println("Encryption completed.\n");
    }

    public static void decrypt() throws IOException {
        System.out.println();
        BufferedReader inputFile = new BufferedReader(new FileReader(Source));
        writer = new BufferedWriter(new FileWriter(Target));

        int ch;
        while ((ch = inputFile.read()) != -1) {
            ch = ch + 40;
            writer.write(ch);
        }

        inputFile.close();
        writer.close();
        System.out.println("Decryption completed.\n");
    }

    public static void viewEncrypted() throws IOException {
        System.out.println();
        BufferedReader inputFile = new BufferedReader(new FileReader(Target));

        int ch;
        while ((ch = inputFile.read()) != -1) {
            System.out.print((char) ch);
        }

        System.out.println("\n");
        inputFile.close();
    }

    public static void viewDecrypted() throws IOException {
        System.out.println();
        BufferedReader inputFile = new BufferedReader(new FileReader(Source));

        int ch;
        while ((ch = inputFile.read()) != -1) {
            System.out.print((char) ch);
        }

        System.out.println("\n");
        inputFile.close();
    }
}

