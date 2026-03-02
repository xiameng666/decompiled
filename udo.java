import j..util.Objects;

final class udo implements Runnable {
    final udr a;
    private final uoz b;

    public udo(udr udr0, uoz uoz0) {
        Objects.requireNonNull(udr0);
        this.a = udr0;
        super();
        this.b = uoz0;
    }

    @Override
    public final void run() {
        uoz uoz0 = this.b;
        synchronized(uoz0.a()) {
            udr udr0 = this.a;
            synchronized(udr0) {
                if(udr0.a.d(uoz0)) {
                    udr0.k.d();
                    try {
                        uoz0.g(udr0.k, udr0.g);
                    }
                    catch(Throwable throwable0) {
                        throw new uco(throwable0);
                    }
                    this.a.h(this.b);
                }
                this.a.c();
            }
        }
    }
}

