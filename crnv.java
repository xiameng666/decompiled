import j..util.Objects;

final class crnv implements Runnable {
    final crnz a;

    public crnv(crnz crnz0) {
        Objects.requireNonNull(crnz0);
        this.a = crnz0;
        super();
    }

    @Override
    public final void run() {
        this.a.c = this.a.h;
    }
}

