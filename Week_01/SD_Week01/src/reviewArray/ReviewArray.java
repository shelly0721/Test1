
package reviewArray;

/**
 *
 * @author nakamurasayaka
 */
import java.util.Scanner;

public class ReviewArray {

    public static void main(String[] args) {
        
        char[] myWord = new char[7];
        myWord[0] = 's';
        myWord[1] = 't';
        myWord[2] = 'u';
        myWord[3] = 'd';
        myWord[4] = 'e';
        myWord[5] = 'n';
        myWord[6] = 't';
        
        for (char s : myWord) {
            System.out.print(s);
        }
            
        System.out.println();
        
            // print backwards
        for (int i = myWord.length-1; i >= 0; i--) {
            System.out.print(myWord[i]);
        }
        
        
        System.out.println();
        System.out.println();
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word : ");
        String word = in.nextLine();
    
    char[] myLetters = new char[word.length()];
    
    for(int i = 0; i < myLetters.length; i++) {
        myLetters[i] = word.charAt(i);
        System.out.print(myLetters[i]);
    }
    
    
     
        
        
    }
    
}
