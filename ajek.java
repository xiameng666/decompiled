import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajek extends ajdv {
    final ajig a;
    final String b;
    final String c;
    final Account d;
    final Payload e;

    public ajek() {
        super(0x652);
        this.a = new ajig(this);
    }

    public ajek(ajes ajes0, Account account0, Payload payload0) {
        this.b = "PublicKey";
        this.c = "authzen";
        this.d = account0;
        this.e = payload0;
        Objects.requireNonNull(ajes0);
        super(0x652);
        this.a = new ajig(this);
    }

    @Override  // ajdv
    protected final void b(ajgx ajgx0, ApiMetadata apiMetadata0) {
        ajgx0.v(this.a, this.b, this.c, this.d, this.e, apiMetadata0);
    }
}

