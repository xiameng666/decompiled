public final class bnkl implements gfsi {
    public final bnla a;

    public bnkl(bnla bnla0) {
        this.a = bnla0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gted gted0 = ((gszl)object0).b;
        if(gted0 == null) {
            gted0 = gted.a;
        }
        this.a.d.a(this.a.b, gted0);
        Object object1 = ((gszl)object0).b;
        return object1 == null ? gted.a : object1;
    }
}

