public final class kpw implements Runnable {
    public final kqe a;
    public final kiu b;

    public kpw(kqe kqe0, kiu kiu0) {
        this.a = kqe0;
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

