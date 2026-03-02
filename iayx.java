import j..util.Objects;

final class iayx implements Runnable {
    final iazk a;

    public iayx(iazk iazk0) {
        Objects.requireNonNull(iazk0);
        this.a = iazk0;
        super();
    }

    @Override
    public final void run() {
        this.a.d.a(2, "Terminated");
        this.a.a.b.j.x.remove(this.a);
        iamg.b(this.a.a.b.j.J.d, this.a);
        this.a.a.b.j.q();
    }
}

