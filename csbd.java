import j..util.Objects;

final class csbd extends aaw {
    final csbe a;

    public csbd(csbe csbe0) {
        Objects.requireNonNull(csbe0);
        this.a = csbe0;
        super(true);
    }

    @Override  // aaw
    public final void b() {
        fm fm0 = this.a.a.getSupportFragmentManager();
        ca ca0 = new ca(fm0);
        ca0.m(this.a);
        ca0.a();
        fm0.aq();
        ca ca1 = new ca(fm0);
        ca1.x(this.a);
        ca1.a();
    }
}

