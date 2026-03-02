public final class ksu implements Runnable {
    public final kta a;
    public final kle b;

    public ksu(kta kta0, kle kle0) {
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
        kle kle0 = this.b;
        if(kle0 == null) {
            kle0 = new kli("No provider data returned");
        }
        kjk0.a(kle0);
    }
}

