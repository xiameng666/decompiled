import j..util.Objects;

final class txy implements Runnable {
    final tyb a;

    public txy(tyb tyb0) {
        Objects.requireNonNull(tyb0);
        this.a = tyb0;
        super();
    }

    @Override
    public final void run() {
        this.a.d.a(this.a);
    }
}

