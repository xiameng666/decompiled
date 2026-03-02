import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etjr implements evqf {
    public final RequestTokenizeChimeraActivity a;
    public final String b;
    public final long c;

    public etjr(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0, String s, long v) {
        this.a = requestTokenizeChimeraActivity0;
        this.b = s;
        this.c = v;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0 = this.a;
        if(((AccountInfo)object0) != null && ((AccountInfo)object0).b.equals(requestTokenizeChimeraActivity0.o.b)) {
            requestTokenizeChimeraActivity0.u(this.b, this.c);
            return;
        }
        requestTokenizeChimeraActivity0.n(1001);
    }
}

