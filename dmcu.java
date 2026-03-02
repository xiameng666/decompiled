import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dmcu {
    private static final bboh a;
    private final dvjf b;
    private gged_interceptors c;
    private Integer d;

    static {
        dmcu.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmcu(dvjf dvjf0) {
        this.b = dvjf0;
    }

    public final gfsx a() {
        if(!this.d(hwsk.a.b().a())) {
            try {
                if(this.c == null) {
                    this.c = (gged_interceptors)this.b.a(null).first;
                }
                gged_interceptors gged0 = ValuableGroup.g(this.c);
                ibuq.e(gged0, "groupValuables(...)");
                ggqk ggqk0 = gged0.E();
                ibuq.e(ggqk0, "iterator(...)");
                int v = 0;
                while(ggqk0.hasNext()) {
                    if(((ValuableGroup)ggqk0.next()).h == guvj.c) {
                        ++v;
                    }
                }
                return gfsx.l(Integer.valueOf(v));
            }
            catch(eaqz eaqz0) {
                a.ae(dmcu.a.h(), "Failed to process gmail import count because of missing storage key", eaqz0);
                return gfqx.a;
            }
            catch(earn earn0) {
                a.ae(dmcu.a.h(), "Failed to process gmail import count because of missing storage key", earn0);
                return gfqx.a;
            }
            catch(dmhl dmhl0) {
                a.ae(dmcu.a.h(), "Failed to process gmail import count because of database exception", dmhl0);
                return gfqx.a;
            }
        }
        ((ggtj)dmcu.a.h()).x("Wallet is too big for this tip. Skip evaluation.");
        return gfqx.a;
    }

    public final gfsx b() {
        if(!this.d(hwsk.a.b().b())) {
            try {
                if(this.c == null) {
                    this.c = (gged_interceptors)this.b.a(null).first;
                }
                gged_interceptors gged0 = ValuableGroup.g(this.c);
                ibuq.e(gged0, "groupValuables(...)");
                ggqk ggqk0 = gged0.E();
                ibuq.e(ggqk0, "iterator(...)");
                int v = 0;
                while(ggqk0.hasNext()) {
                    ValuableGroup valuableGroup0 = (ValuableGroup)ggqk0.next();
                    if(valuableGroup0.h == guvj.c && ((Valuable)valuableGroup0.a.get(0)).O == 5 && valuableGroup0.bN()) {
                        ++v;
                    }
                }
                return gfsx.l(Integer.valueOf(v));
            }
            catch(eaqz eaqz0) {
                a.ae(dmcu.a.h(), "Failed to process gmail import count because of missing storage key", eaqz0);
                return gfqx.a;
            }
            catch(earn earn0) {
                a.ae(dmcu.a.h(), "Failed to process gmail import count because of missing storage key", earn0);
                return gfqx.a;
            }
            catch(dmhl dmhl0) {
                a.ae(dmcu.a.h(), "Failed to process gmail import count because of database exception", dmhl0);
                return gfqx.a;
            }
        }
        ((ggtj)dmcu.a.h()).x("Wallet is too big for this tip. Skip evaluation.");
        return gfqx.a;
    }

    public final gfsx c() {
        Integer integer0 = this.d;
        if(integer0 != null) {
            return gfsx.l(integer0);
        }
        try {
            Integer integer1 = dmjf.a(dmhk.d(this.b.h).c(), dvjf.f, new String[]{this.b.i, this.b.j});
            this.d = integer1;
            return gfsx.l(integer1);
        }
        catch(dmhl dmhl0) {
            a.ae(dmcu.a.h(), "Failed to process valuable count because of database exception", dmhl0);
            return gfqx.a;
        }
    }

    public final boolean d(long v) {
        if(Long.compare(v, 0L) < 0) {
            return false;
        }
        gfsx gfsx0 = this.c();
        return gfsx0.i() ? ((long)((Number)gfsx0.d()).intValue()) > v : true;
    }
}

