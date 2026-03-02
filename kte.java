public final class kte implements Runnable {
    public final kty a;
    public final kle b;

    public kte(kty kty0, kle kle0) {
        this.a = kty0;
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

