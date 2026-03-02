public final class bpun implements gfsi {
    public final bpuo a;

    public bpun(bpuo bpuo0) {
        this.a = bpuo0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gsyz gsyz0 = ((bnql)object0).a.c;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        this.a.a.d(gsyz0);
        return ((bnql)object0).c;
    }
}

