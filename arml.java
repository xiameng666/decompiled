public final class arml implements Runnable {
    public final armp a;
    public final Runnable b;

    public arml(armp armp0, Runnable runnable0) {
        this.a = armp0;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        this.a.b.execute(this.b);
    }
}

