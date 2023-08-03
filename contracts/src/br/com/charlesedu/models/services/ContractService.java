package br.com.charlesedu.models.services;

import br.com.charlesedu.models.entities.Contract;
import br.com.charlesedu.models.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {;
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicPayment = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            double updatedQuota = basicPayment + onlinePaymentService.interest(basicPayment, i);
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            
            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), fullQuota));
        }
    }
}
