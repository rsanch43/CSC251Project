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

    // Constructor with parameters
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

    //Setters: Stores the value
    public void setPolicyNumber(String policyNum) {
         policyNumber = policyNum;
    }
    
    public void setProviderName(String provider) {
        providerName = provider;
    }
    
    public void setFirstName(String first) {
        firstName = first;
    }
    
    public void setLastName(String last) {
        lastName = last;
    }

    public void setAge(int a) {
        age = a;
    }
    
    public void setSmokingStatus(String status) {
        smokingStatus = status;
    }
    
    public void setHeight(double h) {
        height = h;
    }
    
    public void setWeight(double w) {
        weight = w;
    }
    
    // Getters: Returns
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    // Method to calculate policy price
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
