final class fmkq extends fmkt {
    private final fmlj b;

    public fmkq(fmlj fmlj0) {
        this.b = fmlj0;
    }

    @Override  // fmkt
    public final fmlj a() {
        return this.b;
    }

    @Override  // fmlz
    public final fmly b() {
        return fmly.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmlz)) {
            fmly fmly0 = ((fmlz)object0).b();
            if(fmly.c == fmly0) {
                fmlj fmlj0 = ((fmlz)object0).a();
                return this.b.equals(fmlj0);
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
        return "RichCard{cardCarousel=" + this.b.toString() + "}";
    }
}

