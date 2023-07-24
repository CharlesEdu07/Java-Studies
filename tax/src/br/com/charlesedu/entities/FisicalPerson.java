package br.com.charlesedu.entities;

public class FisicalPerson extends Person {
    private Double healthExpenditures;

    public FisicalPerson() {
    }

    public FisicalPerson(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double tax;

        if (getAnnualIncome() < 20000.00) {
            tax = getAnnualIncome() * 0.15;
        } else {
            tax = getAnnualIncome() * 0.25;
        }

        if (healthExpenditures > 0.0) {
            tax -= healthExpenditures * 0.5;
        }

        return tax;
    }
}
