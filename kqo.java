public final class kqo implements Runnable {
    public final krd a;
    public final kle b;

    public kqo(krd krd0, kle kle0) {
        this.a = krd0;
        this.b = kle0;
    }

    @Override
    public final void run() {
        kjk kjk0 = this.a.f;
        if(kjk0 == null) {
            ibuq.j("callback");
            kjk0 = null;
        }
        kjk0.a(this.b);
    }
}

