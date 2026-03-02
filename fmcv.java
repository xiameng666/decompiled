final class fmcv extends fmcx {
    private final fmfw a;

    public fmcv(fmfw fmfw0) {
        this.a = fmfw0;
    }

    @Override  // fmfx
    public final fmfz a() {
        return fmfz.c;
    }

    @Override  // fmcx
    public final fmfw b() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmfx)) {
            fmfz fmfz0 = ((fmfx)object0).a();
            if(fmfz.c == fmfz0) {
                fmfw fmfw0 = ((fmfx)object0).b();
                return this.a.equals(fmfw0);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "RenderingDetails{overlay=" + this.a.toString() + "}";
    }
}

