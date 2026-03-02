final class atlk implements gmbg {
    final atmb a;
    final String b;

    public atlk(atmb atmb0, String s) {
        this.a = atmb0;
        this.b = s;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        atll.a.f("Impulse failure error message: %s", new Object[]{throwable0.getMessage()});
        this.a.d(this.b, gifh.i, Boolean.valueOf(true), "clear app data failed: impulse raises failure");
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            atll.a.j("Successfully cleared user data", new Object[0]);
            this.a.c(this.b, gifh.n, true);
            return;
        }
        atll.a.j("Failed to clear user data", new Object[0]);
        this.a.d(this.b, gifh.i, Boolean.valueOf(true), "clear app data failed: impulse returns false");
    }
}

