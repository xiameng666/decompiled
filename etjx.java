import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etjx implements ettf {
    public final RequestTokenizeChimeraActivity a;
    public final String b;
    public final PushTokenizeRequest c;
    public final String d;
    public final String e;

    public etjx(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0, String s, PushTokenizeRequest pushTokenizeRequest0, String s1, String s2) {
        this.a = requestTokenizeChimeraActivity0;
        this.b = s;
        this.c = pushTokenizeRequest0;
        this.d = s1;
        this.e = s2;
    }

    @Override  // ettf
    public final void b(Object object0) {
        gtgq gtgq0 = (gtgq)object0;
        String s = gtgq0.c;
        this.a.x.putExtra("server_provisioning_session_id", gtgq0.b).putExtra("extra_integrator_id", s).putExtra("extra_device_id", this.b);
        this.a.o(this.c, gtgq0.b, this.d, this.e, null, null, null, 0L, this.b);
    }
}

