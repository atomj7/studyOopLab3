package labaratory_3.classes;

import java.util.Objects;

public class Republic extends State {
    private String nameOfPresident;

    public Republic(Republic republic){
        this.setNameOfPresident(republic.nameOfPresident);
        this.setCountry(republic.getCountry());
        this.setNumberOfPopulation(republic.getNumberOfPopulation());
        this.setSquare(republic.getSquare());
    }

    public Republic(String nameOfPresident, String country, int numberOfPopulation,int square) {
        this.nameOfPresident = nameOfPresident;
        setCountry(country);
        setNumberOfPopulation(numberOfPopulation);
        setSquare(square);
    }

    public Republic() {
        this.setNameOfPresident("Not founded");
    }

    public void setNameOfPresident(String nameOfPresident) {
        this.nameOfPresident = nameOfPresident;
    }

    public String getNameOfPresident() {
        return nameOfPresident;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Republic)) return false;
        if (!super.equals(o)) return false;
        Republic republic = (Republic) o;
        return Objects.equals(getNameOfPresident(), republic.getNameOfPresident()) &&
                Objects.equals(getCountry(),republic.getCountry()) &&
                getNumberOfPopulation() == republic.getNumberOfPopulation() &&
                getSquare() == republic.getSquare();
    }

    @Override
    public String toString() {
        return "Republic{" +
                "nameOfPresident='" + nameOfPresident + '\''
                +"country='" + getCountry() + '\''
                +"population='" +getNumberOfPopulation() + '\''
                +"square='"+ getSquare() + '\''
                +'}';
    }

    @Override
    public int compareState(State obj) {
        if ((obj instanceof Kingdom))
            return -1;
        if ((obj instanceof Federation))
            return -1;
        if (obj instanceof  Monarchy)
            return -1;

        Republic p = (Republic) obj;

        if (this.getNameOfPresident().compareTo(p.nameOfPresident) < 0)
            return 2;
        else if (this.getNameOfPresident().compareTo(p.nameOfPresident) == 0 )
            return 3;

        return 0;
    }
    public Republic input() {
        Republic republic = new Republic();
        republic = (Republic) super.input();
        republic.setNameOfPresident(super.scanner.next());
        return republic;
    }

    @Override
    public void infoHowToInput() {
        super.infoHowToInput();
        System.out.println("Name of President) :");
    }
}
