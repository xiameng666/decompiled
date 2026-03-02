import j..util.Objects;

final class fwxf implements Runnable {
    final int a;
    final fwxh b;

    public fwxf(fwxh fwxh0, int v) {
        this.a = v;
        Objects.requireNonNull(fwxh0);
        this.b = fwxh0;
        super();
    }

    @Override
    public final void run() {
        fwxk fwxk0 = (fwxk)this.b.d;
        fwxk0.a.h(0x72, this.a);
        if(this.a == 2) {
            fwxk0.k();
        }
    }
}

