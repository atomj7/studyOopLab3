package labaratory_3.classes;

import java.util.Objects;

public class Kingdom extends State {
    private String nameOfKing;

    public Kingdom(Kingdom kingdom){
        this.setNameOfKing(kingdom.getNameOfKing());
        this.setCountry(kingdom.getCountry());
        this.setNumberOfPopulation(kingdom.getNumberOfPopulation());
        this.setSquare(kingdom.getSquare());
    }

    public Kingdom(String nameOfKing, String country, int numberOfPopulation,int square) {
        this.nameOfKing = nameOfKing;
        setCountry(country);
        setNumberOfPopulation(numberOfPopulation);
        setSquare(square);
    }

    public Kingdom() {
        this.setNameOfKing("Not Founded");
    }

    public String getNameOfKing() {
        return nameOfKing;
    }

    public void setNameOfKing(String nameOfKing) {
        this.nameOfKing = nameOfKing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kingdom)) return false;
        if (!super.equals(o)) return false;
        Kingdom kingdom = (Kingdom) o;
        return Objects.equals(getNameOfKing(), kingdom.getNameOfKing()) &&
                Objects.equals(getCountry(),kingdom.getCountry()) &&
                getNumberOfPopulation() == kingdom.getNumberOfPopulation() &&
                getSquare() == kingdom.getSquare();
    }

    @Override
    public String toString() {
        return "Kingdom{" +
                "nameOfKing ='" + nameOfKing + '\''
                +"country='" + getCountry() + '\''
                +"population='" +getNumberOfPopulation() + '\''
                +"square='"+ getSquare() + '\''
                +'}';
    }

    @Override
    public int compareState(State obj) {
        if ((obj instanceof Federation))
            return 2;
        if ((obj instanceof Monarchy))
            return 2;
        if (obj instanceof Republic)
            return 0;

        Kingdom p = (Kingdom) obj;

        if (this.getNameOfKing().compareTo(p.nameOfKing) < 0)
            return 2;
        else if (this.getNameOfKing().compareTo(p.nameOfKing) == 0 )
            return 3;

        return 0;
    }

    public Kingdom input() {
        Kingdom kingdom = new Kingdom();
        kingdom = (Kingdom) super.input();
        kingdom.setNameOfKing(super.scanner.next());
        return kingdom;
    }

    @Override
    public void infoHowToInput() {
        super.infoHowToInput();
        System.out.println("Name of King) :");
    }
}
