public final class fmwo extends fmwr {
    private final fmhr a;

    public fmwo(fmhr fmhr0) {
        this.a = fmhr0;
    }

    @Override  // fmxe
    public final fmxd b() {
        return fmxd.b;
    }

    @Override  // fmwr
    public final fmhr d() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmxe)) {
            fmxd fmxd0 = ((fmxe)object0).b();
            if(fmxd.b == fmxd0) {
                fmhr fmhr0 = ((fmxe)object0).d();
                return this.a.equals(fmhr0);
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
        return "MessageListCellViewModel{suggestionList=" + this.a.toString() + "}";
    }
}

