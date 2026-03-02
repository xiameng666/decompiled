public final class bmaa {
    public bmbv a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public Integer e;
    public String f;
    private int g;
    private bmab h;

    public final bmac a() {
        boolean z = true;
        batl.l(this.g > 0);
        if(this.h == null) {
            z = false;
        }
        batl.l(z);
        return new bmac(this.g, this.h, this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(int v) {
        batl.b(bmac.i.contains(Integer.valueOf(v)));
        this.g = v;
    }

    public final void c(bmab bmab0) {
        batl.b(bmab0 != null);
        this.h = bmab0;
    }
}

