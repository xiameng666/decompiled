public final class ggzw extends ggzy {
    public ggzw() {
    }

    public ggzw(ggxl ggxl0, ggxt ggxt0) {
        super(ggxl0, ggxt0);
    }

    @Override  // ggzy
    public final ggxl a() {
        return new ggxl(this.a);
    }

    @Override  // ggzy
    public final ggxt b() {
        return new ggxt(this.b);
    }

    public static ggzw c() {
        return new ggzw(new ggxl(1.0, 0.0), ggxt.c());
    }

    public final ggzx d() {
        return new ggzx(new ggxl(this.a), new ggxt(this.b));
    }

    public final void e(ggzv ggzv0) {
        double f = ggzv0.e().c;
        ggxl ggxl0 = this.a;
        if(ggxl0.j()) {
            ggxl0.a = f;
            ggxl0.b = f;
        }
        else if((f < ggxl0.a)) {
            ggxl0.a = f;
        }
        else if((f > ggxl0.b)) {
            ggxl0.b = f;
        }
        ggxt ggxt0 = this.b;
        double f1 = ggzv0.g().c;
        if(f1 == -3.141593) {
            f1 = 3.141593;
        }
        ggxt ggxt1 = new ggxt(f1, f1);
        ggxt1.g(f1, f1, true);
        ggxt0.j(ggxt1);
    }

    public final void g(ggzx ggzx0) {
        this.a.g(ggzx0.a);
        this.b.j(ggzx0.b);
    }
}

