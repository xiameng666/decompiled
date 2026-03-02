import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class cjks implements ibts {
    public final cjkv a;
    public final ibts b;

    public cjks(cjkv cjkv0, ibts ibts0) {
        this.a = cjkv0;
        this.b = ibts0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((AccountInfo)object0) == null) {
            ((ggsc)this.a.b.j().ar(6121)).x("Failed to get active account for notification logging");
            return ibom.a;
        }
        ibuq.e(((AccountInfo)object0).b, "getAccountName(...)");
        this.b.a(((AccountInfo)object0).b);
        return ibom.a;
    }
}

