import java.io.Serializable;

final class ghfl implements Serializable {
    final long[] a;
    final int b;
    final ghfm c;
    final ghfu d;
    private static final long serialVersionUID = 1L;

    public ghfl(ghfn ghfn0) {
        this.a = ghfo.d(ghfn0.a.a);
        this.b = ghfn0.b;
        this.d = ghfn0.d;
        this.c = ghfn0.c;
    }

    Object readResolve() {
        return new ghfn(new ghfo(this.a), this.b, this.d, this.c);
    }
}

