final class fmld extends fmlh {
    private final fmlt a;

    public fmld(fmlt fmlt0) {
        this.a = fmlt0;
    }

    @Override  // fmml
    public final fmmn a() {
        return fmmn.i;
    }

    @Override  // fmlh
    public final fmlt e() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmml)) {
            fmmn fmmn0 = ((fmml)object0).a();
            if(fmmn.i == fmmn0) {
                fmlt fmlt0 = ((fmml)object0).e();
                return this.a.equals(fmlt0);
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
        return "Element{mediaElement=" + this.a.toString() + "}";
    }
}

