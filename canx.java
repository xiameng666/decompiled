import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public abstract class canx {
    public static final bboh a;
    protected final gopj b;
    protected final Executor c;
    public final capf d;
    private static final Long e;

    static {
        canx.a = bboh.b("GmscoreIpa", bbcu.ee);
        canx.e = huhz.g();
    }

    public canx(gopj gopj0, Executor executor0, capf capf0) {
        this.b = gopj0;
        this.c = executor0;
        this.d = capf0;
    }

    public abstract gmcd a();

    protected abstract gops b(capd arg1);

    protected boolean c() {
        return true;
    }

    private final void d(Map map0, List list0, canm canm0) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: map0.keySet()) {
            capd capd0 = (capd)map0.get(((Long)object0));
            gops gops0 = this.b(capd0);
            if(gops0 != null) {
                arrayList0.add(gops0);
                arrayList1.add(new cape(capd0.g, ((int)2)));
            }
        }
        if(!arrayList0.isEmpty()) {
            gops[] arr_gops = (gops[])arrayList0.toArray(new gops[0]);
            evql evql0 = this.b.g(arr_gops);
            canm0.e(arrayList0.size());
            gmcu gmcu0 = new gmcu();
            cans cans0 = new cans(this, canm0, arrayList1, gmcu0);
            evql0.y(this.c, cans0);
            cant cant0 = new cant(this, canm0, gmcu0);
            evql0.v(this.c, cant0);
            list0.add(gmcu0);
        }
        map0.clear();
    }

    protected final gmcd e(evql evql0, Integer integer0) {
        gmcd gmcd0 = new gmcu();
        canu canu0 = new canu(this, ((gmcu)gmcd0), integer0);
        evql0.y(this.c, canu0);
        canv canv0 = new canv(this, ((gmcu)gmcd0));
        evql0.v(this.c, canv0);
        return gmcd0;
    }

    public final gmcd f(caoq caoq0, canm canm0) {
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        int v = 0;
        while(caoq0.e()) {
            capd capd0 = caoq0.d();
            if(capd0 != null && capd0.d().booleanValue()) {
                hashMap0.put(capd0.g, capd0);
                ++v;
                if(Long.compare(hashMap0.size(), canx.e.longValue()) >= 0 || !caoq0.e() || v >= 0x7FFFFFFF) {
                    this.d(hashMap0, arrayList0, canm0);
                }
                if(v >= 0x7FFFFFFF) {
                    break;
                }
            }
        }
        if(!hashMap0.isEmpty()) {
            this.d(hashMap0, arrayList0, canm0);
        }
        caoq0.close();
        return glzd.f(gmbu.e(arrayList0), new canw(this, canm0), this.c);
    }
}

