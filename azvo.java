import com.google.android.gms.common.api.internal.BasePendingResult;
import j..util.Objects;

public final class azvo {
    final BasePendingResult a;

    public azvo(BasePendingResult basePendingResult0) {
        Objects.requireNonNull(basePendingResult0);
        this.a = basePendingResult0;
        super();
    }

    @Override
    protected final void finalize() {
        BasePendingResult.m(this.a.i);
        super.finalize();
    }
}

