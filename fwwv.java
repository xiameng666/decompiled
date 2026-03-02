import j..util.Objects;

final class fwwv implements Runnable {
    final fwww a;

    public fwwv(fwww fwww0) {
        Objects.requireNonNull(fwww0);
        this.a = fwww0;
        super();
    }

    @Override
    public final void run() {
        fwwy fwwy0 = this.a.a;
        synchronized(fwwy0) {
            if(fwwy0.b != null) {
                fwwy0.l(3);
                fwwy0.b = null;
            }
        }
    }
}

