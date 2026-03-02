import j..util.Objects;

final class fbyo implements Runnable {
    final hchn a;
    final fbyr b;

    public fbyo(fbyr fbyr0, hchn hchn0) {
        this.a = hchn0;
        Objects.requireNonNull(fbyr0);
        this.b = fbyr0;
        super();
    }

    @Override
    public final void run() {
        this.b.cC(2);
        this.b.bx().b.B(this.a);
    }
}

