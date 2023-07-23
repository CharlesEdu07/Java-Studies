package br.com.charlesedu.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.charlesedu.entities.enums.WorkerLevels;

public class Worker {
    private String name;
    private WorkerLevels level;
    private Double baseSalary;
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevels level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevels getLevel() {
        return level;
    }

    public void setLevel(WorkerLevels level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;

        Calendar cal = Calendar.getInstance();

        for (HourContract hourContract : contracts) {
            cal.setTime(hourContract.getDate());

            int hourContractYear = cal.get(Calendar.YEAR);
            int hourContractMonth = 1 + cal.get(Calendar.MONTH);

            if (year == hourContractYear && month == hourContractMonth) {
                sum += hourContract.totalValue();
            }
        }

        return sum;
    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + "]";
    }
}
