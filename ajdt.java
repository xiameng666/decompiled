import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

final class ajdt extends ajdy {
    final String a;
    final Account b;

    public ajdt(ajes ajes0, String s, Account account0) {
        this.a = s;
        this.b = account0;
        Objects.requireNonNull(ajes0);
        super();
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.d(this.c, this.a, this.b, apiMetadata0);
    }
}

