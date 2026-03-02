public final class kdu implements lpp {
    public final kdw a;
    public final kdz b;

    public kdu(kdw kdw0, kdz kdz0) {
        this.a = kdw0;
        this.b = kdz0;
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        if(lpe0 == lpe.ON_DESTROY) {
            this.a.e(this.b);
        }
    }
}

