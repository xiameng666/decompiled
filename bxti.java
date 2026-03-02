public final class bxti implements jqv {
    public final bxtn a;
    public final gmcd b;
    public final bxsf c;

    public bxti(bxtn bxtn0, gmcd gmcd0, bxsf bxsf0) {
        this.a = bxtn0;
        this.b = gmcd0;
        this.c = bxsf0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        bxtl bxtl0 = new bxtl(this.a, jqt0, this.c);
        gmbu.t(this.b, bxtl0, this.a.b);
        return jqt0;
    }
}

