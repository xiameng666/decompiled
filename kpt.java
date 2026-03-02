public final class kpt implements Runnable {
    public final kqe a;

    public kpt(kqe kqe0) {
        this.a = kqe0;
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

