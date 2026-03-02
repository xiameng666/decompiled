import android.os.Trace;

public final class ikg implements Runnable {
    public final ibth a;

    public ikg(ibth ibth0) {
        this.a = ibth0;
    }

    @Override
    public final void run() {
        Trace.beginSection("AndroidOwner:outOfFrameExecutor");
        try {
            this.a.a();
        }
        finally {
            Trace.endSection();
        }
    }
}

