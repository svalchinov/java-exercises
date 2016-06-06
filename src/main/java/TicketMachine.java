
public class TicketMachine {

    final static int singleTicketPrice = 2;
    final static int weeklyTicketPrice = 7;
    final static int monthlyTicketPrice = 25;

    public int solution(int[] monthDays) {

        int total = 0;
        int singleTicketTotal = 0;
        int firstNoTicketDay = monthDays[0];
        int sevenDayPurchaseDate = -1;

        for (int i = 0; i < monthDays.length; i++) {
            if (monthDays[i] - sevenDayPurchaseDate <= 7 && sevenDayPurchaseDate > 0) {
                firstNoTicketDay = (i + 1 < monthDays.length) ? monthDays[i + 1] : monthDays[i];
            } else {
                singleTicketTotal += singleTicketPrice;
                if (singleTicketTotal + singleTicketPrice > 7 && monthDays[i] - firstNoTicketDay <= 7) {
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
