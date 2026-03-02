public final class fmtr implements gfsi {
    public final fmus a;

    public fmtr(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        this.a.N = ((Boolean)object0).booleanValue();
        return null;
    }
}

