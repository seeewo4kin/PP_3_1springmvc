package web.model;

public class Car {
    private int yearOfBuilding;
    private String model;
    private String nameOfOwner;

    public Car() {
    }

    public Car(int yearOfBuilding, String model, String nameOfOwner) {
        this.yearOfBuilding = yearOfBuilding;
        this.nameOfOwner = nameOfOwner;
        this.model = model;
    }

    public int getYearOfBuilding() {
        return yearOfBuilding;
    }

    public void setYearOfBuilding(int yearOfBuilding) {
        this.yearOfBuilding = yearOfBuilding;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfBuilding=" + yearOfBuilding +
                ", model='" + model + '\'' +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                '}';
    }
}
