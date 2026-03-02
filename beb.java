public final class beb implements Runnable {
    public final bel a;

    public beb(bel bel0) {
        this.a = bel0;
    }

    @Override
    public final void run() {
        this.a.f.cancel(true);
    }
}

