import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import j..util.Objects;

public final class bcwh extends bcvr {
    final InterestUpdateBatchImpl a;

    public bcwh(InterestUpdateBatchImpl interestUpdateBatchImpl0, aztw aztw0) {
        Objects.requireNonNull(interestUpdateBatchImpl0);
        this.a = interestUpdateBatchImpl0;
        super(aztw0);
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        bcvt bcvt0 = (bcvt)azsr0;
        bcvt0.N();
        bcwg bcwg0 = (bcwg)bcvt0.H();
        bcwc bcwc0 = new bcwc(this, null, null, null, null);
        ApiMetadata apiMetadata0 = cclr.a(bcvt0.r);
        bcwg0.e(bcwc0, bcvt0.c.b, bcvt0.c.a, bcvt0.c.d, this.a, apiMetadata0);
    }
}

