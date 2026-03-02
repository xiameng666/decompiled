import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class ghfn implements gftc, Serializable {
    public final ghfo a;
    public final int b;
    public final ghfm c;
    public final ghfu d;
    public static final int e = 0;
    private static final double f = 0.0;
    private static final double g = 0.0;
    private static final long serialVersionUID = 0xDECAFL;

    static {
        double f = Math.log(2.0);
        ghfn.f = f;
        ghfn.g = f * f;
    }

    public ghfn(ghfo ghfo0, int v, ghfu ghfu0, ghfm ghfm0) {
        boolean z = true;
        gftb.d(v > 0, "numHashFunctions (%s) must be > 0", v);
        if(v > 0xFF) {
            z = false;
        }
        gftb.d(z, "numHashFunctions (%s) must be <= 255", v);
        this.a = ghfo0;
        this.b = v;
        gftb.check(ghfu0);
        this.d = ghfu0;
        gftb.check(ghfm0);
        this.c = ghfm0;
    }

    @Override  // gftc
    @Deprecated
    public final boolean a(Object object0) {
        return this.b(object0);
    }

    public final boolean b(Object object0) {
        ghfo ghfo0 = this.a;
        int v = this.b;
        switch(((Enum)this.c).ordinal()) {
            case 0: {
                long v1 = ghfo0.a();
                long v2 = ghgz.a.g(object0).c();
                for(int v3 = 1; v3 <= v; ++v3) {
                    int v4 = ((int)(v2 >>> 0x20)) * v3 + ((int)v2);
                    if(!ghfo0.b(((long)(v4 >= 0 ? ((int)(v2 >>> 0x20)) * v3 + ((int)v2) : ~v4)) % v1)) {
                        return false;
                    }
                }
                return true;
            }
            case 1: {
                long v5 = ghfo0.a();
                byte[] arr_b = ghgz.a.g(object0).f();
                long v6 = ghfp.a(arr_b);
                long v7 = ghfp.b(arr_b);
                for(int v8 = 0; v8 < v; ++v8) {
                    if(!ghfo0.b((0x7FFFFFFFFFFFFFFFL & v6) % v5)) {
                        return false;
                    }
                    v6 += v7;
                }
                return true;
            }
            default: {
                throw null;
            }
        }
    }

    public static ghfn c(ghfu ghfu0, long v, double f) {
        ghfp ghfp0 = ghfp.b;
        gftb.check(ghfu0);
        int v1 = Long.compare(v, 0L);
        boolean z = false;
        gftb.e(v1 >= 0, "Expected insertions (%s) must be >= 0", v);
        int v2 = Double.compare(f, 0.0);
        Double double0 = f;
        gftb.f(v2 > 0, "False positive probability (%s) must be > 0.0", double0);
        if((f < 1.0)) {
            z = true;
        }
        gftb.f(z, "False positive probability (%s) must be < 1.0", double0);
        gftb.check(ghfp0);
        if(v1 == 0) {
            v = 1L;
        }
        int v3 = Math.max(1, ((int)Math.round(-Math.log(f) / ghfn.f)));
        long v4 = (long)(((double)(-v)) * Math.log((v2 == 0 ? 4.900000E-324 : f)) / ghfn.g);
        try {
            return new ghfn(new ghfo(v4), v3, ghfu0, ghfp0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new IllegalArgumentException(a.D(v4, "Could not create BloomFilter of ", " bits"), illegalArgumentException0);
        }
    }

    @Override  // gftc
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ghfn) && this.b == ((ghfn)object0).b && this.d.equals(((ghfn)object0).d) && this.a.equals(((ghfn)object0).a) && this.c.equals(((ghfn)object0).c);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.b), this.d, this.c, this.a});
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new ghfl(this);
    }
}

