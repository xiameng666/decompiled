import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import j..util.Objects;

public final class gowr implements goxl {
    final goxa a;
    final gowy b;

    public gowr(gowy gowy0, goxa goxa0) {
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
        if(!((goyz)object0).d()) {
            this.b.d(((goyz)object0), this.a, this);
            return;
        }
        if(this.b.c.b()) {
            OnFailedMfaSignInAidlResponse onFailedMfaSignInAidlResponse0 = new OnFailedMfaSignInAidlResponse(((goyz)object0).l, ((goyz)object0).k, ((goyz)object0).c());
            this.a.c(onFailedMfaSignInAidlResponse0);
            return;
        }
        gowy.a.f("Need to do multi-factor auth, but SDK does not support it.", new Object[0]);
        this.a("REQUIRES_SECOND_FACTOR_AUTH");
    }
}

