public final class kqs implements Runnable {
    public final krd a;
    public final Throwable b;

    public kqs(krd krd0, Throwable throwable0) {
        this.a = krd0;
        this.b = throwable0;
    }

    @Override
    public final void run() {
        kjk kjk0 = this.a.f;
        if(kjk0 == null) {
            ibuq.j("callback");
            kjk0 = null;
        }
        kjk0.a(new kmf(new kme(), this.b.getMessage()));
    }
}

