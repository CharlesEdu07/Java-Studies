package br.com.charlesedu.models.services;

import br.com.charlesedu.models.entities.Contract;
import br.com.charlesedu.models.entities.Installment;

public class ContractService {
    private Contract contract;
    private int months;
    private OnlinePaymentService onlinePaymentService;

    public ContractService(Contract contract, int months, OnlinePaymentService onlinePaymentService) {
        this.contract = contract;
        this.months = months;
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract() {
        double basicPayment = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            double updatedQuota = basicPayment + onlinePaymentService.interest(basicPayment, i);
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            
            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), fullQuota));
        }
    }
}
