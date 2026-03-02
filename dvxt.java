public final class dvxt implements dskc {
    public final dvxv a;
    public final int b;

    public dvxt(dvxv dvxv0, int v) {
        this.a = dvxv0;
        this.b = v;
    }

    @Override  // dskc
    public final void a(guuv guuv0) {
        if(guuv0 != guuv.a && guuv0 != guuv.o) {
            this.a.a.add(Integer.valueOf(this.b));
            this.a.q(this.b);
        }
    }
}

