public final class bnvb implements gfsi {
    public final bnvd a;
    public final fqzu b;

    public bnvb(bnvd bnvd0, fqzu fqzu0) {
        this.a = bnvd0;
        this.b = fqzu0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return new bnvd(this.a.a, this.a.b, this.a.c, this.a.d, this.b, ((bnva)object0), this.a.g);
    }
}

