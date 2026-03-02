public final class fmsr implements gfsi {
    public final fmus a;

    public fmsr(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        this.a.j.c = ((Boolean)object0).booleanValue();
        return null;
    }
}

