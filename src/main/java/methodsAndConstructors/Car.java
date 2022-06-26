package methodsAndConstructors;

public class Car {
    private String name = "N/A";
    private String colour= "N/A";
    private int yearRelease = -1;
    private int horsePower=-1;
    private boolean secondHand;

    public Car() {
    }

    public Car(String name, String colour, int yearRelease, int horsePower, boolean secondHand) {
        this.name = name;
        this.colour = colour;
        this.yearRelease = yearRelease;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car(String name, String colour, boolean secondHand) {
        this.name = name;
        this.colour = colour;
        this.secondHand = secondHand;
    }

    public Car(String name, String colour, int yearRelease, int horsePower) {
        this.name = name;
        this.colour = colour;
        this.yearRelease = yearRelease;
        this.horsePower = horsePower;
    }

    public Car(String name, int yearRelease, int horsePower, boolean secondHand) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isSecondHand() {
        return secondHand;
    }
}
