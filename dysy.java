import java.util.function.Supplier;

public final class dysy implements Supplier {
    @Override
    public final Object get() {
        return new fsim(dynd.q, "WALLET.GET_MFI_PAYMENT_METHOD_FROM_CACHE_MISSING_PREPAID_CARD_DATA");
    }
}

