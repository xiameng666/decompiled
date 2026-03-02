import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class bnrt implements bnro {
    public static final bboh a;
    public final bpam b;
    public final fquu c;
    public final Object d;
    public gfsx e;
    private final bopi f;
    private final Context g;

    static {
        bnrt.a = bboh.b("EidCacheLoaderImpl", bbcu.eD);
    }

    public bnrt(bpam bpam0, fquu fquu0, bopi bopi0, Context context0) {
        this.d = new Object();
        this.e = gfqx.a;
        this.b = bpam0;
        this.c = fquu0;
        this.f = bopi0;
        this.g = context0;
    }

    @Override  // bnro
    public final gmcd a() {
        synchronized(this.d) {
            if(!this.e.i()) {
                List list0 = bbmn.h(this.g, "com.google.android.gms");
                ArrayList arrayList0 = new ArrayList(list0.size());
                for(Object object1: list0) {
                    gdta gdta0 = gdta.g(((boou)this.f).a(((Account)object1)).g().d());
                    bnrp bnrp0 = new bnrp();
                    gdta gdta1 = gdta0.e(Throwable.class, bnrp0, gmap.a).h(new bnrq(this, ((Account)object1)), gmap.a);
                    bnrr bnrr0 = new bnrr();
                    arrayList0.add(gdta1.e(Throwable.class, bnrr0, gmap.a));
                }
                this.e = gfsx.m(gdtf.a(arrayList0).a(new bnrs(), gmap.a));
            }
        }
        return this.e.d();
    }
}

