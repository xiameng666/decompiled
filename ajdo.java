import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajdo extends ajeg {
    final String a;
    final Account b;

    public ajdo(ajes ajes0, Account account0) {
        this.a = "DeviceSync:BetterTogether";
        this.b = account0;
        Objects.requireNonNull(ajes0);
        super(1630);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.m(this.c, this.a, this.b, apiMetadata0);
    }
}

