public class Main {
    public static void main(String[] args) {

        int ticket = 20_000;
        int BonusPrice = 20;
        if (BonusPrice > 19) {
            System.out.println(ticket / BonusPrice);
        } else {
            System.out.println(0);
        }

    }
}
