import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

final class govk implements goxl {
    final goxa a;
    final gowy b;

    public govk(gowy gowy0, goxa goxa0) {
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
        if(!TextUtils.isEmpty(((goxt)object0).f)) {
            if(this.b.c.b()) {
                OnFailedMfaSignInAidlResponse onFailedMfaSignInAidlResponse0 = new OnFailedMfaSignInAidlResponse(((goxt)object0).f, ((goxt)object0).e, null);
                this.a.c(onFailedMfaSignInAidlResponse0);
                return;
            }
            gowy.a.f("Need to do multi-factor auth, but either the SDK does not support it, or the flag is disabled.", new Object[0]);
            this.a("REQUIRES_SECOND_FACTOR_AUTH");
            return;
        }
        GetTokenResponse getTokenResponse0 = new GetTokenResponse(((goxt)object0).b, ((goxt)object0).a, ((long)((goxt)object0).d), "Bearer");
        gowy.g(this.b, getTokenResponse0, null, Boolean.valueOf(((goxt)object0).c), this.a, this);
    }
}

