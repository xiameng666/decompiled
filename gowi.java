import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class gowi implements goxl {
    final goxu a;
    final Context b;
    final goxa c;
    final gowy d;

    public gowi(gowy gowy0, goxu goxu0, Context context0, goxa goxa0) {
        this.a = goxu0;
        this.b = context0;
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
        this.a.a = ((GetTokenResponse)object0).b;
        gowh gowh0 = new gowh(this, this.c);
        goxv goxv0 = new goxv();
        String s = hsyj.c();
        this.d.b.b(this.a, goxv0, s, "mfaEnrollment:finalize").z(new goti(this.d.b, this.b, gowh0, this.a));
    }
}

