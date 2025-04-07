import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        
String str = " Welcome to the Java String Lab! ";
System.out.println("Original String: \"" + str + "\"");
// length

System.out.println("Length: " + str.length());

//charAt

System.out.println("Character at index 7: " + str.charAt(7));

// substring the J is at 16 a is at 21

System.out.println("Substring 'Java': " + str.substring(16, 21));

// upper and lowercase

System.out.println("Uppercase: " + str.toUpperCase());
System.out.println("Lowercase: " + str.toLowerCase());

//indexOf

System.out.println("Index of 'Java': " + str.indexOf("Java"));

//contains

System.out.println("Contains 'Lab': " + str.contains("Lab"));

//replace

System.out.println("Replace 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));

//split
System.out.println("Words in the string:");
String[] words = str.split(" ");
for (String word : words) {
    if (!word.isEmpty()) {
        System.out.println(word);

    }
}
//trim
System.out.println("Trimmed String: \"" + str.trim() + "\"");

//equals and equals ignore caseeeee

String comparisonStr = "java string lab!";
System.out.println("Equals (case-sensitive): " + str.trim().equals(comparisonStr));
System.out.println("Equals (ignore case): " + str.trim().equalsIgnoreCase(comparisonStr));
  

// lets gooooo

int vowelCount = 0;
String vowels = "aeiouAEIOU";
for (int i = 0; i < str.length(); i++) {
    if (vowels.indexOf(str.charAt(i)) != -1) {
        vowelCount++;
    }
}

System.out.println("Number of vowels: " + vowelCount);

//palindrome my g number is almost a palindrome 01181106 curse that 6

String word = "racecar";
int left = 0, right = word.length() - 1;
boolean isPalindrome = true;
while (left < right) {
    if (word.charAt(left) != word.charAt(right)) {
        isPalindrome = false;
        break;
    }

    left++;
    right--;

}
System.out.println("Is '" + word + "' a palindrome?" + isPalindrome);

Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a sentence that contains the word 'Java': ");
            input = scanner.nextLine();
        }
        while (!input.contains("Java"));
        System.out.println("Thank you!");

        // task 3
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sb.toString());
        int start = sb.indexOf("Learning");
        int end = start + "Learning".length();
        sb.delete(start, end);
        System.out.println("After delete: " + sb.toString());
        sb.reverse();
        System.out.println("Reversed: " + sb.toString());

        // quatro please
        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        sbf.append(" - Learning Java");
        sbf.insert(sbf.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sbf.toString());
        start = sbf.indexOf("Learning");
        end = start + "Learning".length();
        sbf.delete(start, end);
        System.out.println("After delete: " + sbf.toString());
        sbf.reverse();
        System.out.println("Reversed: " + sbf.toString());


    }
}     
      // i dont know why the scanner is giving me "resource leak" PLEASE SPARE ME IT WORKS IT WORKS PLEASE    

