import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j..util.Objects;

final class fdzu extends clht {
    final fdzv a;

    public fdzu(fdzv fdzv0, Looper looper0) {
        Objects.requireNonNull(fdzv0);
        this.a = fdzv0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        ffmn.a("Wear_Transport", "Checking if write is stuck.", new Object[0]);
        fdzr fdzr0 = (fdzr)message0.obj;
        if(fdzr0.g()) {
            fdob.k(6);
            fdob.g(6, this.a.c, fdzr0.b.h());
            this.a.l.a(0L, 1L, ayvf.b);
            Log.w("Wear_Transport", "Write is stuck. Killing thread: " + fdzr0.a.getId());
            fdzr0.f("stuck while writing");
            fdzr0.a.interrupt();
            return;
        }
        ffmn.a("Wear_Transport", "Write is not stuck. No action needed.", new Object[0]);
    }
}

