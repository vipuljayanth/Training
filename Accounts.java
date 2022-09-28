
public class Accounts {


    }

    class Account {

        String name;
        long accountNumber;

        void setData(String custName, int accNum) {
            this.name = custName;
            this.accountNumber = accNum;
        }

        void display() {
            System.out.println("Name :- " + name);
            System.out.println("Account Number :- " + accountNumber);
        }

        void ArrayObject() {
            System.out.println("inside function");
            Account accArray[] = new Account[3];
            accArray[0] = new Account();
            accArray[0].setData("Ella", 345234);
            accArray[1] = new Account();
            accArray[1].setData("Scarlet", 345278);
            accArray[2] = new Account();
            accArray[2].setData("Harper", 345897);
            System.out.println("Account holder's information");
            System.out.println();
            for (Account account : accArray) {
                account.display();
                System.out.println();

            }


        }

        public static void main(String[] args) {

            Account acc = new Account();
            acc.ArrayObject();


        }

    }
