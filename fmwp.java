final class fmwp extends fmwr {
    private final fmwd a;

    public fmwp(fmwd fmwd0) {
        this.a = fmwd0;
    }

    @Override  // fmxe
    public final fmxd b() {
        return fmxd.d;
    }

    @Override  // fmwr
    public final fmwd e() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmxe)) {
            fmxd fmxd0 = ((fmxe)object0).b();
            if(fmxd.d == fmxd0) {
                fmwd fmwd0 = ((fmxe)object0).e();
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
        return "MessageListCellViewModel{tombstoneBubble=" + this.a.toString() + "}";
    }
}

