import com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etkl implements evqf {
    public final RequestTokenizeChimeraActivity a;
    public final PushTokenizeRequest b;
    public final dpfi c;
    public final hjxf d;
    public final String e;
    public final long f;

    public etkl(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0, PushTokenizeRequest pushTokenizeRequest0, dpfi dpfi0, hjxf hjxf0, String s, long v) {
        this.a = requestTokenizeChimeraActivity0;
        this.b = pushTokenizeRequest0;
        this.c = dpfi0;
        this.d = hjxf0;
        this.e = s;
        this.f = v;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.a.t();
        new etmv(this.a, this.a.o).u(this.a.q, gjsj.bj);
        this.a.s(((GeneratePaymentCredentialsResponse)object0), this.b, this.c, this.d, this.e, this.f);
    }
}

