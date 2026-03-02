import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etjw implements evqc {
    public final RequestTokenizeChimeraActivity a;

    public etjw(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(RequestTokenizeChimeraActivity.j.j(), "Failed to update active account.", exception0);
        this.a.finish();
    }
}

