public final class bnlq extends RuntimeException {
    public bnlq(Throwable throwable0) {
        super(throwable0);
    }

    public final gfsx a() {
        return !(this.getCause() instanceof iapl) ? gfqx.a : gfsx.m(((iapl)this.getCause()).a);
    }

    public final boolean b() {
        return this.c(iaph.o);
    }

    public final boolean c(iaph iaph0) {
        return this.a().i() && ((iapk)this.a().d()).t == iaph0;
    }

    public final boolean d() {
        if(!this.a().i()) {
            return true;
        }
        iaph iaph0 = ((iapk)this.a().d()).t;
        return !iaph0.equals(iaph.q) && !iaph0.equals(iaph.h);
    }
}

