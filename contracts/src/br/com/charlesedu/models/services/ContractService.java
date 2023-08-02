package br.com.charlesedu.models.services;

import br.com.charlesedu.models.entities.Contract;
import br.com.charlesedu.models.entities.Installment;

public class ContractService {
    public void processContract(Contract contract, int month) {
        double basicPayment = contract.getTotalValue() / month;

        for (int i = 1; i <= month; i++) {
            double updatedQuota = basicPayment + new PaypalService().interest(basicPayment, i);
            double fullQuota = updatedQuota + new PaypalService().paymentFee(updatedQuota);
            
            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), fullQuota));
        }
    }
}
