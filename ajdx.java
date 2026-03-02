import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajdx extends ajdv {
    final ajhr a;
    final byte[] b;

    public ajdx() {
        super(0x674);
        this.a = new ajhr(this);
    }

    public ajdx(ajes ajes0, byte[] arr_b) {
        this.b = arr_b;
        Objects.requireNonNull(ajes0);
        super(0x674);
        this.a = new ajhr(this);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.b(this.a, this.b, apiMetadata0);
    }

    @Override  // azzd
    public final Feature[] f() {
        return new Feature[]{amjx.b};
    }
}

