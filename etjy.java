import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etjy implements evqf {
    public final RequestTokenizeChimeraActivity a;

    public etjy(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0 = this.a;
        if(((Boolean)object0).booleanValue()) {
            evql evql0 = requestTokenizeChimeraActivity0.E.cA(2, requestTokenizeChimeraActivity0.getIntent().getStringExtra("extra_display_name"));
            evql0.b(new etjl(requestTokenizeChimeraActivity0));
            evql0.A(new etjm(requestTokenizeChimeraActivity0));
            return;
        }
        requestTokenizeChimeraActivity0.x();
    }
}

