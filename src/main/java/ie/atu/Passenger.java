package ie.atu;

import java.util.Scanner;

public class Passenger {


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

        public static void getName(){
            Scanner input = new Scanner(System.in);
            String word="";
            while(word.length()<3){
                System.out.println("Enter a Name (min 3 characters): ");
                word = input.nextLine();
            }
            System.out.println("The Name you have typed is: " + word);
        }

        public static void getID(){
            Scanner input1 = new Scanner(System.in);
            String id1="";
            while(id1.length()<10){
                System.out.println("Enter a ID (min 10 characters): ");
                id1 = input1.nextLine();
            }
            System.out.println("The ID you have typed is: " + id1);
        }
        public static void getPhone(){
            Scanner input1 = new Scanner(System.in);
            String phone="";
            while(phone.length()<10){
                System.out.println("Enter a Phone (min 7 characters): ");
                phone = input1.nextLine();
            }
            System.out.println("The phone you have typed is: " + phone);
        }
        public static void getAge(){
            int age;
            age = 0;
            Scanner age_input = new Scanner(System.in);
            System.out.println("Enter your age: ");
            age = age_input.nextInt( );
            while(age < 16) {
                System.out.println("You must be atleast 16 or above");
                System.out.println("You have entered your age as " + age);
                System.out.println("Enter your age: ");
                age = age_input.nextInt( );
            }
            System.out.println("Seat Reserved");
        }
}
