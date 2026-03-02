import com.google.android.gms.pay.GetTransactionsResponse;

public final class dndc implements ibts {
    public final dndr a;

    public dndc(dndr dndr0) {
        this.a = dndr0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        GetTransactionsResponse getTransactionsResponse0 = (GetTransactionsResponse)object0;
        ibuq.f(getTransactionsResponse0, "getTransactionsResponse");
        this.a.ag(getTransactionsResponse0);
        return ibom.a;
    }
}

