public final class kpr implements Runnable {
    public final kqe a;
    public final kle b;

    public kpr(kqe kqe0, kle kle0) {
        this.a = kqe0;
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

