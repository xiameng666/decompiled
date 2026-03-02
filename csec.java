public final class csec extends aaw {
    final xob a;

    public csec(xob xob0) {
        this.a = xob0;
        super(true);
    }

    @Override  // aaw
    public final void b() {
        csbe csbe0 = new csbe();
        ca ca0 = new ca(this.a.getSupportFragmentManager());
        ca0.j = 0x1003;
        ca0.C();
        ca0.G(0x7F0B0FCE, csbe0);  // id:container
        ca0.a();
        this.a.getSupportFragmentManager().aq();
    }
}

