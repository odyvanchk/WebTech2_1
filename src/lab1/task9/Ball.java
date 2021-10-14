package lab1.task9;

public record Ball(double weight, BallColors color) {

    public double getWeight() {
        return weight;
    }

    public BallColors getColor() {
        return color;
    }

}
