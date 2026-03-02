import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajer extends ajdv {
    final ajim a;
    final String b;
    final byte[] c;
    final Payload d;

    public ajer() {
        super(0x659);
        this.a = new ajim(this);
    }

    public ajer(ajes ajes0, byte[] arr_b, Payload payload0) {
        this.b = "authzen";
        this.c = arr_b;
        this.d = payload0;
        Objects.requireNonNull(ajes0);
        super(0x659);
        this.a = new ajim(this);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.y(this.a, this.b, this.c, this.d, apiMetadata0);
    }
}

