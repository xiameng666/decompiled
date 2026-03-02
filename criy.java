public final class criy implements Runnable {
    public final crja a;
    public final Throwable b;

    public criy(crja crja0, Throwable throwable0) {
        this.a = crja0;
        this.b = throwable0;
    }

    @Override
    public final void run() {
        this.a.b.a(this.a.a, 0, this.b, null, null);
    }
}

