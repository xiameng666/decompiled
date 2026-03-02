public final class ezkf implements gfsi {
    public final boolean a;

    public ezkf(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return Boolean.valueOf(((Boolean)object0).booleanValue() && this.a);
    }
}

