public final class bpci implements gfsi {
    public final boolean a;

    public bpci(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        return Boolean.valueOf(this.a);
    }
}

