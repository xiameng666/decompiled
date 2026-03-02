public final class ksx implements Runnable {
    public final kta a;
    public final kiu b;

    public ksx(kta kta0, kiu kiu0) {
        this.a = kta0;
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

