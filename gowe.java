import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class gowe implements goxl {
    final String a;
    final goxa b;
    final gowy c;

    public gowe(gowy gowy0, String s, goxa goxa0) {
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
        gozg gozg0 = new gozg(((GetTokenResponse)object0).b, this.a);
        gowd gowd0 = new gowd(this, this.b);
        gozh gozh0 = new gozh();
        String s = hsyj.c();
        this.c.b.b(gozg0, gozh0, s, "mfaEnrollment:withdraw").z(new gotj(this.c.b, gowd0));
    }
}

