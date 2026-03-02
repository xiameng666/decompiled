public final class brn implements Runnable {
    public final bsb a;

    public brn(bsb bsb0) {
        this.a = bsb0;
    }

    @Override
    public final void run() {
        this.a.h = true;
        this.a.a();
    }
}

