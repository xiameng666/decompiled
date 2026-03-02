import j..util.Objects;

final class ibab implements Runnable {
    final ibbd a;

    public ibab(ibbd ibbd0) {
        Objects.requireNonNull(ibbd0);
        this.a = ibbd0;
        super();
    }

    @Override
    public final void run() {
        ibbd ibbd0 = this.a;
        if(ibbd0.D) {
            return;
        }
        ibbd0.D = true;
        ibbd0.p();
    }
}

