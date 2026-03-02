public final class cnn implements cnc {
    private final int a;
    private final int b;
    private final cie c;
    private final cnf d;

    public cnn() {
        this(300, 0, cih.a);
    }

    public cnn(int v, int v1, cie cie0) {
        this.a = v;
        this.b = v1;
        this.c = cie0;
        this.d = new cnf(new cio(v, v1, cie0));
    }

    @Override  // cmx
    public final long a(cht cht0, cht cht1, cht cht2) {
        return cnb.a(this);
    }

    @Override  // cmx
    public final cht b(cht cht0, cht cht1, cht cht2) {
        return cmw.a(this, cht0, cht1, cht2);
    }

    @Override  // cmx
    public final cht c(long v, cht cht0, cht cht1, cht cht2) {
        return this.d.c(v, cht0, cht1, cht2);
    }

    @Override  // cmx
    public final cht d(long v, cht cht0, cht cht1, cht cht2) {
        return this.d.d(v, cht0, cht1, cht2);
    }

    @Override  // cmx
    public final boolean e() {
        return false;
    }

    @Override  // cnc
    public final int f() {
        return this.b;
    }

    @Override  // cnc
    public final int g() {
        return this.a;
    }
}

