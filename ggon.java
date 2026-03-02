import j..util.Objects;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class ggon extends ggnn {
    public static final ggge b;
    private final ggeo c;
    private final ggeo d;
    private final int[] e;
    private final int[] f;

    static {
        ggon.b = new ggon(ggna.a, ggnj.a, ggnj.a);
    }

    public ggon(gged_interceptors gged0, ggfp ggfp0, ggfp ggfp1) {
        ggeo ggeo0 = ggkm.d(ggfp0);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ggqj ggqj0 = ggfp0.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            linkedHashMap0.put(object0, new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        ggqj ggqj1 = ggfp1.om();
        while(ggqj1.hasNext()) {
            Object object1 = ggqj1.next();
            linkedHashMap1.put(object1, new LinkedHashMap());
        }
        int[] arr_v = new int[gged0.size()];
        int[] arr_v1 = new int[gged0.size()];
        for(int v = 0; v < gged0.size(); ++v) {
            ggpi ggpi0 = (ggpi)gged0.get(v);
            Object object2 = ggpi0.b();
            Object object3 = ggpi0.a();
            Object object4 = ggpi0.c();
            arr_v[v] = (int)(((Integer)Objects.requireNonNull(((Integer)ggeo0.get(object2)))));
            Map map0 = (Map)Objects.requireNonNull(((Map)linkedHashMap0.get(object2)));
            arr_v1[v] = map0.size();
            ggon.v(object2, object3, map0.put(object3, object4), object4);
            ((Map)Objects.requireNonNull(((Map)linkedHashMap1.get(object3)))).put(object2, object4);
        }
        this.e = arr_v;
        this.f = arr_v1;
        ggek ggek0 = new ggek(linkedHashMap0.size());
        for(Object object5: linkedHashMap0.entrySet()) {
            ggek0.i(((Map.Entry)object5).getKey(), ggeo.k(((Map)((Map.Entry)object5).getValue())));
        }
        this.c = ggek0.b();
        ggek ggek1 = new ggek(linkedHashMap1.size());
        for(Object object6: linkedHashMap1.entrySet()) {
            ggek1.i(((Map.Entry)object6).getKey(), ggeo.k(((Map)((Map.Entry)object6).getValue())));
        }
        this.d = ggek1.b();
    }

    @Override  // ggpj
    public final int k() {
        return this.e.length;
    }

    @Override  // ggge
    public final ggeo l() {
        return ggeo.k(this.d);
    }

    @Override  // ggge
    public final ggeo m() {
        return ggeo.k(this.c);
    }

    @Override  // ggnn
    public final ggpi n(int v) {
        int v1 = this.e[v];
        Map.Entry map$Entry0 = (Map.Entry)this.c.v().v().get(v1);
        ggeo ggeo0 = (ggeo)map$Entry0.getValue();
        int v2 = this.f[v];
        Map.Entry map$Entry1 = (Map.Entry)ggeo0.v().v().get(v2);
        return ggon.t(map$Entry0.getKey(), map$Entry1.getKey(), map$Entry1.getValue());
    }

    @Override  // ggnn
    public final Object o(int v) {
        int v1 = this.e[v];
        ggeo ggeo0 = (ggeo)this.c.g().v().get(v1);
        int v2 = this.f[v];
        return ggeo0.g().v().get(v2);
    }

    @Override  // ggge
    public final Map p() {
        return this.m();
    }

    @Override  // ggnn
    Object writeReplace() {
        ggeo ggeo0 = ggkm.d(this.r());
        int[] arr_v = new int[this.q().size()];
        ggqj ggqj0 = this.q().om();
        for(int v = 0; ggqj0.hasNext(); ++v) {
            Object object0 = ggqj0.next();
            arr_v[v] = (int)(((Integer)Objects.requireNonNull(((Integer)ggeo0.get(((ggpi)object0).a())))));
        }
        return gggd.a(this, this.e, arr_v);
    }
}

