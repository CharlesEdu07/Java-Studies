package br.com.charlesedu.models.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    Integer id;
    LocalDate date;
    Double totalValue;
    List<Installment> installments = new ArrayList<>();

    public Contract(Integer id, LocalDate date, Double totalValue) {
        this.id = id;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }

    @Override
    public String toString() {
        return "Contract id " + id + ", with date " + date + ", and total value " + totalValue;
    }
}
