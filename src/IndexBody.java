public class IndexBody {
    public double calculate(double weight, double height) {

        double index = (weight / (height * height));

        return (double) index; // специальной подставлен такой класс для точного отображения индекса
    }
}

