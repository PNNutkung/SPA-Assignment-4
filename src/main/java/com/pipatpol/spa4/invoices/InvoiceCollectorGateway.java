package com.pipatpol.spa4.invoices;

import java.util.Collection;

/**
 * Created by PNNutkung on 2017-05-13.
 */
public interface InvoiceCollectorGateway {
    void collectInvoices(Collection<Invoice> invoices);
}
