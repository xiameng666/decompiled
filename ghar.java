import java.io.Serializable;
import java.util.List;

public abstract class ghar implements ghbx, Serializable {
    public final ghas c;
    private static final long serialVersionUID = 1L;

    static {
        ghaq ghaq0 = new ghaq();
        new ggyw(ghas.b, ghas.b, ghaq0);
        ghaq ghaq1 = new ghaq();
        new ggyw(ghas.c, ghas.c, ghaq1);
    }

    public ghar(ghas ghas0) {
        this.c = ghas0;
    }

    @Override  // ghbx
    public final void A() {
    }

    @Override  // ghbx
    public final void B() {
    }

    @Override  // ghbx
    public final int b(int v) {
        gftb.x(v, this.d());
        int v1 = ((ghab)this.c.d.get(v)).d;
        return v1 == 1 ? 0 : v1;
    }

    @Override  // ghbx
    public final int d() {
        return this.c.a();
    }

    @Override  // ghbx
    public final int e() {
        return this.c.d.size() != 1 || !ghas.i(((ghab)this.c.d.get(0))) ? this.c.f : 0;
    }

    @Override  // ghbx
    public final int g(int v) {
        return ghbt.a(this, v);
    }

    @Override  // ghbx
    public final ghae i(int v, int v1) {
        gftb.x(v1, this.b(v) + 1);
        return this.c.b(v).j(v1);
    }

    @Override  // ghbx
    public final List l(int v) {
        return new ghbu(this, v);
    }

    @Override  // ghbx
    public final void n(int v, int v1, ghbw ghbw0) {
        gftb.x(v1, this.b(v));
        ghab ghab0 = this.c.b(v);
        ghbw0.a(ghab0.j(v1), ghab0.j(v1 + 1));
    }

    @Override  // ghbx
    public final void o(int v, ghbv ghbv0) {
        int v1 = 0;
        gftb.checkTrue(v < this.e());
        while(true) {
            ghas ghas0 = this.c;
            if(v < ghas0.b(v1).d) {
                break;
            }
            v -= ghas0.b(v1).d;
            ++v1;
        }
        ghbv0.a(v1, v);
    }

    @Override  // ghbx
    public final boolean u() {
        int v = 0;
        for(Object object0: this.c.d) {
            v ^= ((ghab)object0).g;
        }
        return v != 0;
    }
}

