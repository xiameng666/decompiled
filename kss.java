public final class kss implements Runnable {
    public final kta a;
    public final kle b;

    public kss(kta kta0, kle kle0) {
        this.a = kta0;
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

