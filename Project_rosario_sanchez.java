import java.io.*;
import java.util.*;

/**
   This is a demo program where user is asked for input
   to determine policy price. 
   
   Creates an instance of the Policy class.
*/

public class Project_rosario_sanchez {
   public static void main(String[] args) {
      // ArrayList to store Policy objects
      ArrayList<Policy> policies = new ArrayList<>();
      
      try {
         // Open the file for reading
         File file = new File("PolicyInformation.txt");
         Scanner inputFile = new Scanner(file);
         
         // Temporary variables to hold the data for each Policy object
         String policyNumber;
         String providerName;
         String firstName;
         String lastName;
         String smokingStatus;
         int age;
         double height;
         double weight;
         
         // Read the file and process each policy
         while (inputFile.hasNext()) {
            // Read each line of the file and parse the values
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = Integer.parseInt(inputFile.nextLine());
            smokingStatus = inputFile.nextLine();
            height = Double.parseDouble(inputFile.nextLine());
            weight = Double.parseDouble(inputFile.nextLine());
            
                        // Skip the blank line (if exists) between policy records
            if (inputFile.hasNext()) {
               inputFile.nextLine();
            }
            
            // Create a new Policy object using the read data
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, 
                                       age, smokingStatus, height, weight);
            
            // Add the Policy object to the ArrayList
            policies.add(policy);
         }
         
         // Close the file
         inputFile.close();
         
         // Display the stored policies
         for (int i = 0; i < policies.size(); i++) {
            // Display the details for each policy
            System.out.printf("Policy Number: %s%n", policies.get(i).getPolicyNumber());
            System.out.printf("Provider Name: %s%n", policies.get(i).getProviderName());
            System.out.printf("Policyholder's First Name: %s%n", policies.get(i).getFirstName());
            System.out.printf("Policyholder's Last Name: %s%n", policies.get(i).getLastName());
            System.out.printf("Policyholder's Age: %d%n", policies.get(i).getAge());
            System.out.printf("Policyholder's Smoking Status: %s%n", policies.get(i).getSmokingStatus());
            System.out.printf("Policyholder's Height: %.1f inches%n", policies.get(i).getHeight());
            System.out.printf("Policyholder's Weight: %.1f pounds%n", policies.get(i).getWeight());
            System.out.printf("Policyholder's BMI: %.2f%n", policies.get(i).calculateBMI());
            System.out.printf("Policy Price: $%.2f%n", policies.get(i).calculatePolicyPrice());
            System.out.println();
         }
      }
      
      catch(IOException ex) {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}