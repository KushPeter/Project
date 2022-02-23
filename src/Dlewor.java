import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Dlewor {

    // constants to allow colored text and backgrounds
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) throws FileNotFoundException {
        // print welcome message
        System.out.println("Welcome to Dlewor(TM)");

        // Hello World for colored text and background
        /*System.out.print(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Hello ");
        System.out.print(ANSI_YELLOW_BACKGROUND + ANSI_BLACK + "World");
        System.out.print(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "!");
        System.out.println(ANSI_RESET);

         */
        String word = null;

        BufferedReader myFile = new BufferedReader(new FileReader("/Users/peterkushaev/Project/src/vocab.nytimes.random.txt"));
        Scanner fileReader = new Scanner(myFile);
        Scanner keyboardReader = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();


        while(fileReader.hasNextLine()){

            word = fileReader.nextLine();

            if (word.length() == 5){
                words.add(word);

            }else {

            }
        }

        //System.out.println(words);

        Random rand = new Random();
        int randN = rand.nextInt(words.size());

        System.out.println(words.get(randN));

        System.out.println("Please enter the world");
        String word1 = keyboardReader.nextLine();

        System.out.println(dictionaryCheck(word1, words));


        //System.out.println(word1);

    }
    public static boolean dictionaryCheck(String word1, ArrayList<String> words ){

        boolean tf = true;

        for (int i = 0; i < words.size(); i++){
            if (word1.equals(words.get(i))){
                tf = true;
                break;
            }else {
                tf = false;

            }
        }
        return tf;
    }
}
