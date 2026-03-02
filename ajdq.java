import android.accounts.Account;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;
import java.util.List;

final class ajdq extends ajeq {
    final String a;
    final Account b;
    final List c;

    public ajdq(ajes ajes0, Account account0, List list0) {
        this.a = "DeviceSync:BetterTogether";
        this.b = account0;
        this.c = list0;
        Objects.requireNonNull(ajes0);
        super(0x660);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.q(this.f, this.a, this.b, 9, this.c, apiMetadata0);
    }

    @Override  // azzd
    public final Feature[] f() {
        return new Feature[]{amjx.a};
    }
}

