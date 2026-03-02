public final class bplp implements gfsi {
    public final fqxd a;

    public bplp(fqxd fqxd0) {
        this.a = fqxd0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        return Boolean.valueOf(this.a.b());
    }
}

