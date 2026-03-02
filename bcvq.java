import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class bcvq extends azvc {
    public bcvq(aztw aztw0) {
        super(bcta.a, aztw0);
    }

    @Override  // azvc
    public final void b(Object object0) {
        super.n(((azuj)object0));
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final azuj g(Status status0) {
        return new bcvp(this, status0);
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        bcvt bcvt0 = (bcvt)azsr0;
        SnapshotRequest snapshotRequest0 = new SnapshotRequest();
        bcvt0.N();
        bcwg bcwg0 = (bcwg)bcvt0.H();
        bcwc bcwc0 = new bcwc(null, null, null, this, null);
        ApiMetadata apiMetadata0 = cclr.a(bcvt0.r);
        bcwg0.b(bcwc0, bcvt0.c.b, bcvt0.c.a, bcvt0.c.d, snapshotRequest0, apiMetadata0);
    }
}

