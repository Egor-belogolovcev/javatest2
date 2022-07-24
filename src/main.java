public class main {

    public static void main(String[] args) {
        int ticket_cost = 999;
        int bonus_miles_rub = 20;
        boolean a = ticket_cost>=bonus_miles_rub;

        int amount_miles;
        if (a) {
            amount_miles = ticket_cost/bonus_miles_rub;
        } else {
            amount_miles = 0;
        }
        System.out.println(amount_miles);
    }
}
