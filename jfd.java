public final class jfd implements jdy {
    public final int a;
    public final jes b;
    public final int c;
    private final jeu d;
    private final int e;

    public jfd(int v, jeu jeu0, jes jes0) {
        this.a = v;
        this.d = jeu0;
        this.e = 0;
        this.b = jes0;
        this.c = 0;
    }

    @Override  // jdy
    public final int a() {
        return 0;
    }

    @Override  // jdy
    public final int b() {
        return 0;
    }

    @Override  // jdy
    public final jeu c() {
        return this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jfd) ? this.a == ((jfd)object0).a && ibuq.m(this.d, ((jfd)object0).d) && ibuq.m(this.b, ((jfd)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a * 0x1F + this.d.l) * 0x745F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.d + ", style=" + jem.a(0) + ", loadingStrategy=" + jel.b() + ')';
    }
}

