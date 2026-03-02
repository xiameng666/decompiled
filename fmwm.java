final class fmwm extends fmwr {
    private final fmwd a;

    public fmwm(fmwd fmwd0) {
        this.a = fmwd0;
    }

    @Override  // fmwr
    public final fmwd a() {
        return this.a;
    }

    @Override  // fmxe
    public final fmxd b() {
        return fmxd.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmxe)) {
            fmxd fmxd0 = ((fmxe)object0).b();
            if(fmxd.a == fmxd0) {
                fmwd fmwd0 = ((fmxe)object0).a();
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
        return "MessageListCellViewModel{messageBubble=" + this.a.toString() + "}";
    }
}

