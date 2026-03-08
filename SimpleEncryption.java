// import java.util.Scanner;

// public class Self_doing_Encryption {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String text = sc.nextLine();

//         // initializing array for storing each characters
//         char[] charArray = new char[text.length()];
//         for(int i=0;i<text.length();i++){
//             // convert text into characters
//             charArray[i] = text.charAt(i);

            
//         }
//         // input secret key 
//         int key = sc.nextInt();

//         char character  ;  // characters shoold be in capital letters.
//         int charValue;
        
//         switch (charArray[i]) {
//             case 'A': charValue = 0; break;
//             case 'B': charValue = 1; break;
//             case 'C': charValue = 2; break;
//             case 'D': charValue = 3; break;
//             case 'E': charValue = 4; break;
//             case 'F': charValue = 5; break;
//             case 'G': charValue = 6; break;
//             case 'H': charValue = 7; break;
//             case 'I': charValue = 8; break;
//             case 'J': charValue = 9; break;
//             case 'K': charValue = 10; break;
//             case 'L': charValue = 11; break;
//             case 'M': charValue = 12; break;
//             case 'N': charValue = 13; break;
//             case 'O': charValue = 14; break;
//             case 'P': charValue = 15; break;
//             case 'Q': charValue = 16; break;
//             case 'R': charValue = 17; break;
//             case 'S': charValue = 18; break;
//             case 'T': charValue = 19; break;
//             case 'U': charValue = 20; break;
//             case 'V': charValue = 21; break;
//             case 'W': charValue = 22; break;
//             case 'X': charValue = 23; break;
//             case 'Y': charValue = 24; break;
//             case 'Z': charValue = 25; break;

//             default: charValue = 0;
//             }
    
//     }
// }


import java.util.Scanner;

public class SimpleEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter text (UPPERCASE): ");
        String text = sc.nextLine();
        
        System.out.println("Enter secret key: ");
        int key = sc.nextInt();

        char[] charArray = text.toCharArray();
        String result = "";

        for (int i = 0; i < charArray.length; i++) {
            int charValue = -1;

            // 1. Convert Character to Numeric Value (0-25)
            switch (charArray[i]) {
                case 'A': charValue = 0; break; case 'B': charValue = 1; break;
                case 'C': charValue = 2; break; case 'D': charValue = 3; break;
                case 'E': charValue = 4; break; case 'F': charValue = 5; break;
                case 'G': charValue = 6; break; case 'H': charValue = 7; break;
                case 'I': charValue = 8; break; case 'J': charValue = 9; break;
                case 'K': charValue = 10; break; case 'L': charValue = 11; break;
                case 'M': charValue = 12; break; case 'N': charValue = 13; break;
                case 'O': charValue = 14; break; case 'P': charValue = 15; break;
                case 'Q': charValue = 16; break; case 'R': charValue = 17; break;
                case 'S': charValue = 18; break; case 'T': charValue = 19; break;
                case 'U': charValue = 20; break; case 'V': charValue = 21; break;
                case 'W': charValue = 22; break; case 'X': charValue = 23; break;
                case 'Y': charValue = 24; break; case 'Z': charValue = 25; break;
                default: charValue = -1; // For spaces or symbols
            }

            if (charValue != -1) {
                // 2. Apply the Encryption Formula
                int encryptedValue = (charValue + key) % 26;

                // 3. Convert Numeric Value back to Character
                char encryptedChar = (char) (encryptedValue + 'A'); 
                result += encryptedChar;
            } else {
                result += charArray[i]; // Keep spaces as they are
            }
        }

        System.out.println("Encrypted Text: " + result);
    }
}