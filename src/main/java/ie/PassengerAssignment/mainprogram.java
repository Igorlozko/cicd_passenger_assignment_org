package ie.PassengerAssignment;

import static ie.PassengerAssignment.Passenger.*;

public class mainprogram {
    public static void main(String[] args) {

    }

        private static int getLength(int num) {
           int count = 1;
            while (num >= 10) {
                num = num / 10;
                count++;
            }
            return count;
       }
}
