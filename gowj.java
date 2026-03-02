import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class gowj implements goxl {
    final goxa a;
    final gowy b;

    public gowj(gowy gowy0, goxa goxa0) {
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
        goxx goxx0 = (goxx)object0;
        long v = goyh.a(goxx0.a);
        GetTokenResponse getTokenResponse0 = new GetTokenResponse(goxx0.b, goxx0.a, v, "Bearer");
        gowy.g(this.b, getTokenResponse0, null, Boolean.valueOf(false), this.a, this);
    }
}

