public final class bpff implements gfsi {
    public final bpii a;

    public bpff(bpii bpii0) {
        this.a = bpii0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        return gfsx.m(this.a);
    }
}

