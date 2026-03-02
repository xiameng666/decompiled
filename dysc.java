import java.util.function.Supplier;

public final class dysc implements Supplier {
    @Override
    public final Object get() {
        return new fsim(dynd.o, "WALLET.MFICARDINFO_CACHE_MISS");
    }
}

