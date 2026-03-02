import android.accounts.Account;
import android.util.Pair;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;

public final class blkf implements gfsi {
    public final Account a;
    public final String b;

    public blkf(Account account0, String s) {
        this.a = account0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return ((gfsx)object0).i() ? gfsx.m(Pair.create(Pair.create(this.a, this.b), ((KeyHandleResult)((gfsx)object0).d()))) : gfqx.a;
    }
}

