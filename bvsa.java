public final class bvsa implements gfsi {
    public final String a;

    public bvsa(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((bvsc)object0).a) {
            return bvsc.c();
        }
        ggdy ggdy0 = new ggdy();
        ggdy0.k(((bvsc)object0).b);
        return bvsc.b(this.a, ggdy0);
    }
}

