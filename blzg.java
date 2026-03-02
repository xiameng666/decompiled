import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.HashResult;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class blzg implements glzn {
    final AtomicReference a;
    final ajes b;
    final Account c;
    final String d;
    final byte[] e;

    public blzg(AtomicReference atomicReference0, ajes ajes0, Account account0, String s, byte[] arr_b) {
        this.a = atomicReference0;
        this.b = ajes0;
        this.c = account0;
        this.d = s;
        this.e = arr_b;
        super();
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        byte[] arr_b = Arrays.copyOf(((HashResult)object0).b, 16);
        this.a.set(arr_b);
        return fhra.b(this.b.iG(new ajdz(this.b, this.c, this.d + "_cable_lk", this.e, blzk.b)));
    }
}

