import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etki implements evqc {
    public final RequestTokenizeChimeraActivity a;

    public etki(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)RequestTokenizeChimeraActivity.j.h()).x("Failed to get capability");
        this.a.x();
    }
}

