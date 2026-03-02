import j..util.Objects;

final class crny implements Runnable {
    final crnz a;

    public crny(crnz crnz0) {
        Objects.requireNonNull(crnz0);
        this.a = crnz0;
        super();
    }

    @Override
    public final void run() {
        this.a.h = null;
    }
}

