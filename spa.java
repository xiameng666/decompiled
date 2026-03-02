import j..util.Objects;

final class spa implements Runnable {
    final spb a;

    public spa(spb spb0) {
        Objects.requireNonNull(spb0);
        this.a = spb0;
        super();
    }

    @Override
    public final void run() {
        this.a.a.d();
    }
}

