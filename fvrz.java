import j..util.Objects;

public final class fvrz implements Runnable {
    final fvsa a;

    public fvrz(fvsa fvsa0) {
        Objects.requireNonNull(fvsa0);
        this.a = fvsa0;
        super();
    }

    @Override
    public final void run() {
        fyba.c(this.a.e);
    }
}

