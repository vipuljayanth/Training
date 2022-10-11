package BloodBank;
import java.util.Scanner;

class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String mobileNumber;
    private String bloodGroup;
    Person(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
  void displayPersonDetails(){
        System.out.println("Name : " +name);
     System.out.println("Date of Birth  :  "  +dateOfBirth  );
     System.out.println("Gender :  " +gender);
     System.out.println("Blood Group : " +bloodGroup);
     System.out.println("Mobile Number : " +mobileNumber);

 }

 }

 class Donor extends Person{
    private String bloodBankName;
    private String donorType;
    private String donationDate;
    public Donor(){

    }
    public String getBloodBankName(){
        return bloodBankName;
    }

     public void setBloodBankName(String bloodBankName) {
         this.bloodBankName = bloodBankName;
     }

     public String getDonorType() {
         return donorType;
     }

     public void setDonorType(String donorType) {
         this.donorType = donorType;
     }

     public String getDonationDate() {
         return donationDate;
     }

     public void setDonationDate(String donationDate) {
         this.donationDate = donationDate;
     }

     void displayDonationDetails() {
         System.out.println("Donation details : ");
         
         //super.displayPersonDetails();
         System.out.println("Blood Bank Name :  " + bloodBankName);
         System.out.println("Donor Type : " + donorType);
         System.out.println("Donation Date : " + donationDate);
     }
     }
 class codingTest2 {
    public static void main(String[] args) {
        Donor d = new Donor();
     //   Person p = new Person();
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the name :");
        d.setName(sc.nextLine());

        System.out.println("Enter Date of Birth :");
        d.setDateOfBirth(sc.nextLine());
        System.out.println("Enter Gender :");
        d.setGender(sc.nextLine());

        System.out.println("Enter Mobile Number :");
        d.setMobileNumber(sc.nextLine());

        System.out.println("Enter Blood Group :");
        d.setBloodGroup(sc.nextLine());

        System.out.println("Enter Blood Bank Name :");

        d.setBloodBankName(sc.nextLine());

        System.out.println("Enter Donor Type :");

        d.setDonorType(sc.nextLine());

        System.out.println("Enter Donation Date :");

      //  d.displayPersonDetails(sc.nextLine());

        d.setDonationDate(sc.nextLine());

        d.displayDonationDetails();

        sc.close();
    }
}

