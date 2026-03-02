import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

final class gowh implements goxl {
    final goxa a;
    final gowi b;

    public gowh(gowi gowi0, goxa goxa0) {
        this.a = goxa0;
        Objects.requireNonNull(gowi0);
        this.b = gowi0;
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        Status status0 = gozl.a(s);
        this.a.b(status0);
    }

    @Override  // goxl
    public final void b(Object object0) {
        goxv goxv0 = (goxv)object0;
        long v = goyh.a(goxv0.a);
        GetTokenResponse getTokenResponse0 = new GetTokenResponse(goxv0.b, goxv0.a, v, "Bearer");
        gowy.g(this.b.d, getTokenResponse0, null, Boolean.valueOf(false), this.a, this);
    }
}

