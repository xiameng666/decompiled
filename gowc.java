import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class gowc implements goxl {
    final String a;
    final goxa b;
    final gowy c;

    public gowc(gowy gowy0, String s, goxa goxa0) {
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
        goya goya0 = new goya(getTokenResponse0.b);
        gowb gowb0 = new gowb(this, this, getTokenResponse0, this.a, this.b);
        this.c.b.g(goya0, gowb0);
    }
}

