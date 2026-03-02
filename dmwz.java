import com.google.android.gms.pay.GetTransactionsResponse;

public final class dmwz implements ibts {
    public final dmyx a;
    public final dxev b;

    public dmwz(dmyx dmyx0, dxev dxev0) {
        this.a = dmyx0;
        this.b = dxev0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        GetTransactionsResponse getTransactionsResponse0 = (GetTransactionsResponse)object0;
        ibuq.f(getTransactionsResponse0, "getTransactionsResponse");
        dmzb dmzb0 = this.a.D();
        ibuq.f(getTransactionsResponse0, "getTransactionsResponse");
        icbb.b(lsc.a(dmzb0), null, null, new dmza(dmzb0, this.b, getTransactionsResponse0, null), 3);
        return ibom.a;
    }
}

