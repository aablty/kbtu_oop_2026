package labs.lab1.models;

public class Data {
    private double sum;
    private double max = Double.NEGATIVE_INFINITY;
    private int count;

    public void addValue(double value) {
        sum += value;
        count++;
        if (count == 1 || value > max) {
            max = value;
        }
    }

    public double getAverage() {
        if (count == 0) {
            return 0.0;
        }
        return sum / count;
    }

    public double getMaximum() {
        return max;
    }
}
