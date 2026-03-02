import android.content.ServiceConnection;
import com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etkg implements evqf {
    public final RequestTokenizeChimeraActivity a;
    public final ServiceConnection b;
    public final PushTokenizeRequest c;
    public final dpfi d;
    public final hjxf e;
    public final String f;
    public final long g;

    public etkg(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0, ServiceConnection serviceConnection0, PushTokenizeRequest pushTokenizeRequest0, dpfi dpfi0, hjxf hjxf0, String s, long v) {
        this.a = requestTokenizeChimeraActivity0;
        this.b = serviceConnection0;
        this.c = pushTokenizeRequest0;
        this.d = dpfi0;
        this.e = hjxf0;
        this.f = s;
        this.g = v;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.a.w.c(this.a, this.b);
        this.a.t();
        new etmv(this.a, this.a.o).u(this.a.q, gjsj.bj);
        this.a.s(((GeneratePaymentCredentialsResponse)object0), this.c, this.d, this.e, this.f, this.g);
    }
}

