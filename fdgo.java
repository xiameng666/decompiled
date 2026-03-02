import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class fdgo extends fdfe {
    public fdgo(fdgx fdgx0, aztw aztw0) {
        Objects.requireNonNull(fdgx0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final azuj g(Status status0) {
        return new fdgw(status0, null);
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        ((fdje)((fdmm)azsr0).H()).af(new fdgn(this));
    }
}

