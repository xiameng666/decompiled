import j..util.Objects;

final class akuu implements Runnable {
    final akvp a;
    final akvf b;

    public akuu(akvf akvf0, akvp akvp0) {
        this.a = akvp0;
        Objects.requireNonNull(akvf0);
        this.b = akvf0;
        super();
    }

    @Override
    public final void run() {
        this.a.d(this.b.o);
        this.b.e.add(this.a);
        this.b.e();
    }
}

