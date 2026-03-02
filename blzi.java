import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import java.util.concurrent.atomic.AtomicReference;

public final class blzi implements gfsi {
    final blzo a;
    final byte[] b;
    final AtomicReference c;
    final AtomicReference d;
    final AtomicReference e;
    final Account f;

    public blzi(blzo blzo0, byte[] arr_b, AtomicReference atomicReference0, AtomicReference atomicReference1, AtomicReference atomicReference2, Account account0) {
        this.a = blzo0;
        this.b = arr_b;
        this.c = atomicReference0;
        this.d = atomicReference1;
        this.e = atomicReference2;
        this.f = account0;
        super();
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        blzm blzm0;
        KeyHandleResult keyHandleResult0 = (KeyHandleResult)object0;
        try {
            blzm0 = null;
            blzm0 = blzm.c(new blzp(this.a, keyHandleResult0.b));
        }
        catch(bmby unused_ex) {
        }
        byte[] arr_b = (byte[])this.c.get();
        byte[] arr_b1 = (byte[])this.d.get();
        byte[] arr_b2 = (byte[])this.e.get();
        gfsx gfsx0 = gfsx.l(blzm0);
        return new blze(this.b, arr_b, arr_b1, arr_b2, gfsx0, this.f.name);
    }
}

