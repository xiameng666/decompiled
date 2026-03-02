import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class ifqk {
    public static final Map a;
    public final ifqr b;
    public final ifqs c;
    public final int d;
    public final int e;

    static {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(Integer.valueOf(1), new ifqk(20, 2, idur.c));
        hashMap0.put(Integer.valueOf(2), new ifqk(20, 4, idur.c));
        hashMap0.put(Integer.valueOf(3), new ifqk(40, 2, idur.c));
        hashMap0.put(Integer.valueOf(4), new ifqk(40, 4, idur.c));
        hashMap0.put(Integer.valueOf(5), new ifqk(40, 8, idur.c));
        hashMap0.put(Integer.valueOf(6), new ifqk(60, 3, idur.c));
        hashMap0.put(Integer.valueOf(7), new ifqk(60, 6, idur.c));
        hashMap0.put(Integer.valueOf(8), new ifqk(60, 12, idur.c));
        hashMap0.put(Integer.valueOf(9), new ifqk(20, 2, idur.e));
        hashMap0.put(Integer.valueOf(10), new ifqk(20, 4, idur.e));
        hashMap0.put(Integer.valueOf(11), new ifqk(40, 2, idur.e));
        hashMap0.put(Integer.valueOf(12), new ifqk(40, 4, idur.e));
        hashMap0.put(Integer.valueOf(13), new ifqk(40, 8, idur.e));
        hashMap0.put(Integer.valueOf(14), new ifqk(60, 3, idur.e));
        hashMap0.put(Integer.valueOf(15), new ifqk(60, 6, idur.e));
        hashMap0.put(Integer.valueOf(16), new ifqk(60, 12, idur.e));
        hashMap0.put(Integer.valueOf(17), new ifqk(20, 2, idur.m));
        hashMap0.put(Integer.valueOf(18), new ifqk(20, 4, idur.m));
        hashMap0.put(Integer.valueOf(19), new ifqk(40, 2, idur.m));
        hashMap0.put(Integer.valueOf(20), new ifqk(40, 4, idur.m));
        hashMap0.put(Integer.valueOf(21), new ifqk(40, 8, idur.m));
        hashMap0.put(Integer.valueOf(22), new ifqk(60, 3, idur.m));
        hashMap0.put(Integer.valueOf(23), new ifqk(60, 6, idur.m));
        hashMap0.put(Integer.valueOf(24), new ifqk(60, 12, idur.m));
        hashMap0.put(Integer.valueOf(25), new ifqk(20, 2, idur.n));
        hashMap0.put(Integer.valueOf(26), new ifqk(20, 4, idur.n));
        hashMap0.put(Integer.valueOf(27), new ifqk(40, 2, idur.n));
        hashMap0.put(Integer.valueOf(28), new ifqk(40, 4, idur.n));
        hashMap0.put(Integer.valueOf(29), new ifqk(40, 8, idur.n));
        hashMap0.put(Integer.valueOf(30), new ifqk(60, 3, idur.n));
        hashMap0.put(Integer.valueOf(0x1F), new ifqk(60, 6, idur.n));
        hashMap0.put(Integer.valueOf(0x20), new ifqk(60, 12, idur.n));
        ifqk.a = DesugarCollections.unmodifiableMap(hashMap0);
    }

    public ifqk(int v, int v1, idqg idqg0) {
        this.d = v;
        this.e = v1;
        if(v < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if(v % v1 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int v2 = v / v1;
        if(v2 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        ifqs ifqs0 = new ifqs(v2, idqg0);
        this.c = ifqs0;
        this.b = (ifps)ifps.a.get(ifps.a(this.b(), this.a(), ifqs0.g.b, v, v1));
    }

    public ifqk(int v, int v1, iecl iecl0) {
        this(v, v1, ifpu.a(iecl0.getAlgorithmName()));
    }

    public final int a() {
        return this.c.f;
    }

    protected final String b() {
        return this.c.e;
    }
}

