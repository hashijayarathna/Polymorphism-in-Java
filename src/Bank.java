public class Bank {
    void savingsBalance() {
        System.out.println("100000");
    }
}
class BOC extends Bank {
    @Override
    void savingsBalance() {
        System.out.println("50000");
    }
}
class PeoplesBank extends Bank {
    @Override
    void savingsBalance() {
        System.out.println("40000");
    }
}
class NSB extends Bank {
    @Override
    void savingsBalance() {
        System.out.println("30000");
    }
}
class Test {
    public static void main(String[] args) {
        Bank b;
        b = new BOC();
        b.savingsBalance();
        b = new PeoplesBank();
        b.savingsBalance();
        b = new NSB();
        b.savingsBalance();
    }
}
