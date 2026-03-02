import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import j..util.Objects;

public final class fdgs extends fdfe {
    final Uri a;

    public fdgs(fdgx fdgx0, aztw aztw0, Uri uri0) {
        this.a = uri0;
        Objects.requireNonNull(fdgx0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return new fcew(new DataHolder(DataHolder.a, status0.i));
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        ((fdje)((fdmm)azsr0).H()).S(new fdmc(this), this.a, 0);
    }
}

