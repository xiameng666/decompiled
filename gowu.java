import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class gowu implements goxl {
    final String a;
    final goxa b;
    final gowy c;

    public gowu(gowy gowy0, String s, goxa goxa0) {
        this.a = s;
        this.b = goxa0;
        Objects.requireNonNull(gowy0);
        this.c = gowy0;
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        Status status0 = gozl.a(s);
        this.b.b(status0);
    }

    @Override  // goxl
    public final void b(Object object0) {
        GetTokenResponse getTokenResponse0 = (GetTokenResponse)object0;
        goyp goyp0 = new goyp();
        goyp0.d(getTokenResponse0.b);
        goyp0.c(this.a);
        this.c.e(this.b, getTokenResponse0, goyp0, this);
    }
}

