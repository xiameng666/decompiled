public final class atw implements jqv {
    public final aud a;
    public final boolean b;

    public atw(aud aud0, boolean z) {
        this.a = aud0;
        this.b = z;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        atx atx0 = new atx(this.a, this.b, jqt0);
        this.a.c.execute(atx0);
        return "enableExternalFlashAeMode";
    }
}

