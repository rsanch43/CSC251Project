/**
   Policy class
*/

public class Policy 
{
   //Static field to track number of Policy objects
   private static int policyCount = 0;
   
   // Attributes
   private String policyNumber;
   private String providerName;
   private PolicyHolder holder;

   // No-argument constructor
   public Policy() 
   {
      policyNumber = "";
      providerName = "";
      holder = new PolicyHolder();
      policyCount++;
    }

    // Constructor with parameters
    public Policy(String policyNum, String provider, PolicyHolder holder) 
    {
        policyNumber = policyNum;
        providerName = provider;
        this.holder = new PolicyHolder(holder);
        policyCount++;
    }

    //Setters: Stores the value
    public void setPolicyNumber(String policyNum) {
         policyNumber = policyNum;
    }
    
    public void setProviderName(String provider) {
        providerName = provider;
    }
    
    public void setHolder(PolicyHolder holder)
    {
      this.holder = new PolicyHolder(holder);
   }
    
    // Getters: Returns
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }
    
    public PolicyHolder getHolder()
    {
      return holder;
   }

   // Method to calculate policy price
   public double calculatePolicyPrice() 
   {
      double price = 600; // base fee
      
      if (holder.getAge() > 50) 
      {
         price += 75; // additional fee for age
      }
      
      if (holder.getSmokingStatus().equalsIgnoreCase("smoker")) 
      {
         price += 100; // additional fee for smokers
      }
      
      double bmi = holder.calculateBMI();
      
      if (bmi > 35) 
      {
         price += (bmi - 35) * 20; // additional fee based on BMI
      }
      
      return price;
   }
   
   //Method to get the number of Policy objects
   public static int getPolicyCount() 
   {
      return policyCount;
   }
   
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
                     "\nProvider Name: " + providerName +
                     holder.toString() +
                     "\nPolicy Price: $%.2f\n", calculatePolicyPrice());                     
   }
   
}
