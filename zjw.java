import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

@ibnh
public final class zjw {
    public final Map a;
    public ggfp b;
    public final Map c;
    private lqi d;
    private lqi e;

    public zjw() {
        this.a = new HashMap();
        this.b = ggnj.a;
        this.c = new ConcurrentHashMap();
    }

    public final lqi a() {
        if(this.d == null) {
            lqi lqi0 = new lqi();
            this.d = lqi0;
            lqi0.l(Boolean.valueOf(false));
        }
        return this.d;
    }

    public final lqi b() {
        if(this.e == null) {
            lqi lqi0 = new lqi();
            this.e = lqi0;
            lqi0.l(Boolean.valueOf(false));
        }
        return this.e;
    }

    final lqi c(zjv zjv0) {
        Map map0 = this.c;
        if(map0.containsKey(zjv0)) {
            return (lqi)map0.get(zjv0);
        }
        lqi lqi0 = new lqi();
        lqi0.l(new zho(zjv0.b));
        map0.put(zjv0, lqi0);
        return lqi0;
    }

    public final lqi d(zjv zjv0) {
        Map map0 = this.a;
        if(map0.containsKey(zjv0)) {
            return (lqi)map0.get(zjv0);
        }
        lqi lqi0 = new lqi();
        lqi0.l(new zhq(false, false, null));
        map0.put(zjv0, lqi0);
        return lqi0;
    }

    public final zho e(zjv zjv0) {
        lqi lqi0 = (lqi)this.c.get(zjv0);
        gftb.z(lqi0, "ResourceInfoLiveData should never be null here.");
        zho zho0 = (zho)lqi0.ij();
        gftb.z(zho0, "ResourceInfo should never be null here.");
        return zho0;
    }

    public final void f(Long long0) {
        ggfn ggfn0 = new ggfn();
        ggfn0.k(this.b);
        ggfn0.i(long0);
        this.b = ggfn0.h();
    }

    public final void g(aatb aatb0, String s, boolean z) {
        ggfn ggfn0 = new ggfn();
        for(Object object0: this.c.keySet()) {
            zjv zjv0 = (zjv)object0;
            if(((ProtoLiteMessage)zjv0.a).equals(aatb0) && zjv0.c.equals(s)) {
                ggfn0.i(this.c(zjv0));
            }
        }
        for(Object object1: ggfn0.h()) {
            lqi lqi0 = (lqi)object1;
            zho zho0 = (zho)lqi0.ij();
            gftb.z(zho0, "ResourceInfo should never be null here.");
            if(z || !zho0.a.f) {
                lqi0.l(new zho(zho0.a, 0L, zho0.c));
            }
        }
    }
}

