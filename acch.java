import j..util.Objects;

final class acch implements Runnable {
    final accn a;

    public acch(accn accn0) {
        Objects.requireNonNull(accn0);
        this.a = accn0;
        super();
    }

    @Override
    public final void run() {
        this.a.au.S(this.a.az);
    }
}

