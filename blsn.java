import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class blsn {
    private final Context a;

    public blsn(Context context0) {
        this.a = context0;
    }

    public final gmcd a(byte[] arr_b, Account account0, blzo blzo0, String s) {
        if(arr_b.length != 16) {
            ((ggtj)blzk.a.j()).z("Unexpected client EID length: %d", arr_b.length);
            return null;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, 8);
        ajes ajes0 = new ajes(this.a);
        AtomicReference atomicReference0 = new AtomicReference();
        AtomicReference atomicReference1 = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        blzf blzf0 = new blzf(atomicReference0, arr_b1, ajes0, account0, s);
        blzg blzg0 = new blzg(atomicReference1, ajes0, account0, s, arr_b1);
        gmcd gmcd0 = glzd.g(glzd.g(fhra.b(ajes0.g(account0, s + "_cable_irk", bbmt.f(new byte[][]{arr_b1, blzk.c}))), blzf0, gmap.a), blzg0, gmap.a);
        return hstp.a.b().a() ? glzd.f(glzd.g(gmcd0, new blzh(atomicReference2, ajes0, s, account0), gmap.a), new blzi(blzo0, arr_b1, atomicReference0, atomicReference1, atomicReference2, account0), gmap.a) : glzd.f(gmcd0, new blzj(arr_b1, atomicReference0, atomicReference1, account0), gmap.a);
    }
}

