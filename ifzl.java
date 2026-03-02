import android.os.Trace;

public final class ifzl implements Runnable {
    public final String a;
    public final Runnable b;

    public ifzl(String s, Runnable runnable0) {
        this.a = s;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        new ifvp("Cronet JavaUrlRequest#executeOnExecutor " + this.a + " running callback");
        try {
            this.b.run();
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
        Trace.endSection();
    }
}

