import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import j..util.Objects;

public final class govz implements goxl {
    final VerifyAssertionRequest a;
    final goxa b;
    final gowy c;

    public govz(gowy gowy0, VerifyAssertionRequest verifyAssertionRequest0, goxa goxa0) {
        this.a = verifyAssertionRequest0;
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
        gowy gowy0 = this.c;
        if(gowy0.c.a()) {
            this.a.b();
        }
        String s = ((GetTokenResponse)object0).b;
        batl.q(s);
        this.a.b = s;
        govy govy0 = new govy(this, this.b, this);
        gowy0.b.l(null, this.a, govy0);
    }
}

