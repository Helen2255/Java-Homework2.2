public class Main {
    public static void main(String[] args) {
        int account = 1000;
        int payment = 1001;
        int bonus;
        if (payment >= 1001) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int balance = account + payment + bonus;

        System.out.println("Ваш баланс:" + balance);
        System.out.println("Начислено бонусов:" + bonus);
    }
}
