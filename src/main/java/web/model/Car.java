package web.model;

public class Car {
    private String modelCar;
    private String color;
    private int series;

    public Car(String modelCar, String color, int series) {
        this.modelCar = modelCar;
        this.color = color;
        this.series = series;
    }


    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", color='" + color + '\'' +
                ", series=" + series +
                '}';
    }
}

