import j..util.Objects;

final class iazh implements Runnable {
    final iazi a;

    public iazh(iazi iazi0) {
        Objects.requireNonNull(iazi0);
        this.a = iazi0;
        super();
    }

    @Override
    public final void run() {
        iazk iazk0 = this.a.c;
        iazk0.n.remove(this.a.a);
        if(iazk0.r.a == iall.e && iazk0.n.isEmpty()) {
            iazk0.f();
        }
    }
}

