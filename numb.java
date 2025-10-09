import java.util.Scanner;

class Rearrange {
    String wrd;     // to store the original word
    String newwrd;  // to store the rearranged word

    // Constructor
    Rearrange() {
        wrd = "";
        newwrd = "";
    }

    // To read a word in UPPER case
    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word in UPPER CASE: ");
        wrd = sc.next().toUpperCase();
    }

    // To count vowels and consonants and print their frequencies
    void freq_vow_con() {
        int vow = 0, con = 0;
        for (int i = 0; i < wrd.length(); i++) {
            char ch = wrd.charAt(i);
            if ("AEIOU".indexOf(ch) != -1)
                vow++;
            else if (Character.isLetter(ch))
                con++;
        }
        System.out.println("Number of vowels: " + vow);
        System.out.println("Number of consonants: " + con);
    }

    // To rearrange the word with vowels first, then consonants
    void arrange() {
        String vowels = "", consonants = "";
        for (int i = 0; i < wrd.length(); i++) {
            char ch = wrd.charAt(i);
            if ("AEIOU".indexOf(ch) != -1)
                vowels += ch;
            else
                consonants += ch;
        }
        newwrd = vowels + consonants;
    }

    // To display original and rearranged word
    void display() {
        System.out.println("Original word: " + wrd);
        System.out.println("Rearranged word: " + newwrd);
    }

    // Main method
    public static void main(String[] args) {
        Rearrange obj = new Rearrange();
        obj.readword();
        obj.arrange();
        obj.freq_vow_con();
        obj.display();
    }
}
