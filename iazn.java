import j..util.Objects;

final class iazn implements Runnable {
    final iazr a;

    public iazn(iazr iazr0) {
        Objects.requireNonNull(iazr0);
        this.a = iazr0;
        super();
    }

    @Override
    public final void run() {
        boolean z;
        iazr iazr0 = this.a;
        synchronized(iazr0) {
            if(iazr0.k == 6) {
                z = false;
            }
            else {
                iazr0.k = 6;
                z = true;
            }
        }
        if(z) {
            iapk iapk0 = iapk.q.f("Keepalive failed. The connection is likely gone");
            this.a.l.a.q(iapk0);
        }
    }
}

