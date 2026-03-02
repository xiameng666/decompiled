import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajej extends ajdv {
    final ajid a;
    final String b;
    final Account c;

    public ajej() {
        super(0x65B);
        this.a = new ajid(this);
    }

    public ajej(ajes ajes0, Account account0) {
        this.b = "PublicKey";
        this.c = account0;
        Objects.requireNonNull(ajes0);
        super(0x65B);
        this.a = new ajid(this);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.p(this.a, this.b, this.c, apiMetadata0);
    }
}

