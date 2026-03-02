import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;

public final class bcsx extends bcvr {
    final bcsw a;
    final ContextDataFilterImpl d;

    public bcsx(aztw aztw0, ContextDataFilterImpl contextDataFilterImpl0, bcsw bcsw0) {
        this.d = contextDataFilterImpl0;
        this.a = bcsw0;
        super(aztw0);
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        batl.l(((boolean)(1 ^ (this.a == null ? 1 : 0))));
        ((bcvt)azsr0).N();
        bcwg bcwg0 = (bcwg)((bcvt)azsr0).H();
        bcwc bcwc0 = new bcwc(this, null, null, null, null);
        bcwa bcwa0 = this.a == null ? null : ((bcwa)((bcvt)azsr0).s().a(this.a));
        ApiMetadata apiMetadata0 = cclr.a(((bcvt)azsr0).r);
        bcwg0.g(bcwc0, ((bcvt)azsr0).c.b, ((bcvt)azsr0).c.a, ((bcvt)azsr0).c.d, this.d, bcwa0, null, apiMetadata0);
    }
}

