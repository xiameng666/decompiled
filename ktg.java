public final class ktg implements Runnable {
    public final kty a;

    public ktg(kty kty0) {
        this.a = kty0;
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

