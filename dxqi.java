import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.wallet.PaymentData;

public final class dxqi extends dxmj {
    public static final bboh i;
    public final Account j;
    public final dxte k;
    public final ibrt l;
    public final azts m;
    public final azts n;
    private final dmgi o;
    private final domj p;

    static {
        dxqi.i = bboh.b("Pay", bbcu.cZ);
    }

    public dxqi(Bundle bundle0, dxqz dxqz0, Account account0, String s, String s1, dmgi dmgi0, domj domj0, dxte dxte0, azts azts0, azts azts1, ibrt ibrt0) {
        super(bundle0, dxqz0, s, s1);
        this.j = account0;
        this.o = dmgi0;
        this.p = domj0;
        this.k = dxte0;
        this.n = azts0;
        this.m = azts1;
        this.l = ibrt0;
    }

    @Override  // dxmj
    public final void b() {
        icbb.b(lsc.a(this), null, null, new dxqe(this, null), 3);
    }

    @Override  // dxmj
    public final void c(PaymentData paymentData0) {
        icck icck0 = lsc.a(this);
        dxqg dxqg0 = new dxqg(this, paymentData0, null);
        icbb.b(icck0, this.l, null, dxqg0, 2);
    }

    @Override  // dxmj
    public final void f() {
        icck icck0 = lsc.a(this);
        dxqh dxqh0 = new dxqh(this, null);
        icbb.b(icck0, this.l, null, dxqh0, 2);
    }

    public final void n(dyna dyna0, hanq hanq0) {
        hapr hapr0 = dxsy.c(dyna0, hanr.f, hanq0, null);
        String s = this.p.a();
        this.o.c(hapr0, s);
    }
}

