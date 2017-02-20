package general;

public class TicketMachine {

    final static int singleTicketPrice = 2;
    final static int weeklyTicketPrice = 7;
    final static int monthlyTicketPrice = 25;

    public int solution(int[] days) {

        int total = 0;
        int singleTicketTotal = 0;
        int firstNoTicketDay = days[0];
        int sevenDayPurchaseDate = -1;

        for (int i = 0; i < days.length; i++) {
            if (days[i] - sevenDayPurchaseDate <= 7 && sevenDayPurchaseDate > 0) {
                firstNoTicketDay = (i + 1 < days.length) ? days[i + 1] : days[i];
            } else {
                singleTicketTotal += singleTicketPrice;
                if (singleTicketTotal + singleTicketPrice > weeklyTicketPrice && days[i] - firstNoTicketDay <= 7) {
                    total += weeklyTicketPrice;
                    singleTicketTotal = 0;
                    sevenDayPurchaseDate = firstNoTicketDay;
                }
            }
        }

        total += singleTicketTotal;
        if (total > monthlyTicketPrice) {
            return monthlyTicketPrice;
        }

        return total;
    }
}
