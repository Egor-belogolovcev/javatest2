public class main {

    public static void main(String[] args) {
        int ticketCost = 999;
        int bonusMilesRub = 20;
        boolean miles = ticketCost>=bonusMilesRub;

        int amount_miles;
        if (miles) {
            amount_miles = ticketCost/bonusMilesRub;
        } else {
            amount_miles = 0;
        }
        System.out.println(amount_miles);
    }
}
