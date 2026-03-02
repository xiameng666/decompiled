import android.accounts.Account;
import android.content.Context;
import java.net.MalformedURLException;
import java.net.URL;

public final class dnlc extends lsb {
    public final Context a;
    public final Account b;
    public final dmet c;
    public final ibrt d;
    public final bboh e;
    public final icnj f;
    public final icnj g;
    public final icnl h;
    public final icnl i;
    public final azts j;

    public dnlc(Context context0, azts azts0, Account account0, dmet dmet0, ibrt ibrt0) {
        this.a = context0;
        this.j = azts0;
        this.b = account0;
        this.c = dmet0;
        this.d = ibrt0;
        this.e = bboh.b("Pay", bbcu.cZ);
        icnl icnl0 = icnm.a(new fuhm(null, new fryu(""), null, 5));
        this.h = icnl0;
        icnl icnl1 = icnm.a(ibps.a);
        this.i = icnl1;
        this.f = new icmp(icnl0);
        this.g = new icmp(icnl1);
    }

    public static final String a(String s) {
        try {
            String s1 = new URL(s).getHost();
            ibuq.e(s1, "getHost(...)");
            return ibzk.u(s1, "www.");
        }
        catch(MalformedURLException unused_ex) {
            return s;
        }
    }

    public static final fujl b(fryk fryk0) {
        return new fujl(fryk0, null, null, new frxq(hll.h), false, null, false, 0xF0);
    }
}

