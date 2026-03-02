import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class govi implements goxl {
    final goxa a;
    final gowy b;

    public govi(gowy gowy0, goxa goxa0) {
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
        if(((gozd)object0).c()) {
            if(this.b.c.b()) {
                OnFailedMfaSignInAidlResponse onFailedMfaSignInAidlResponse0 = new OnFailedMfaSignInAidlResponse(((gozd)object0).e, ((gozd)object0).d, null);
                this.a.c(onFailedMfaSignInAidlResponse0);
                return;
            }
            gowy.a.f("Need to do multi-factor auth, but SDK does not support it.", new Object[0]);
            this.a("REQUIRES_SECOND_FACTOR_AUTH");
            return;
        }
        GetTokenResponse getTokenResponse0 = new GetTokenResponse(((gozd)object0).b, ((gozd)object0).a, ((long)((gozd)object0).c), "Bearer");
        gowy.g(this.b, getTokenResponse0, null, Boolean.valueOf(false), this.a, this);
    }
}

