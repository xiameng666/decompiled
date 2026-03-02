public final class hxa extends hvn {
    private final String c;

    public hxa(hwa hwa0, iev iev0) {
        super(hwa0, iev0);
        this.c = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override  // ijm
    public final Object dK() {
        return this.c;
    }

    @Override  // hvn
    public final void e(hwa hwa0) {
        ikx ikx0 = this.h();
        if(ikx0 != null) {
            ikx0.b = hwa0;
        }
    }

    @Override  // hvn
    public final boolean g(int v) {
        return v == 3 || v == 4;
    }
}

