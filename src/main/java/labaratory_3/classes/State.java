package labaratory_3.classes;

import java.util.Objects;
import java.util.Scanner;

interface compareStateImpl {
    int compareState(State obj);
}

public abstract class State implements compareStateImpl {
    private int numberOfPopulation;
    private String country;
    private int square;
    private static int inheritanceAmount;

    public State () {
         inheritanceAmount++;
         this.setCountry("Not Founded");
         this.setNumberOfPopulation(0);
         this.setSquare(0);
    }

    public State(int numberOfPopulation, String  country, int square){
        this.numberOfPopulation = numberOfPopulation;
        this.country = country;
        this.square = square;
    }

    public static int getInheritanceAmount() {
        return inheritanceAmount;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getNumberOfPopulation() {
        return numberOfPopulation;
    }

    public void setNumberOfPopulation(int numberOfPopulation) {
        this.numberOfPopulation = numberOfPopulation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State)) return false;
        State state = (State) o;
        return getNumberOfPopulation() == state.getNumberOfPopulation() &&
                getSquare() == state.getSquare() &&
                Objects.equals(getCountry(), state.getCountry());
    }

    @Override
    public String toString() {
        return "State{" +
                "numberOfPopulation=" + numberOfPopulation +
                ", country='" + country + '\'' +
                ", square=" + square +
                '}';
    }
    Scanner scanner = new Scanner(System.in);

    public State input() {
        this.setCountry(scanner.next());
        this.setNumberOfPopulation(scanner.nextInt());
        this.setSquare(scanner.nextInt());
        return  this;
    }

    public void infoHowToInput () {
        System.out.print("(Country, Population, Square, ");
    }
}
