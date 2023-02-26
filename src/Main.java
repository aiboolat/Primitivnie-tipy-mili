public class Main {
    public static void main(String[] args) {

        int ticket = 20_000;
        int bonusPrice = 20;
        if (bonusPrice > 19) {
            System.out.println(ticket / bonusPrice);
        } else {
            System.out.println(0);
        }

    }
}
