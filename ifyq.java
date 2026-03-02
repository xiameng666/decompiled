import android.os.Trace;

public final class ifyq implements Runnable {
    public final ifyw a;
    public final String b;
    public final igad c;

    public ifyq(ifyw ifyw0, String s, igad igad0) {
        this.a = ifyw0;
        this.b = s;
        this.c = igad0;
    }

    @Override
    public final void run() {
        new ifvp("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + this.b + " running callback");
        try {
            new ifze(this.a.k, this.c).run();
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

