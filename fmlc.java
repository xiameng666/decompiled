final class fmlc extends fmlh {
    private final fmlr a;

    public fmlc(fmlr fmlr0) {
        this.a = fmlr0;
    }

    @Override  // fmml
    public final fmmn a() {
        return fmmn.g;
    }

    @Override  // fmlh
    public final fmlr d() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmml)) {
            fmmn fmmn0 = ((fmml)object0).a();
            if(fmmn.g == fmmn0) {
                fmlr fmlr0 = ((fmml)object0).d();
                return this.a.equals(fmlr0);
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
        return "Element{imageElement=" + this.a.toString() + "}";
    }
}

