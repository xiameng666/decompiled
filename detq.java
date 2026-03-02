public final class detq implements ibth {
    public final gra a;

    public detq(gra gra0) {
        this.a = gra0;
    }

    @Override  // ibth
    public final Object a() {
        int v = devo.l(this.a) ^ 1;
        devo.h(this.a, ((boolean)v));
        return ibom.a;
    }
}

