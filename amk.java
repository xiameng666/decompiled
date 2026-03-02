import android.util.Log;

final class amk implements Runnable {
    final amo a;

    public amk(amo amo0) {
        this.a = amo0;
        super();
    }

    @Override
    public final void run() {
        amo amo0 = this.a;
        if(amo0.getContext() == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        amo0.ai.r();
        amo0.ai.m("Touch the fingerprint sensor");
    }
}

