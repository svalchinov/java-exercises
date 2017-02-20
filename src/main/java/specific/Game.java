package specific;

/**
 * Battleship
 * N - size of map
 * S - position of ships (top left and bottom right corners)
 * T - position of hits
 * <p/>
 * return the count of sunken ships and the count of ships hit but not sunk separated with a comma
 *
 *
 * Working but messy solution (WIP)
 */
public class Game {

    private static final String DECIMAL_REGEX = "[0-9]";
    private static final String NON_DECIMAL_REGEX = "[^0-9]";

    public String solution(int gridSize, String shipPositions, String hitPositions) {

        final String[] shipList = shipPositions.split(",");
        final String[] hitList = hitPositions.split(" ");
        int sunkShips = 0;
        int hitShips = 0;

        for (String ship : shipList) {

            final String[] steps = ship.trim().split(" ");
            final int min = Integer.parseInt(steps[0].replaceAll(NON_DECIMAL_REGEX, ""), 10);
            final int max = Integer.parseInt(steps[1].replaceAll(NON_DECIMAL_REGEX, ""), 10);
            final int minCharValue = steps[0].replaceAll(DECIMAL_REGEX, "").charAt(0);
            final int maxCharValue = steps[1].replaceAll(DECIMAL_REGEX, "").charAt(0);

            int shipHits = getShipHits(hitList, ship, min, max, minCharValue, maxCharValue);

            int boxes = max - min + 1;
            int rows = maxCharValue - minCharValue + 1;
            int shipCellNum = rows == 1 ? boxes : rows * boxes;

            if (shipHits == shipCellNum) {
                sunkShips++;
            } else if (shipHits != 0) {
                hitShips++;
            }
        }

        return String.valueOf(sunkShips + "," + hitShips);
    }

    private int getShipHits(String[] hitList, String ship, int min, int max, int minCharValue, int maxCharValue) {
        int shipHits = 0;
        for (String hit : hitList) {

            String hitNum = hit.replaceAll(NON_DECIMAL_REGEX, "");
            String hitCol = hit.replaceAll(DECIMAL_REGEX, "");

            int hitValue = (int) hitCol.charAt(0);
            int hitNumValue = Integer.parseInt(hitNum);

            if (hitValue >= minCharValue
                    && hitValue <= maxCharValue
                    && hitNumValue >= min
                    && hitNumValue <= max) {

                System.out.println("Hit on ship " + ship + " from " + hit);
                shipHits++;
            }
        }
        return shipHits;
    }
}
