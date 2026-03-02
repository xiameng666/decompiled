public final class bwgf implements gfsi {
    public final bwgl a;

    public bwgf(bwgl bwgl0) {
        this.a = bwgl0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        bwgl bwgl0 = (bwgl)object0;
        return this.a;
    }
}

