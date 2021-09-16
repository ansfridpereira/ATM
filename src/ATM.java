/*Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction.*/
class ATM {
    public static void main(String[] args) {
        float withdraw = 28, accountBalance = 2000;
        if (withdraw % 5 == 0) {
            accountBalance = (float) (accountBalance - withdraw - 0.5);
            System.out.println("The account balance is " + accountBalance);
        }
        System.out.println("The amount to withdraw should be a factor of 5");
    }
}