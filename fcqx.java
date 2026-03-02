import j..util.Optional;

public final class fcqx implements Runnable {
    public final fcrb a;
    public final String b;
    public final long c;
    public final Optional d;
    public final int e;

    public fcqx(fcrb fcrb0, String s, long v, Optional optional0, int v1) {
        this.a = fcrb0;
        this.b = s;
        this.c = v;
        this.d = optional0;
        this.e = v1;
    }

    @Override
    public final void run() {
        fcrb.a.j("Watch is charging. Notifying phone.", new Object[0]);
        fcrl.a.j("sending ready_to_restore request", new Object[0]);
        fcri fcri0 = new fcri(this.a.g, this.b);
        gmbu.t(glzd.g(this.a.g.b("sendReadyToRestoreRequest", fcri0), new fcrj(), this.a.g.c), new fcqz(this.a, this.b, this.c, this.d, this.e), this.a.h);
    }
}

