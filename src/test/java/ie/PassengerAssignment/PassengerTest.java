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

    @BeforeEach
    void setUp() {
        myPassenger = new Passenger("Mr", "igor", "1233567891", "08710123123", 20);
    }
    @Test
    void test_ValidTitle() {
       assertEquals("Mr", myPassenger.getTitle());
    }
    @Test
    void Test_InvalidTitle() {
        myPassenger.setTitle("bad title");
        String errString = "Error!, You must enter a correct title. ";
        String result = myPassenger.getTitle();
        assertEquals(errString, result);
    }
    @Test
    void test_ValidName() {
        assertEquals("igor", myPassenger.getName());
    }
    @Test
    void Test_InvalidName() {
        myPassenger.setName("m");
        String errString = "Error!, You must enter a Name. ";
        String result = myPassenger.getName();
        assertEquals(errString, result);
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