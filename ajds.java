import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajds extends ajed {
    final String a;
    final Account b;
    final byte[] c;
    final byte[] d;
    final byte[] e;

    public ajds(ajes ajes0, String s, Account account0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        this.a = s;
        this.b = account0;
        this.c = arr_b;
        this.d = arr_b1;
        this.e = arr_b2;
        Objects.requireNonNull(ajes0);
        super(0x64E);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.k(this.f, 1, this.a, this.b, this.c, this.d, this.e, apiMetadata0);
    }
}

