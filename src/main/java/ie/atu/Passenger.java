package ie.atu;

import java.util.Scanner;

public class Passenger {
    public static void main(String[]args){
        getTitle();

    }

        public static void getTitle(){
            boolean valid = false;
            Scanner keyboardIn = new Scanner(System.in);
            System.out.println("ENTER ACCOUNT DETAILS: ");
            String title;
            do {
                System.out.print("Enter Title: ");
                title = keyboardIn.nextLine();
                if (title.equals("Mr") || title.equals("Mrs") || title.equals("Ms") || title.equals("Miss")) {
                    System.out.println("title has been selected ");
                    valid = true;
                } else {
                    System.out.println("Error!, You must enter a correct title. ");
                }
            } while (!valid);
        }

}
