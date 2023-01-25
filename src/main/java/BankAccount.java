public class BankAccount {


    public static void main(String[] args){

        System.out.println("Welcome " +  firstName + " " + lastName);
        deposit(300);
        withdraw(100);

    }

    private static String firstName = "Mohamed";
    private static String lastName = "Abdi";
    private static String dateOfBirth = "02/11/1998";
    private static int accountNumber = 3129321;
    private static int balance = 0;


    // getters & setters below

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // method


    public static void deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        System.out.println("The new balance is " + balance);
       //Carry out instructions and afterwards the method has finished
    }

    public static void withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("The new balance is" + " " + balance);
    }






//    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth){
//        this.firstName = inputFirstName;
//        this.lastName = inputLastName;
//        this.dateOfBirth = inputDateOfBirth;
//        this.accountNumber = 0;
//        this.balance = 0;
//    }



}
