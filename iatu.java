import j..util.Objects;

final class iatu implements Runnable {
    final int a;
    final iatv b;

    public iatu(iatv iatv0, int v) {
        this.a = v;
        Objects.requireNonNull(iatv0);
        this.b = iatv0;
        super();
    }

    @Override
    public final void run() {
        try {
            iavr iavr0 = this.b.j;
            int v = this.a;
            gftb.b(v > 0, "numMessages must be > 0");
            if(((ibbw)iavr0).b()) {
                return;
            }
            ((ibbw)iavr0).e += (long)v;
            ((ibbw)iavr0).a();
        }
        catch(Throwable throwable0) {
            this.b.b(throwable0);
        }
    }
}

