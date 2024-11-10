/**
   Policy class
*/

public class Policy {
    // Attributes
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus; // "smoker" or "non-smoker"
    private double height; // in inches
    private double weight; // in pounds

    // No-argument constructor
    public Policy() {
        policyNumber = "";
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    /**
      Constructor with parameters
      @param policyNum The policy number for the policy.
      @param provider The provider name for the insurance policy.
      @param first The first name of the policyholder.
      @param last The last name of the policyholder.
      @param a The age of the policyholder.
      @param status The smoking status of the policyholder
      @param h The height of the policyholder in inches.
      @param w The weight of the policyholder in pounds.
   */
    public Policy(String policyNum, String provider, String first, String last, int a,
                  String status, double h, double w) {
        policyNumber = policyNum;
        providerName = provider;
        firstName = first;
        lastName = last;
        age = a;
        smokingStatus = status;
        height = h;
        weight = w;
    }

    /**
      Sets policy number for the insurance policy.
      @param policyNum The policy number to be set.
    */
    public void setPolicyNumber(String policyNum) {
         policyNumber = policyNum;
    }
    
    /**
      Sets provider name for the insurance policy.
      @param provider The provider name to be set.
    */
    public void setProviderName(String provider) {
        providerName = provider;
    }
    
    /**
      Sets first name of the policyholder
      @param first The fisrt name of policyholder.
    */
    public void setFirstName(String first) {
        firstName = first;
    }
    
    /**
      Sets last name of the policyholder
      @param last The last name of policyholder
   */
    public void setLastName(String last) {
        lastName = last;
    }
    
    /**
      Sets age of the policyholder.
      @param a The age of policyholder.
   */
    public void setAge(int a) {
        age = a;
    }
    
    /**
      Sets smoking status of policyholder
      @param status The smoking status of policyholder
   */
    public void setSmokingStatus(String status) {
        smokingStatus = status;
    }
    
    /**
    Sets height of policyholder
    @param h The height of policyholder.
   */
    public void setHeight(double h) {
        height = h;
    }
    
    /**
      Sets weight of policyholder
      @param w The weight of policyholder.
   */
    public void setWeight(double w) {
        weight = w;
    }
    
    /**
      Gets policy number of insurance policy
      @return The policy number.
   */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
       Gets provider name of insurance policy
       @return The provider name.
   */
    public String getProviderName() {
        return providerName;
    }
    
    /**
      Gets policyholder first name
      @return The first name of policyholder.
   */
    public String getFirstName() {
        return firstName;
    }

    /**
      Gets policyholder last name
      @return The last name of policyholder.
   */
    public String getLastName() {
        return lastName;
    }

    /**
      Gets policyholder age
      @return The age of policyholder.
   */
    public int getAge() {
        return age;
    }

    /**
      Gets policyholder smoking staus
      @return The smoking status of policyholder.
   */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
      Gets policyholder height
      @return The height of the policyholder.
   */
    public double getHeight() {
        return height;
    }

    /**
      Gets policyholder weight
      @return The weight of the policyholder.
   */
    public double getWeight() {
        return weight;
    }

    /**
      Calculates the BMI for the policyholder
      @return The BMI of policyholder.
   */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
      Calculates the price of the insurance policy.
      @return The total price of the insurance policy.
   */
    public double calculatePolicyPrice() {
        double price = 600; // base fee

        if (age > 50) {
            price += 75; // additional fee for age
        }
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100; // additional fee for smokers
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20; // additional fee based on BMI
        }

        return price;
    }
}
