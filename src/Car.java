public class Car {
    private String model;
    private int year;
    private int horsePower;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public Car(){}

    @Override
    public String toString() {
        return
                "\nmodel=" + model +
                "\nyear=" + year +
                "\nhorse Power=" + horsePower ;
    }
}
