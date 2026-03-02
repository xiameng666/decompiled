import j..util.Objects;

final class accg implements Runnable {
    final accn a;

    public accg(accn accn0) {
        Objects.requireNonNull(accn0);
        this.a = accn0;
        super();
    }

    @Override
    public final void run() {
        acel acel0 = this.a.at;
        if(acel0.c != null && acel0.d.isShown()) {
            acel0.d.fullScroll(130);
            acel0.c.H();
            return;
        }
        acel0.b.H();
    }
}

