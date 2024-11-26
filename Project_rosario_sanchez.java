import java.util.*;

/**
   This is a demo program where user is asked for input
   to determine policy price. 
   
   Creates an instance of the Policy class.
*/

public class Project_rosario_sanchez 
{
   public static void main(String[] args) 
   {
      Scanner keyboard = new Scanner(System.in);
      
      //Create ArrayList to store Policy objects
      ArrayList<Policy> policies = new ArrayList<>();
      
      //Declare variables
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      String keepGoing = "N";
      int smokerCount = 0;
      int nonSmokerCount = 0;    
   
      do 
      {
         System.out.print("Enter the Policy Number: ");
         policyNumber = keyboard.nextInt();
         
         keyboard.nextLine();
      
         System.out.print("Enter the Provider's Name: ");
         providerName = keyboard.nextLine();
      
         System.out.print("Enter the Policyholder's First Name: ");
         firstName = keyboard.nextLine();
      
         System.out.print("Enter Policyholder's Last Name: ");
         lastName = keyboard.nextLine();
         
         System.out.print("Enter the Policyholder's Age: ");
         age = keyboard.nextInt();
       
         keyboard.nextLine();
           
         System.out.print("Eenter the Policyholder's Smoking Status (smoker/non-smoker): ");
         smokingStatus = keyboard.nextLine();
      
         System.out.print("Enter the Policyholder's Height (in inches): ");
         height = keyboard.nextDouble();
      
         System.out.print("Enter the Policyholder's Weight (in pounds): ");
         weight = keyboard.nextDouble();
         
         //Create PolicyHolder object
         PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         
         //Create the Policy object and set its policy holder
         Policy policy = new Policy(policyNumber, providerName, holder);
         
         //Add the Policy object to the list of policies
         policies.add(policy);
         
         //Track the number of smokers vs non-smokers
         if(smokingStatus.equalsIgnoreCase("smoker"))
            smokerCount++;
         else
            nonSmokerCount++;
            
         //Ask user if they want to enter another policy
         System.out.print("Would you like to enter information for another Policy (Y/N): ");
         keyboard.nextLine();
         keepGoing = keyboard.nextLine();
         System.out.println(); 
      }
      while(keepGoing.charAt(0) == 'y' || keepGoing.charAt(0) == 'Y');
      
      //Display all the policies
      for(int i = 0; i < policies.size(); i++)
      {
         System.out.println(policies.get(i));
         System.out.println();
      }
      
      //Display the Policy summary
      System.out.printf("There were " + policies.size() + " Policy objects created." +
               "\n\nThe number of policies with a smoker is: " + smokerCount +
               "\nThe number of policies with a non-smoker is: " + nonSmokerCount);   
   }
}