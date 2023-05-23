public class BmiService {
    public int calculate(int weight, double height) {
        double heightBd = height * height;
        return (int) (weight / heightBd);
    }
}
