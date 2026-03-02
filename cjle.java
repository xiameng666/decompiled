import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class cjle implements evpo {
    public final cjlv a;

    public cjle(cjlv cjlv0) {
        this.a = cjlv0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            String s = ((AccountInfo)evql0.j()).b;
            return evrg.d(new ayud(this.a.a, "TAP_AND_PAY_APP", s));
        }
        return evrg.d(null);
    }
}

