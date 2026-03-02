final class fmlb extends fmlh {
    private final fmlp a;

    public fmlb(fmlp fmlp0) {
        this.a = fmlp0;
    }

    @Override  // fmml
    public final fmmn a() {
        return fmmn.e;
    }

    @Override  // fmlh
    public final fmlp c() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmml)) {
            fmmn fmmn0 = ((fmml)object0).a();
            if(fmmn.e == fmmn0) {
                fmlp fmlp0 = ((fmml)object0).c();
                return this.a.equals(fmlp0);
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
        return "Element{horizontalLine=" + this.a.toString() + "}";
    }
}

