public class BonusMilesService {
    public int calculate(int a) {
        int cost;
        if (a > 20) {
            cost = a / 20;
        } else {
            cost = a;
        }
        return cost;
    }
}
