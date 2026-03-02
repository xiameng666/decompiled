import j..util.Objects;

final class fvks implements Runnable {
    final fvkt a;

    public fvks(fvkt fvkt0) {
        Objects.requireNonNull(fvkt0);
        this.a = fvkt0;
        super();
    }

    @Override
    public final void run() {
        this.a.b.j();
    }
}

