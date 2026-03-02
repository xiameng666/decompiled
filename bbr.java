import java.util.concurrent.Executor;

final class bbr extends bbk {
    final Executor n;
    public final Object o;
    bcn p;
    public bbq q;

    public bbr(Executor executor0) {
        this.o = new Object();
        this.n = executor0;
    }

    @Override  // bbk
    public final bcn b(bkq bkq0) {
        return bkq0.f();
    }

    @Override  // bbk
    public final void d() {
        synchronized(this.o) {
            bcn bcn0 = this.p;
            if(bcn0 != null) {
                bcn0.close();
                this.p = null;
            }
        }
    }

    @Override  // bbk
    public final void e(bcn bcn0) {
        synchronized(this.o) {
            if(!this.m) {
                bcn0.close();
                return;
            }
            if(this.q != null) {
                if(bcn0.e().c() <= this.q.e().c()) {
                    bcn0.close();
                }
                else {
                    bcn bcn1 = this.p;
                    if(bcn1 != null) {
                        bcn1.close();
                    }
                    this.p = bcn0;
                }
                return;
            }
            bbq bbq0 = new bbq(bcn0, this);
            this.q = bbq0;
            bpt.j(this.c(bbq0), new bbn(bbq0), bol.a());
        }
    }
}

