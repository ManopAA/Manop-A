package dayTwo;

import java.util.Scanner;

public class MyString {
    
    public static void main(String[] agrs) {
        System.out.print("Please enter your first and last name:");
        Scanner sc = new Scanner(System.in);
        String vinput = sc.nextLine();
        
        int spaceIndex = vinput.indexOf(" ");
        
        String firstName = vinput.substring(0, spaceIndex);
        String lastName = vinput.substring(spaceIndex+1);
        
        System.out.println("My first name:"+firstName);
        System.out.println("My last name:"+lastName);  
        
        StringBuilder sb = new StringBuilder(firstName);
        sb.append(".A");
        System.out.println("New first name: " + sb);
    }
    
}
