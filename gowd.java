import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

final class gowd implements goxl {
    final goxa a;
    final gowe b;

    public gowd(gowe gowe0, goxa goxa0) {
        this.a = goxa0;
        Objects.requireNonNull(gowe0);
        this.b = gowe0;
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        Status status0 = gozl.a(s);
        this.a.b(status0);
    }

    @Override  // goxl
    public final void b(Object object0) {
        if(!TextUtils.isEmpty(((gozh)object0).a) && !TextUtils.isEmpty(((gozh)object0).b)) {
            long v = goyh.a(((gozh)object0).a);
            GetTokenResponse getTokenResponse0 = new GetTokenResponse(((gozh)object0).b, ((gozh)object0).a, v, "Bearer");
            gowy.g(this.b.c, getTokenResponse0, null, Boolean.valueOf(false), this.a, this);
            return;
        }
        Status status0 = gozl.a("INTERNAL_SUCCESS_SIGN_OUT");
        this.a.b(status0);
    }
}

