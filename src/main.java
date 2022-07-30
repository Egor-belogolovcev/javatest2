public class Main {

    public static void main(String[] args) {
        int ticketCost = 999;
        int bonusMilesRub = 20;
        boolean miles = ticketCost>=bonusMilesRub;

        int amountMiles;
        if (miles) {
            amountMiles = ticketCost/bonusMilesRub;
        } else {
            amountMiles = 0;
        }
        System.out.println(amountMiles);
    }
}
