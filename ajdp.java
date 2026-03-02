import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajdp extends ajeg {
    final String a;

    public ajdp(ajes ajes0) {
        this.a = "DeviceSync:BetterTogether";
        Objects.requireNonNull(ajes0);
        super(0x65F);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.n(this.c, this.a, apiMetadata0);
    }
}

