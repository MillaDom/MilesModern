public class BonusMilesService {
    public int calculate(int price) {
        int cost;
        if (price >= 20) {
            cost = price / 20;
        } else {
            cost = 0;
        }
        return cost;
    }
}
