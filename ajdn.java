import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;
import java.util.List;

public final class ajdn extends ajeq {
    final String a;
    final Account b;
    final int c;
    final byte[] d;
    final List e;

    public ajdn(ajes ajes0, Account account0, int v, byte[] arr_b, List list0) {
        this.a = "DeviceSync:BetterTogether";
        this.b = account0;
        this.c = v;
        this.d = arr_b;
        this.e = list0;
        Objects.requireNonNull(ajes0);
        super(0x65D);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.l(this.f, this.a, this.b, this.c, this.d, this.e, apiMetadata0);
    }
}

