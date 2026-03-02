public final class jsd extends jsc {
    public int m;

    public jsd(jsn jsn0) {
        super(jsn0);
        this.l = (jsn0 instanceof jsi) ? 2 : 3;
    }

    @Override  // jsc
    public final void c(int v) {
        if(!this.i) {
            this.i = true;
            this.f = v;
            for(Object object0: this.j) {
                ((jsa)object0).f();
            }
        }
    }
}

