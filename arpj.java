public final class arpj implements arli {
    public final arpn a;

    public arpj(arpn arpn0) {
        this.a = arpn0;
    }

    @Override  // arli
    public final void a(int v) {
        arou arou0 = new arou(this.a);
        this.a.b.execute(arou0);
    }
}

