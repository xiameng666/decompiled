public final class hvy extends hvn {
    private final String c;

    public hvy(hwa hwa0) {
        super(hwa0, null);
        this.c = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override  // ijm
    public final Object dK() {
        return this.c;
    }

    @Override  // hvn
    public final void e(hwa hwa0) {
        ikx ikx0 = this.h();
        if(ikx0 != null) {
            if(hwa0 == null) {
                hwa0 = hvz.a;
            }
            ikx0.a = hwa0;
            imb.a.a(ikx0.c, ikx0.a);
        }
    }

    @Override  // hvn
    public final boolean g(int v) {
        return v != 3 && v != 4;
    }
}

