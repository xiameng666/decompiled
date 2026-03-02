import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class govv implements goxl {
    final String a;
    final String b;
    final goxa c;
    final gowy d;

    public govv(gowy gowy0, String s, String s1, goxa goxa0) {
        this.a = s;
        this.b = s1;
        this.c = goxa0;
        Objects.requireNonNull(gowy0);
        this.d = gowy0;
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        Status status0 = gozl.a(s);
        this.c.b(status0);
    }

    @Override  // goxl
    public final void b(Object object0) {
        GetTokenResponse getTokenResponse0 = (GetTokenResponse)object0;
        goyp goyp0 = new goyp();
        goyp0.d(getTokenResponse0.b);
        goyp0.c(this.a);
        goyp0.e(this.b);
        this.d.e(this.c, getTokenResponse0, goyp0, this);
    }
}

