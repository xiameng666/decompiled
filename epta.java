import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class epta extends eptc {
    public epta(eptb eptb0, aztw aztw0) {
        Objects.requireNonNull(eptb0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return status0;
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        ((epue)((epui)azsr0).H()).i(false);
        this.n(Status.b);
    }
}

