public final class fmsp implements gfsi {
    public final fmus a;

    public fmsp(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fmus fmus0 = this.a;
        fmus0.O = ((Boolean)object0).booleanValue();
        if(!((Boolean)object0).booleanValue()) {
            fmus0.an.e(fmxd.b);
        }
        return null;
    }
}

