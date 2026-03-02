public final class clg implements ibts {
    public final clj a;
    public final float b;

    public clg(clj clj0, float f) {
        this.a = clj0;
        this.b = f;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        long v = (long)(((Long)object0));
        clj clj0 = this.a;
        if(!clj0.z()) {
            if(clj0.c() == 0x8000000000000000L) {
                clj0.l(v);
            }
            float f = this.b;
            long v1 = v - clj0.c();
            int v2 = Float.compare(f, 0.0f);
            if(v2 != 0) {
                v1 = ibvr.d(((double)v1) / ((double)f));
            }
            clj0.q(v1);
            clj0.j(v1, ((boolean)((v2 == 0 ? 0 : 1) ^ 1)));
        }
        return ibom.a;
    }
}

