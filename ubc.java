import java.security.MessageDigest;

public final class ubc implements uay {
    public final bxd b;

    public ubc() {
        this.b = new uqb();
    }

    @Override  // uay
    public final void a(MessageDigest messageDigest0) {
        for(int v = 0; true; ++v) {
            bxd bxd0 = this.b;
            if(v >= bxd0.d_num) {
                break;
            }
            ubb ubb0 = (ubb)bxd0.f(v);
            Object object0 = bxd0.i(v);
            uba uba0 = ubb0.c;
            if(ubb0.e == null) {
                ubb0.e = ubb0.d.getBytes(uay.a);
            }
            uba0.a(ubb0.e, object0, messageDigest0);
        }
    }

    public final Object b(ubb ubb0) {
        return this.b.containsKey(ubb0) ? this.b.get(ubb0) : ubb0.b;
    }

    public final void c(ubc ubc0) {
        this.b.k(ubc0.b);
    }

    public final void d(ubb ubb0, Object object0) {
        this.b.put(ubb0, object0);
    }

    @Override  // uay
    public final boolean equals(Object object0) {
        return (object0 instanceof ubc) ? this.b.equals(((ubc)object0).b) : false;
    }

    @Override  // uay
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}

