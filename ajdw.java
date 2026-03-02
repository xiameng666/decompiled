import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajdw extends ajdv {
    final ajho a;
    final String b;
    final Account c;

    public ajdw() {
        super(1620);
        this.a = new ajho(this);
    }

    public ajdw(ajes ajes0, String s, Account account0) {
        this.b = s;
        this.c = account0;
        Objects.requireNonNull(ajes0);
        super(1620);
        this.a = new ajho(this);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.a(this.a, this.b, this.c, apiMetadata0);
    }
}

