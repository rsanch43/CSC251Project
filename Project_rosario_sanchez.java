import java.util.Scanner;

/**
   This is a demo program where user is asked for input
   to determine policy price. 
   
   Creates an instance of the Policy class.
*/

public class Project_rosario_sanchez {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Create a Policy object
        Policy policy = new Policy();

        // Input for policy attributes
        System.out.print("Please enter the Policy Number: ");
        String policyNumber = keyboard.nextLine();
        policy.setPolicyNumber(policyNumber);

        System.out.print("Please enter the Provider Name: ");
        String providerName = keyboard.nextLine();
        policy.setProviderName(providerName);

        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = keyboard.nextLine();
        policy.setFirstName(firstName);

        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = keyboard.nextLine();
        policy.setLastName(lastName);

        System.out.print("Please enter the Policyholder's Age: ");
        int age = keyboard.nextInt();
        policy.setAge(age);
        
        keyboard.nextLine();
        
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = keyboard.nextLine();
        policy.setSmokingStatus(smokingStatus);

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double height = keyboard.nextDouble();
        policy.setHeight(height);

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double weight = keyboard.nextDouble();
        policy.setWeight(weight);
        
        System.out.println();

        // Display the results
        System.out.printf("Policy Number: %s%n", policy.getPolicyNumber());
        System.out.printf("Provider Name: %s%n", policy.getProviderName());
        System.out.printf("Policyholder's First Name: %s%n", policy.getFirstName());
        System.out.printf("Policyholder's Last Name: %s%n", policy.getLastName());
        System.out.printf("Policyholder's Age: %d%n", policy.getAge());
        System.out.printf("Policyholder's Smoking Status: %s%n", policy.getSmokingStatus());
        System.out.printf("Policyholder's Height: %.1f inches%n", policy.getHeight());
        System.out.printf("Policyholder's Weight: %.1f pounds%n", policy.getWeight());
        System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());
    }
}
