public class University {
    private String name;
    private String location;
    private int yearOfFoundation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public University() {
    }

    @Override
    public String toString() {
        return
                "\nname=" + name +
                "\nlocation=" + location +
                "\nyear Of Foundation=" + yearOfFoundation;
    }
}
