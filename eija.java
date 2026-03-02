public final class eija extends eiix {
    private final eigi c;

    public eija(eigb eigb0, eifs eifs0) {
        super(eigb0, eifs0);
        eigh eigh0 = new eigh();
        eigh0.c(((int)hrtd.a.I().L()));
        eigh0.d(0);
        eigh0.b(((int)(hrtd.f() * 1000L)));
        this.c = eigh0.a();
    }

    @Override  // eiix
    public final void a() {
        this.b.j(this.c);
        this.a.c(this.c);
    }

    @Override  // eiix
    public final void b() {
    }

    @Override
    public final String toString() {
        return "StateMoving";
    }
}

