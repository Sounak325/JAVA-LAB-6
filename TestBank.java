class Bank {
    private String bankName = "State Bank";

    public String getBankName() {
        return bankName;
    }

    static class InterestCalculator {
        public static double calculateSimpleInterest(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }

        public static void showBankName() {
            System.out.println("Static nested classes cannot access non-static members directly!");
        }
    }
}

public class TestBank {
    public static void main(String[] args) {
        double si = Bank.InterestCalculator.calculateSimpleInterest(1000, 5, 2);
        System.out.println("Simple Interest = " + si);

        Bank.InterestCalculator.showBankName();

        Bank bank = new Bank();
        System.out.println("Accessing bank name via getter: " + bank.getBankName());
    }
}
