public final class ktn implements Runnable {
    public final kty a;

    public ktn(kty kty0) {
        this.a = kty0;
    }

    @Override
    public final void run() {
        kjk kjk0 = this.a.f;
        if(kjk0 == null) {
            ibuq.j("callback");
            kjk0 = null;
        }
        kjk0.a(new kli("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
    }
}

