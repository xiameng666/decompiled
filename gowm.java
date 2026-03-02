import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class gowm implements goxl {
    final goxa a;
    final gowy b;

    public gowm(gowy gowy0, goxa goxa0) {
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
        goya goya0 = new goya(getTokenResponse0.b);
        gowl gowl0 = new gowl(this, this, this.a, getTokenResponse0);
        this.b.b.g(goya0, gowl0);
    }
}

