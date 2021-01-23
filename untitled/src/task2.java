public class task2 {
    public static void main(String[] args) {
        int firstbalance = 100;
        int amount = 2000;
        int bonus = 0;
        if (amount > 1000) {
            bonus = amount / 100;
            amount = amount + bonus;

        }
        int finishbalance = firstbalance + amount;
        System.out.println(bonus);

        System.out.println(finishbalance);

    }
}
