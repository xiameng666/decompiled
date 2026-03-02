import j..util.Objects;

final class cror implements Runnable {
    final crii a;
    final croy b;

    public cror(croy croy0, crii crii0) {
        this.a = crii0;
        Objects.requireNonNull(croy0);
        this.b = croy0;
        super();
    }

    @Override
    public final void run() {
        croy croy0 = this.b;
        synchronized(croy0) {
            croy.c(croy0);
            croz croz0 = croy0.c;
            if(!croz0.C()) {
                croz0.aJ().k.a("Connected to service");
                croz0.B(this.a);
            }
        }
    }
}

