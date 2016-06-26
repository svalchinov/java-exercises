public class FrogJump {

    public int solution(int x, int y, int d) {
        if(y == x) {
            return 0;
        }
        return (int) Math.ceil(((double) y - x) / d);
    }
}
