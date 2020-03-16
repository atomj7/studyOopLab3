package labaratory_3.classes;

import java.util.Objects;

public class Monarchy extends State {
    private String nameOfChiefMonarch;

    public Monarchy(Monarchy monarchy){
        this.setNameOfChiefMonarch(monarchy.getNameOfChiefMonarch());
        this.setCountry(monarchy.getCountry());
        this.setNumberOfPopulation(monarchy.getNumberOfPopulation());
        this.setSquare(monarchy.getSquare());
    }

    public Monarchy(String nameOfChiefMonarch, String country, int numberOfPopulation,int square) {
        this.nameOfChiefMonarch = nameOfChiefMonarch;
        setCountry(country);
        setNumberOfPopulation(numberOfPopulation);
        setSquare(square);
    }

    public Monarchy() {
        this.setNameOfChiefMonarch("Not Founded");
    }

    public String getNameOfChiefMonarch() {
        return nameOfChiefMonarch;
    }

    public void setNameOfChiefMonarch(String nameOfChiefMonarch) {
        this.nameOfChiefMonarch = nameOfChiefMonarch;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monarchy)) return false;
        if (!super.equals(o)) return false;
        Monarchy monarchy = (Monarchy) o;
        return Objects.equals(getNameOfChiefMonarch(), monarchy.getNameOfChiefMonarch()) &&
                Objects.equals(getCountry(),monarchy.getCountry()) &&
                getNumberOfPopulation() == monarchy.getNumberOfPopulation() &&
                getSquare() == monarchy.getSquare();
    }

    @Override
    public String toString() {
        return "Monarchy{" +
                "nameOfChiefMonarch='" + nameOfChiefMonarch + '\''
                +"country='" + getCountry() + '\''
                +"population='" +getNumberOfPopulation() + '\''
                +"square='"+ getSquare() + '\''
                +'}';
    }

    @Override
    public int compareState(State obj) {
        if ((obj instanceof Kingdom))
            return 1;
        if ((obj instanceof Federation))
            return 1;
        if (obj instanceof  Republic)
            return 2;

        Monarchy p = (Monarchy) obj;

        if (this.getNameOfChiefMonarch().compareTo(p.nameOfChiefMonarch) < 0)
            return 2;
        else if (this.getNameOfChiefMonarch().compareTo(p.nameOfChiefMonarch) == 0 )
            return 3;

        return 0;
    }

    public Monarchy input() {
        Monarchy monarchy = new Monarchy();
        monarchy = (Monarchy) super.input();
        monarchy.setNameOfChiefMonarch(super.scanner.next());
        return monarchy;
    }
    @Override
    public void infoHowToInput() {
        super.infoHowToInput();
        System.out.println("Chief Monarch) :");
    }
}
