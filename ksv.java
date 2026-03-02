public final class ksv implements Runnable {
    public final kta a;

    public ksv(kta kta0) {
        this.a = kta0;
    }

    @Override
    public final void run() {
        kjk kjk0 = this.a.f;
        if(kjk0 == null) {
            ibuq.j("callback");
            kjk0 = null;
        }
        kjk0.a(new kli("No provider data returned."));
    }
}

