import j..util.Objects;

final class iaxl implements Runnable {
    final boolean a;
    final iaxm b;

    public iaxl(iaxm iaxm0, boolean z) {
        this.a = z;
        Objects.requireNonNull(iaxm0);
        this.b = iaxm0;
        super();
    }

    @Override
    public final void run() {
        if(this.a) {
            iaxp iaxp0 = this.b.b;
            iaxp0.o = true;
            if(iaxp0.k > 0L) {
                iaxp0.n.e();
                iaxp0.n.f();
            }
        }
        this.b.b.p = false;
    }
}

