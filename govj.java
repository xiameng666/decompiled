import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class govj implements goxl {
    final EmailAuthCredential a;
    final goxa b;
    final gowy c;

    public govj(gowy gowy0, EmailAuthCredential emailAuthCredential0, goxa goxa0) {
        this.a = emailAuthCredential0;
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
        goxs goxs0 = new goxs(this.a, ((GetTokenResponse)object0).b);
        this.c.b(goxs0, this.b);
    }
}

