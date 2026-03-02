import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajdz extends ajdv {
    final ajhf a;
    final Account b;
    final String c;
    final String d;
    final byte[] e;
    final byte[] f;

    public ajdz() {
        super(0x657);
        this.a = new ajhf(this);
    }

    public ajdz(ajes ajes0, Account account0, String s, byte[] arr_b, byte[] arr_b1) {
        this.b = account0;
        this.c = s;
        this.d = "AES";
        this.e = arr_b;
        this.f = arr_b1;
        Objects.requireNonNull(ajes0);
        super(0x657);
        this.a = new ajhf(this);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.e(this.a, this.b, this.c, this.d, this.e, this.f, apiMetadata0);
    }
}

