import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import java.util.concurrent.atomic.AtomicReference;

public final class blzh implements glzn {
    final AtomicReference a;
    final ajes b;
    final String c;
    final Account d;

    public blzh(AtomicReference atomicReference0, ajes ajes0, String s, Account account0) {
        this.a = atomicReference0;
        this.b = ajes0;
        this.c = s;
        this.d = account0;
        super();
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        this.a.set(((KeyDerivationResult)object0).b);
        return fhra.b(this.b.b(this.c, this.d));
    }
}

