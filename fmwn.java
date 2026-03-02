final class fmwn extends fmwr {
    private final fmwd a;

    public fmwn(fmwd fmwd0) {
        this.a = fmwd0;
    }

    @Override  // fmxe
    public final fmxd b() {
        return fmxd.c;
    }

    @Override  // fmwr
    public final fmwd c() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmxe)) {
            fmxd fmxd0 = ((fmxe)object0).b();
            if(fmxd.c == fmxd0) {
                fmwd fmwd0 = ((fmxe)object0).c();
                return this.a.equals(fmwd0);
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
        return "MessageListCellViewModel{richCardBubble=" + this.a.toString() + "}";
    }
}

