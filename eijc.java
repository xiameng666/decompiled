public final class eijc extends eiix {
    private final eigi c;

    public eijc(eigb eigb0, eifs eifs0) {
        super(eigb0, eifs0);
        eigh eigh0 = new eigh();
        eigh0.c(((int)hrtd.q()));
        eigh0.d(((int)hrtd.a.I().N()));
        eigh0.b(((int)(hrtd.f() * 1000L)));
        this.c = eigh0.a();
    }

    @Override  // eiix
    public final void a() {
        if(hrtd.R()) {
            this.b.j(this.c);
        }
        else {
            this.b.l();
        }
        this.a.c(this.c);
    }

    @Override  // eiix
    public final void b() {
    }

    @Override
    public final String toString() {
        return "StateStill";
    }
}

