import j..util.Objects;

final class soo implements Runnable {
    final sor a;
    final sop b;

    public soo(sop sop0, sor sor0) {
        this.a = sor0;
        Objects.requireNonNull(sop0);
        this.b = sop0;
        super();
    }

    @Override
    public final void run() {
        soq soq0 = this.b.a;
        soq0.b.a(this.a);
        if(this.a.a != 2) {
            soq0.c.b();
        }
    }
}

