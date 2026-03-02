import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class gowa implements goxl {
    final goxa a;
    final gowy b;

    public gowa(gowy gowy0, goxa goxa0) {
        this.a = goxa0;
        Objects.requireNonNull(gowy0);
        this.b = gowy0;
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        Status status0 = gozl.a(s);
        this.a.b(status0);
    }

    @Override  // goxl
    public final void b(Object object0) {
        GetTokenResponse getTokenResponse0 = (GetTokenResponse)object0;
        goyp goyp0 = new goyp();
        goyp0.d(getTokenResponse0.b);
        goyp0.c(null);
        goyp0.e(null);
        this.b.e(this.a, getTokenResponse0, goyp0, this);
    }
}

