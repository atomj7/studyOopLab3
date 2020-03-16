package labaratory_3.classes;

import java.util.Objects;

public class Federation extends State {
    private int countOfDistrict;

    public Federation(Federation federation){
        this.setCountOfDistrict(federation.getCountOfDistrict());
        this.setCountry(federation.getCountry());
        this.setNumberOfPopulation(federation.getNumberOfPopulation());
        this.setSquare(federation.getSquare());
    }

    public Federation(int countOfDistrict, String country, int numberOfPopulation,int square) {
        this.countOfDistrict = countOfDistrict;
        setCountry(country);
        setNumberOfPopulation(numberOfPopulation);
        setSquare(square);
    }

    public Federation() {
        this.setCountOfDistrict(0);
    }

    public int getCountOfDistrict() {
        return countOfDistrict;
    }

    public void setCountOfDistrict(int countOfDistrict) {
        this.countOfDistrict = countOfDistrict;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kingdom)) return false;
        if (!super.equals(o)) return false;
        Federation  federation = (Federation) o;
        return this.getCountOfDistrict() == federation.getCountOfDistrict() &&
                Objects.equals(getCountry(),federation.getCountry()) &&
                getNumberOfPopulation() == federation.getNumberOfPopulation() &&
                getSquare() == federation.getSquare();
    }

    @Override
    public String toString() {
        return "Federation{" +
                "countDistricts='" + getCountOfDistrict() + '\''
                +"country='" + getCountry() + '\''
                +"population='" +getNumberOfPopulation() + '\''
                +"square='"+ getSquare() + '\''
                +'}';
    }

    @Override
    public int compareState(State obj) {
            if ((obj instanceof Kingdom))
                return 2;
            if ((obj instanceof Monarchy))
                return 2;
            if (obj instanceof Republic)
                return 2;

            Federation p = (Federation) obj;

            if (this.getCountOfDistrict() < p.countOfDistrict)
                return 2;
            else if (this.getCountOfDistrict() < p.countOfDistrict)
                return 3;

            return 0;
        }

    public Federation input() {
        Federation federation = new Federation();
        federation = (Federation) super.input();
        federation.setCountOfDistrict(super.scanner.nextInt());
        return federation;
    }

    @Override
    public void infoHowToInput() {
        super.infoHowToInput();
        System.out.println("Districts) :");
    }
}

