import j..util.Objects;

final class ejvo implements Runnable {
    final String a;
    final ejvq b;

    public ejvo(ejvq ejvq0, String s) {
        this.a = s;
        Objects.requireNonNull(ejvq0);
        this.b = ejvq0;
        super();
    }

    @Override
    public final void run() {
        this.b.e.remove(this.a);
    }
}

