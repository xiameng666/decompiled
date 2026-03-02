import android.os.Bundle;
import com.google.android.gms.auth.cryptauth.synckeys.SyncKeysChimeraService;
import java.util.concurrent.TimeUnit;

public final class ajkr implements gfsi {
    public final ajfw a;
    public final bnaj b;
    public final boolean c;
    public final String d;
    public final erzz e;

    public ajkr(ajfw ajfw0, bnaj bnaj0, boolean z, String s, erzz erzz0) {
        this.a = ajfw0;
        this.b = bnaj0;
        this.c = z;
        this.d = s;
        this.e = erzz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gmlg gmlg0 = (gmlg)object0;
        erzz erzz0 = this.e;
        String s = this.d;
        boolean z = this.c;
        bnaj bnaj0 = this.b;
        ajfw ajfw0 = this.a;
        Object object1 = (int)1;
        try {
            if(gmlg0 == null) {
                SyncKeysChimeraService.a.f("No response from server.", new Object[0]);
                ajfw0.f();
                bnaj0.E(5, 6, z);
            }
            else if((gmlg0.b & 1) == 0 || (gmlg0.f == null ? gmkh.a : gmlg0.f).b == 0L) {
                ajfw0.f();
                SyncKeysChimeraService.a.f("Invalid response from server.", new Object[0]);
                bnaj0.E(5, 6, z);
            }
            else if(gmla.a(gmlg0.g) != 3 && (gmla.a(gmlg0.g) != 0 && gmla.a(gmlg0.g) != 1)) {
                SyncKeysChimeraService.a.h("Sync was successful.", new Object[0]);
                bnaj0.E(3, 0, z);
                object1 = (int)0;
            }
            else {
                SyncKeysChimeraService.a.m("Server overloaded.", new Object[0]);
                gmkh gmkh0 = gmlg0.f == null ? gmkh.a : gmlg0.f;
                long v1 = Math.max(gmkh0.b, hpta.b());
                long v2 = hpta.e() + v1;
                long v3 = gmkh0.d;
                cllc cllc0 = cllb.a(1, ((int)TimeUnit.MILLISECONDS.toSeconds(v3)), ((int)TimeUnit.MILLISECONDS.toSeconds(v3 + hpta.e())));
                Bundle bundle0 = new Bundle();
                bundle0.putString("account_name", s);
                bundle0.putInt("invocation_reason", 10);
                clkn clkn0 = new clkn();
                clkn0.p = true;
                clkn0.e(TimeUnit.MILLISECONDS.toSeconds(v1), TimeUnit.MILLISECONDS.toSeconds(v2));
                clkn0.t(ajkt.a(s));
                clkn0.w("com.google.android.gms.auth.cryptauth.synckeys.SyncKeysChimeraService");
                clkn0.u = bundle0;
                clkn0.t = cllc0;
                clkn0.g(0);
                clkn0.v(2);
                clkn0.x(0, 1);
                ajkt.c(clkn0.a());
                bnaj0.E(4, 7, z);
                object1 = (int)2;
            }
        }
        finally {
            erzz0.a();
        }
        return object1;
    }
}

