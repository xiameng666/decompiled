import j..util.Objects;

final class ghan extends ghar {
    final ghas a;
    private static final long serialVersionUID = 1L;

    public ghan(ghas ghas0, ghas ghas1) {
        Objects.requireNonNull(ghas0);
        this.a = ghas0;
        super(ghas1);
    }

    @Override  // ghbx
    public final int c(int v) {
        gftb.x(v, this.d());
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((ghab)this.a.d.get(v1)).d;
        }
        return v2;
    }

    @Override  // ghbx
    public final void p(int v, ghbw ghbw0) {
        ghas ghas0 = this.a;
        ghab ghab0 = ghas0.b(0);
        int v1 = 1;
        while(true) {
            int v2 = ghab0.d;
            if(v < v2) {
                break;
            }
            v -= v2;
            ghab ghab1 = ghas0.b(v1);
            ++v1;
            ghab0 = ghab1;
        }
        ghbw0.a(ghab0.j(v), ghab0.j(v + 1));
    }
}

