import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;
import java.util.List;

final class ajdr extends ajed {
    final int a;
    final List b;
    final String c;
    final Account d;
    final byte[] e;

    public ajdr(ajes ajes0, int v, List list0, String s, Account account0, byte[] arr_b) {
        this.a = v;
        this.b = list0;
        this.c = s;
        this.d = account0;
        this.e = arr_b;
        Objects.requireNonNull(ajes0);
        super(0x64D);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.j(this.f, this.a, this.b, this.c, this.d, null, this.e, apiMetadata0);
    }
}

