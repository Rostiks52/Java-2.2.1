public class BonusMilesService {
    public int calculate(int cost) {
        int price = 10_000;
        int percent = 5;
        int miles = (int)price * percent / 100;

        return miles;
    }
}
