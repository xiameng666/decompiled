public final class fmty implements gfsi {
    public final fmus a;

    public fmty(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        this.a.j.a = ((Boolean)object0).booleanValue();
        this.a.an.h.J();
        return null;
    }
}

