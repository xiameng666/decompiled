public final class ebxp implements gftc {
    public final ebxq a;

    public ebxp(ebxq ebxq0) {
        this.a = ebxq0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        gged_interceptors gged0 = ebxq.b;
        dyna dyna0 = dyna.b(((dylc)object0).c);
        if(dyna0 == null) {
            dyna0 = dyna.k;
        }
        if(gged0.contains(dyna0)) {
            dyna dyna1 = dyna.b(((dylc)object0).c);
            if(dyna1 == null) {
                dyna1 = dyna.k;
            }
            return this.a.c(dyna1, ((dylc)object0).d);
        }
        return false;
    }
}

