import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etkc implements ibth {
    public final RequestTokenizeChimeraActivity a;

    public etkc(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // ibth
    public final Object a() {
        RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0 = this.a;
        if(requestTokenizeChimeraActivity0.y != null && requestTokenizeChimeraActivity0.y.b(2)) {
            requestTokenizeChimeraActivity0.D.k();
            return ibom.a;
        }
        hywi.g();
        if(hywi.c()) {
            requestTokenizeChimeraActivity0.p();
            return ibom.a;
        }
        requestTokenizeChimeraActivity0.m();
        return ibom.a;
    }
}

