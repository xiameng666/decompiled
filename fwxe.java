import j..util.Objects;

final class fwxe implements Runnable {
    final fwxh a;

    public fwxe(fwxh fwxh0) {
        Objects.requireNonNull(fwxh0);
        this.a = fwxh0;
        super();
    }

    @Override
    public final void run() {
        fwxk fwxk0 = (fwxk)this.a.d;
        int v = fwxk0.j.b();
        fwxk0.a.h(0x71, v);
        fwxk0.b();
        if(fwxk0.c && (!fwxk0.k.c() || !fwxk0.j.c(fwwz.b(fwxk0.d, fwxk0.e)))) {
            fwxk0.k();
        }
    }
}

