import j..util.Objects;

final class fbzo implements Runnable {
    final fbzp a;

    public fbzo(fbzp fbzp0) {
        Objects.requireNonNull(fbzp0);
        this.a = fbzp0;
        super();
    }

    @Override
    public final void run() {
        this.a.lm(this.a.bB);
        this.a.bB = null;
    }
}

