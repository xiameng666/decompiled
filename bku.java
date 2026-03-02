public final class bku implements Runnable {
    public final bkz a;
    public final bkx b;

    public bku(bkz bkz0, bkx bkx0) {
        this.a = bkz0;
        this.b = bkx0;
    }

    @Override
    public final void run() {
        this.a.a.j(this.b);
    }
}

