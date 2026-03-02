import j..util.Objects;

final class iazf implements Runnable {
    final iazi a;

    public iazf(iazi iazi0) {
        Objects.requireNonNull(iazi0);
        this.a = iazi0;
        super();
    }

    @Override
    public final void run() {
        iazi iazi0 = this.a;
        iazk iazk0 = iazi0.c;
        iazk0.u = null;
        if(iazk0.s != null) {
            gftb.r(iazk0.q == null, "Unexpected non-null activeTransport");
            iazi0.a.p(iazk0.s);
            return;
        }
        iavn iavn0 = iazi0.a;
        if(iazk0.p == iavn0) {
            iazk0.q = iavn0;
            iazk.j(iazk0);
            iazk0.t = iazk0.h.a();
            iazk0.d(iall.b);
        }
    }
}

