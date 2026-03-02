public final class kqf implements Runnable {
    public final krd a;
    public final kiu b;

    public kqf(krd krd0, kiu kiu0) {
        this.a = krd0;
        this.b = kiu0;
    }

    @Override
    public final void run() {
        kjk kjk0 = this.a.f;
        if(kjk0 == null) {
            ibuq.j("callback");
            kjk0 = null;
        }
        kjk0.b(this.b);
    }
}

