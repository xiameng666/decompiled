import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class caod {
    public static final bboh a;
    public final gopj b;
    public final Executor c;
    public final capf d;
    public final canm e;
    public final canh f;
    private final Set g;
    private final List h;

    static {
        caod.a = bboh.b("GmscoreIpa", bbcu.ee);
    }

    public caod(gopj gopj0, Executor executor0, capf capf0, canh canh0) {
        this.g = new HashSet();
        this.h = new ArrayList();
        this.b = gopj0;
        this.c = executor0;
        this.d = capf0;
        this.f = canh0;
        canm canm0 = new canm(2);
        this.e = canm0;
        canm0.g();
        canh0.b(canm0);
    }

    public final gmcd a() {
        this.d();
        gmcd gmcd0 = gmbu.e(this.h);
        this.h.clear();
        return glzd.f(gmcd0, new cany(this), this.c);
    }

    public final gmcd b(evql evql0, List list0, gops[] arr_gops, boolean z) {
        return glzd.g(jqy.a(new caob(this, evql0, list0)), new caoc(this, z, arr_gops, list0), this.c);
    }

    public final void c(capc capc0) {
        this.g.add(capc0);
        if(huhz.g() == ((long)this.g.size())) {
            this.d();
        }
    }

    private final void d() {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        Set set0 = this.g;
        for(Object object0: set0) {
            capc capc0 = (capc)object0;
            gops gops0 = canp.d(capc0);
            if(gops0 != null) {
                arrayList0.add(gops0);
                arrayList1.add(new cape(capc0.g, ((int)2)));
            }
        }
        gops[] arr_gops = (gops[])arrayList0.toArray(new gops[0]);
        evql evql0 = this.b.g(arr_gops);
        this.e.e(arrayList0.size());
        set0.clear();
        gmcd gmcd0 = this.b(evql0, arrayList1, arr_gops, true);
        this.h.add(gmcd0);
    }
}

