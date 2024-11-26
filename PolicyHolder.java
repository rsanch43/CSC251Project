public class PolicyHolder
{
   // Personal details of the policyholder
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus; // "smoker" or "non-smoker"
   private double height; // in inches
   private double weight; // in pounds
   
// No-argument constructor
   public PolicyHolder() 
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "non-smoker";
      height = 0.0;
      weight = 0.0;
   }

   // Constructor with parameters
   public PolicyHolder(String first, String last, int a, String status, double h, double w) 
   {
      firstName = first;
      lastName = last;
      age = a;
      smokingStatus = status;
      height = h;
      weight = w;
   }
   
   // Copy Constructor
   public PolicyHolder(PolicyHolder object2)
   {
      this.firstName = object2.firstName;
      this.lastName = object2.lastName;
      this.age = object2.age;
      this.smokingStatus = object2.smokingStatus;
      this.height = object2.height;
      this.weight = object2.weight;
   }
 
   //Setters
   public void setFirstName(String first) 
   {
      this.firstName = first;
   }
   
   public void setLastName(String last) 
   {
      this.lastName = last;
   }
    
   public void setAge(int age) 
   {
      this.age = age;
   }
    
   public void setSmokingStatus(String smokingStatus) 
   {
      this.smokingStatus = smokingStatus;
   }
    
   public void setHeight(double height) 
   {
      this.height = height;
   }
    
   public void setWeight(double weight) 
   {
      this.weight = weight;
   }    

   //Getters
   public String getFirstName() 
   {
      return firstName;
   }
    
   public String getLastName() 
   {
      return lastName;
   }
   
   public int getAge() 
   {
      return age;
   }
   
   public String getSmokingStatus() 
   {
      return smokingStatus;
   }
   
   public double getHeight() 
   {
      return height;
   }
   
   public double getWeight() 
   {
      return weight;
   }
   
   // Method to calculate BMI
   public double calculateBMI() 
   {
      return (weight * 703) / (height * height);
   }
   
   public String toString()
   {
      return String.format("\nPolicyholder's First Name: " + firstName + 
               "\nPolicyholder's Last Name: " + lastName +
               "\nPolicyholder's Age: " + age +
               "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
               "\nPolicyholder's Height: %.1f inches" +
               "\nPolicyholder's Weight: %.1f pounds" +
               "\nPolicyholder's BMI: %.2f\n", height, weight, calculateBMI());
   }
}
