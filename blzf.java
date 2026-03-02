import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.HashResult;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class blzf implements glzn {
    final AtomicReference a;
    final byte[] b;
    final ajes c;
    final Account d;
    final String e;

    public blzf(AtomicReference atomicReference0, byte[] arr_b, ajes ajes0, Account account0, String s) {
        this.a = atomicReference0;
        this.b = arr_b;
        this.c = ajes0;
        this.d = account0;
        this.e = s;
        super();
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        byte[] arr_b = Arrays.copyOf(((HashResult)object0).b, 8);
        byte[] arr_b1 = glwl.d(new byte[][]{this.b, arr_b});
        this.a.set(arr_b1);
        byte[] arr_b2 = bbmt.f(new byte[][]{((byte[])this.a.get()), blzk.d});
        return fhra.b(this.c.g(this.d, this.e + "_cable_irk", arr_b2));
    }
}

