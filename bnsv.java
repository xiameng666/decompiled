public final class bnsv implements gfsi {
    public final bnsw a;

    public bnsv(bnsw bnsw0) {
        this.a = bnsw0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gsyz gsyz0 = ((bnql)object0).a.c;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        this.a.c.d(gsyz0);
        return ((bnql)object0).c;
    }
}

