import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class svr extends svt {
    private static final List a;
    private final Map b;

    static {
        svr.a = Arrays.asList(new ssy[]{ssr.a, ssr.c, ssr.d});
    }

    public svr(Iterable iterable0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: iterable0) {
            linkedHashMap0.put(((stb)object0).d(), ((stb)object0));
        }
        this.b = DesugarCollections.unmodifiableMap(linkedHashMap0);
    }

    public svr(Map map0) {
        this.b = DesugarCollections.unmodifiableMap(new LinkedHashMap(map0));
    }

    @Override  // svt
    public final srt a() {
        return this.c(srs.a);
    }

    @Override  // svt
    public final srt b() {
        return this.c(srs.b);
    }

    private final srt c(srs srs0) {
        return (srt)this.b.get(srs0.c);
    }

    @Override  // svt
    public final ssd d() {
        return (ssd)this.b.get(ssd.a);
    }

    @Override  // svt
    public final ssr e() {
        for(Object object0: svr.a) {
            stb stb0 = (stb)this.b.get(((ssy)object0));
            if(stb0 != null) {
                return (ssr)stb0;
            }
        }
        throw new IllegalStateException("BUG: ADF does not contain an OID");
    }

    @Override  // svt
    public final svt f(ssp ssp0) {
        ssr ssr0 = this.e();
        byte[] arr_b = ssr0.a();
        ssr ssr1 = ssr.b(new ssr(ssr0.e, arr_b, ssp0));
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(this.b.size());
        linkedHashMap0.put(ssr1.n, ssr1);
        for(Object object0: this.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!(map$Entry0.getValue() instanceof ssr)) {
                linkedHashMap0.put(((ssy)map$Entry0.getKey()), ((stb)map$Entry0.getValue()));
            }
        }
        return new svr(linkedHashMap0);
    }

    @Override  // svt
    public final sxd g(ssg ssg0) {
        if(ssg0 == ssg.G) {
            return sxd.a;
        }
        sxd sxd0 = this.i(ssg0.H);
        Object object0 = null;
        if(sxd0.d() && (sxd0.b() instanceof sry)) {
            object0 = (sry)sxd0.b();
        }
        return sxd.a(object0);
    }

    @Override  // svt
    public final sxd h(ssg ssg0) {
        return this.s(ssg0, 2);
    }

    @Override  // svt
    public final sxd i(ssy ssy0) {
        return sxd.a(((stb)this.b.get(ssy0)));
    }

    @Override  // svt
    public final sxd j(ssg ssg0) {
        return this.s(ssg0, 1);
    }

    @Override  // svt
    public final Map k() {
        return this.b;
    }

    private final sxd s(ssg ssg0, int v) {
        sxd sxd0 = this.i(ssg0.H);
        if(sxd0.d()) {
            stb stb0 = (stb)sxd0.b();
            return !(stb0 instanceof sta) || ((sta)stb0).m.n() != v ? sxd.a : new sxd(((sta)stb0));
        }
        return sxd.a;
    }
}

