import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;

public final class bcvo extends azvc {
    final ContextDataFilterImpl a;

    public bcvo(aztw aztw0, ContextDataFilterImpl contextDataFilterImpl0) {
        this.a = contextDataFilterImpl0;
        super(bcta.a, aztw0);
    }

    @Override  // azvc
    public final void b(Object object0) {
        super.n(((azuj)object0));
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final azuj g(Status status0) {
        return new bcvn(this, status0);
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        bcvt bcvt0 = (bcvt)azsr0;
        bcvt0.N();
        bcwg bcwg0 = (bcwg)bcvt0.H();
        bcwc bcwc0 = new bcwc(null, this, null, null, null);
        ApiMetadata apiMetadata0 = cclr.a(bcvt0.r);
        bcwg0.f(bcwc0, bcvt0.c.b, bcvt0.c.a, bcvt0.c.d, this.a, apiMetadata0);
    }
}

