import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.Transaction;
import java.util.List;

public final class dnkl extends lsb {
    public final frxj a;
    public final frxn b;
    public final Context c;
    public final Account d;
    public final boolean e;
    public final dxzo f;
    public final lqi g;
    public final lqi h;
    public final lqi i;
    public final lqi j;
    public final lqi k;
    public final lqi l;
    public final lqi m;
    public final lqi n;
    public final lqi o;
    public final lqi p;
    public final edqg q;
    public final etgl r;
    private final long s;
    private final String t;
    private final lqi u;

    public dnkl(Context context0, Account account0, long v, String s, etgl etgl0, boolean z, dxzo dxzo0) {
        this.a = new frxj(new dnfl(null));
        this.b = new frxn();
        this.c = context0;
        this.d = account0;
        this.s = v;
        this.t = s;
        this.r = etgl0;
        this.e = z;
        this.f = dxzo0;
        this.g = new lqi();
        this.h = new lqi();
        Boolean boolean0 = Boolean.valueOf(false);
        this.i = new lqi(boolean0);
        this.j = new lqi(boolean0);
        Boolean boolean1 = Boolean.valueOf(true);
        this.u = new lqi(boolean1);
        this.k = new lqi(boolean1);
        this.l = new lqi(boolean0);
        this.m = new lqi(boolean0);
        this.n = new lqi(null);
        this.o = new lqi(boolean0);
        this.p = new lqi(boolean0);
        this.q = new edqg(boolean1);
    }

    public final dnfl a() {
        return (dnfl)this.a.a();
    }

    public final void b(icck icck0, frxf[] arr_frxf) {
        this.b.b(icck0, arr_frxf);
    }

    public final void c(boolean z) {
        this.u.l(Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        this.i.l(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        this.k.l(Boolean.valueOf(z));
    }

    public final void g(boolean z) {
        this.j.l(Boolean.valueOf(z));
    }

    public final void h(dnfl dnfl0) {
        this.a.b(dnfl0);
    }

    static Intent i(dnkl dnkl0, List list0, byte[] arr_b, long v, int v1) {
        dmre dmre0 = new dmre();
        dmre0.d(dnkl0.d);
        dmre0.h(2);
        boolean z = false;
        dmre0.j(((GooglePaymentMethodId[])list0.toArray(new GooglePaymentMethodId[0])));
        if((v1 & 8) != 0) {
            v = 0L;
        }
        dmre0.k(v);
        dmre0.f(dnkl0.s);
        dmre0.g(dnkl0.t);
        if((v1 & 2) != 0) {
            arr_b = null;
        }
        if(arr_b != null) {
            Transaction transaction0 = new Transaction();
            transaction0.a = arr_b;
            dmre0.l(transaction0);
        }
        if((v1 & 4) != 0) {
            z = true;
        }
        Intent intent0 = dmre0.c().putExtra("is_from_fop_details_page", z);
        ibuq.e(intent0, "putExtra(...)");
        return intent0;
    }

    public final void j() {
        this.l.l(Boolean.valueOf(true));
    }
}

