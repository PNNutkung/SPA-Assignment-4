package com.pipatpol.spa4.banking;

/**
 * Created by PNNutkung on 2017-05-13.
 */
public interface BankingService {
    void pay(Payment payment) throws PaymentException;
}
