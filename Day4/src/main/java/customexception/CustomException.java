package customexception;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomException {
    // Method of validate age
    public static void validateAge(int age) throws InvalidAgeException{

        // Checking if age is greater than 18
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("You are Eligible!");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input of age
        int age = input.nextInt();

        // Calling validate age and catching if exception occur
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
