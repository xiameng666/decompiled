final class hmkm {
    private final hmlg a;

    public hmkm(hmlg hmlg0) {
        this.a = hmlg0;
    }

    public final void a(hmli hmli0, String s, boolean z, boolean z1) {
        if(hmli0 == null) {
            hmli0 = this.a.f.a().a();
        }
        hmkd hmkd0 = new hmkd(hmli0, z1);
        if(z) {
            this.a.c.b(s, hmkd0);
            return;
        }
        this.a.f.a.put(s, hmkd0);
    }
}

