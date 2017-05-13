package com.pipatpol.spa4.banking;

import com.pipatpol.spa4.invoices.Invoice;

/**
 * Created by PNNutkung on 2017-05-13.
 */
public interface PaymentCreator {
    Payment createPayment(Invoice invoice) throws PaymentException;
}
