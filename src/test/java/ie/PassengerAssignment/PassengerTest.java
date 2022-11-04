package ie.PassengerAssignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;
//import static ie.PassengerAssignment.Passenger.getAge;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PassengerTest {
    Passenger myPassenger ;
    Passenger myPassenger1 ;
    Passenger myPassenger2 ;

    @BeforeEach
    void setUp() {
        myPassenger = new Passenger("Mr", "igor", "1233567891", "08710123123", 20);
        myPassenger1 = new Passenger("Ms", "igor", "1233567891", "08710123123", 20);
        myPassenger2 = new Passenger("Mrs", "igor", "1233567891", "08710123123", 20);
    }
    @Test
    void test_ValidMrTitle() {
       assertEquals("Mr", myPassenger.getTitle());
    }
    @Test
    void test_ValidMsTitle() {
        assertEquals("Ms", myPassenger1.getTitle());
    }
   @Test
    void test_ValidMrsTitle() {
        assertEquals("Mrs", myPassenger2.getTitle());
    }
    @Test
    void Test_InvalidTitle() {
        String invalidTitle1 = myPassenger.setTitle("bad title");
       // String errString = "Error!, You must enter a correct title(Mr/Ms/Mrs). ";
        String result = myPassenger.getTitle();
        assertEquals(invalidTitle1, result);
    }
    @Test
    void test_ValidName() {
        assertEquals("igor", myPassenger.getName());
    }
    @Test
    void Test_InvalidName() {
       String invalidName1 =  myPassenger.setName("m");
       // String errString = "Error!, You must enter a Name(min 3 char). ";
        String result = myPassenger.getName();
        assertEquals(invalidName1, result);
    }
    @Test
    void test_ValidAge() {
        assertEquals(20, myPassenger.getAge());
    }
    @Test
    void Test_InvalidAge() {
        myPassenger.setAge(5);
        int result = myPassenger.getAge();
        assertEquals(0, result);
    }
    @Test
    void test_ValidID() {
        assertEquals("1233567891", myPassenger.getID());
    }
    @Test
    void Test_InvalidID() {
        myPassenger.setID("12349");
        String errString =  "the id you have typed is invalid: "+"12349";
        String result = myPassenger.getID();
        assertEquals(errString, result);
    }
    @Test
    void test_ValidPhone() {
        assertEquals("08710123123", myPassenger.getPhone());
    }
    @Test
    void Test_InvalidPhone() {
        myPassenger.setPhone("1234");
        String errString = "phone you have typed is invalid: 1234";
        String result = String.valueOf(myPassenger.getPhone());
        assertEquals(errString, result);
    }
    @AfterEach
    void tearDown() {
    }

}