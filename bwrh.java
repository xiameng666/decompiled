import j..util.Objects;

final class bwrh implements bwro {
    private final ggdy a;
    private int b;
    private int c;
    private final goqq d;

    public bwrh(bwrj bwrj0) {
        this.a = new ggdy();
        this.b = 0;
        this.c = 0;
        batl.l(goqq.h(bwrj0));
        this.d = bwrj0.b;
        this.c(bwrj0);
    }

    @Override  // bwro
    public final bwrp a() {
        Objects.requireNonNull(this.d);
        gged_interceptors gged0 = this.a.h();
        return new bwri(this.d, gged0);
    }

    @Override  // bwro
    public final boolean b(bwrp bwrp0) {
        if(goqq.h(((bwrj)bwrp0))) {
            huar huar0 = huar.a;
            if(((long)this.b) < huar0.d().e() && ((bwrj)bwrp0).b == this.d) {
                int v = ((bwrj)bwrp0).a.a();
                if(((long)(this.c + v)) <= huar0.d().d()) {
                    this.c(((bwrj)bwrp0));
                    return true;
                }
            }
        }
        return false;
    }

    private final void c(bwrj bwrj0) {
        this.a.i(bwrj0);
        ++this.b;
        this.c += bwrj0.a.a();
    }
}

