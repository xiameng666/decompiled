import j..util.Objects;

final class udn implements Runnable {
    final udr a;
    private final uoz b;

    public udn(udr udr0, uoz uoz0) {
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
                    try {
                        uoz0.d(udr0.i);
                    }
                    catch(Throwable throwable0) {
                        throw new uco(throwable0);
                    }
                }
                this.a.c();
            }
        }
    }
}

