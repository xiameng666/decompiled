import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import java.util.concurrent.atomic.AtomicReference;

public final class blzj implements gfsi {
    final byte[] a;
    final AtomicReference b;
    final AtomicReference c;
    final Account d;

    public blzj(byte[] arr_b, AtomicReference atomicReference0, AtomicReference atomicReference1, Account account0) {
        this.a = arr_b;
        this.b = atomicReference0;
        this.c = atomicReference1;
        this.d = account0;
        super();
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        byte[] arr_b = (byte[])this.b.get();
        byte[] arr_b1 = (byte[])this.c.get();
        return new blze(this.a, arr_b, arr_b1, ((KeyDerivationResult)object0).b, gfqx.a, this.d.name);
    }
}

