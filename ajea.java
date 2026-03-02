import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajea extends ajdv {
    final ajhi a;
    final Account b;
    final String c;
    final String d;
    final byte[] e;

    public ajea() {
        super(0x656);
        this.a = new ajhi(this);
    }

    public ajea(ajes ajes0, Account account0, String s, byte[] arr_b) {
        this.b = account0;
        this.c = s;
        this.d = "HmacSHA256";
        this.e = arr_b;
        Objects.requireNonNull(ajes0);
        super(0x656);
        this.a = new ajhi(this);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.f(this.a, this.b, this.c, this.d, this.e, apiMetadata0);
    }
}

