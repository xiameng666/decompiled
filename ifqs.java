import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class ifqs {
    public static final Map a;
    public final ifqr b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final ifqe g;

    static {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(Integer.valueOf(1), new ifqs(10, idur.c));
        hashMap0.put(Integer.valueOf(2), new ifqs(16, idur.c));
        hashMap0.put(Integer.valueOf(3), new ifqs(20, idur.c));
        hashMap0.put(Integer.valueOf(4), new ifqs(10, idur.e));
        hashMap0.put(Integer.valueOf(5), new ifqs(16, idur.e));
        hashMap0.put(Integer.valueOf(6), new ifqs(20, idur.e));
        hashMap0.put(Integer.valueOf(7), new ifqs(10, idur.m));
        hashMap0.put(Integer.valueOf(8), new ifqs(16, idur.m));
        hashMap0.put(Integer.valueOf(9), new ifqs(20, idur.m));
        hashMap0.put(Integer.valueOf(10), new ifqs(10, idur.n));
        hashMap0.put(Integer.valueOf(11), new ifqs(16, idur.n));
        hashMap0.put(Integer.valueOf(12), new ifqs(20, idur.n));
        ifqs.a = DesugarCollections.unmodifiableMap(hashMap0);
    }

    public ifqs(int v, idqg idqg0) {
        if(v < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if(idqg0 == null) {
            throw new NullPointerException("digest == null");
        }
        this.c = v;
        for(int v1 = 2; true; ++v1) {
            int v2 = this.c;
            if(v1 > v2) {
                break;
            }
            if((v2 - v1) % 2 == 0) {
                this.d = v1;
                String s = (String)ifpu.a.get(idqg0);
                if(s == null) {
                    throw new IllegalArgumentException("unrecognized digest oid: " + idqg0.b());
                }
                this.e = s;
                ifqe ifqe0 = new ifqe(idqg0);
                this.g = ifqe0;
                this.f = ifqe0.a;
                this.b = (ifpt)ifpt.a.get(ifpt.a(s, ifqe0.a, ifqe0.b, v));
                return;
            }
        }
        throw new IllegalStateException("should never happen...");
    }

    public ifqs(int v, iecl iecl0) {
        this(v, ifpu.a(iecl0.getAlgorithmName()));
    }

    final ifqc a() {
        return new ifqc(this.g);
    }
}

