import android.content.ServiceConnection;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etkh implements evqc {
    public final RequestTokenizeChimeraActivity a;
    public final ServiceConnection b;
    public final String c;

    public etkh(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0, ServiceConnection serviceConnection0, String s) {
        this.a = requestTokenizeChimeraActivity0;
        this.b = serviceConnection0;
        this.c = s;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.a.w.c(this.a, this.b);
        this.a.t();
        this.a.r(exception0, this.c);
    }
}

