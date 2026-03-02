public final class ktf implements Runnable {
    public final kty a;
    public final kiu b;

    public ktf(kty kty0, kiu kiu0) {
        this.a = kty0;
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

