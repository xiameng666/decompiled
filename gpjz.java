public final class gpjz implements ibnf {
    public final gpkc a;

    public gpjz(gpkc gpkc0) {
        this.a = gpkc0;
    }

    @Override  // ibnf
    public final Object get() {
        ggdy ggdy0 = new ggdy();
        for(Object object0: this.a.b) {
            ggdy0.i(((gpha)object0).a());
        }
        return ggdy0.h();
    }
}

