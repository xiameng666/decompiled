import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajeb extends ajdv {
    final ajhl a;
    final byte[] b;

    public ajeb() {
        super(0x655);
        this.a = new ajhl(this);
    }

    public ajeb(ajes ajes0, byte[] arr_b) {
        this.b = arr_b;
        Objects.requireNonNull(ajes0);
        super(0x655);
        this.a = new ajhl(this);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.g(this.a, this.b, apiMetadata0);
    }
}

