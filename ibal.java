import j..util.Objects;

final class ibal implements Runnable {
    final ibbd a;

    public ibal(ibbd ibbd0) {
        Objects.requireNonNull(ibbd0);
        this.a = ibbd0;
        super();
    }

    @Override
    public final void run() {
        ibbd ibbd0 = this.a;
        if(ibbd0.v == null) {
            return;
        }
        ibbd0.n();
    }
}

