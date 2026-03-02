import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;

public final class dtxi implements dnqb {
    public dtvz a;
    private static final bboh b;
    private final gfsx c;

    static {
        dtxi.b = bboh.b("Pay", bbcu.cZ);
    }

    public dtxi() {
        this.c = gfqx.a;
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        dtph.k(9);
        if(hwmp.A()) {
            String s = cllr0.a;
            if(ibzk.W(s, "mdoc.refresh.")) {
                Bundle bundle0 = cllr0.b;
                if(bundle0 == null) {
                    ((ggtj)dtxi.b.j()).x("No bundle extras found");
                    return 2;
                }
                String s1 = bundle0.getString("extra_account_name");
                if(s1 == null) {
                    ((ggtj)dtxi.b.j()).x("No account name set");
                    return 2;
                }
                String s2 = dlmj.b(context0, s1);
                if(s2 != null && !TextUtils.isEmpty(s2)) {
                    Context context1 = AppContextProvider.a();
                    ibuq.e(context1, "getApplicationContext(...)");
                    dola dola0 = dlmg.a(context1, s1, s2);
                    dtui dtui0 = new dtui(dola0, dpst.a(dola0), new done());
                    this.c.f(dtui0);
                    dtui0.inject(this);
                    dtvz dtvz0 = this.a;
                    if(dtvz0 == null) {
                        ibuq.j("mdocRefreshManager");
                        dtvz0 = null;
                    }
                    dtvz0.b();
                    return 0;
                }
                ((ggtj)dtxi.b.j()).x("No account id found");
                return 2;
            }
            ((ggtj)dtxi.b.j()).B("Unknown task tag received: %s", s);
            return 2;
        }
        return 0;
    }

    @Override  // dnqb
    public final void b(Context context0) {
    }
}

