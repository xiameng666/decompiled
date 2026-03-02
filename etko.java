import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etko implements evqc {
    public final RequestTokenizeChimeraActivity a;
    public final String b;
    public final long c;

    public etko(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0, String s, long v) {
        this.a = requestTokenizeChimeraActivity0;
        this.b = s;
        this.c = v;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(RequestTokenizeChimeraActivity.j.j(), "Failed to get Felica status", exception0);
        this.a.A(this.b, this.c, false);
    }
}

