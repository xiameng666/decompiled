final class fmks extends fmkt {
    private final fmmd b;

    public fmks(fmmd fmmd0) {
        this.b = fmmd0;
    }

    @Override  // fmlz
    public final fmly b() {
        return fmly.b;
    }

    @Override  // fmkt
    public final fmmd d() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmlz)) {
            fmly fmly0 = ((fmlz)object0).b();
            if(fmly.b == fmly0) {
                fmmd fmmd0 = ((fmlz)object0).d();
                return this.b.equals(fmmd0);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "RichCard{standaloneCard=" + this.b.toString() + "}";
    }
}

