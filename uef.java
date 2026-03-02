import android.os.Handler;
import android.os.Looper;

public final class uef {
    private boolean a;
    private final Handler b;

    public uef() {
        this.b = new Handler(Looper.getMainLooper(), new uee());
    }

    public final void a(ueb ueb0, boolean z) {
        synchronized(this) {
            if(!this.a && !z) {
                this.a = true;
                ueb0.e();
                this.a = false;
                return;
            }
            this.b.obtainMessage(1, ueb0).sendToTarget();
        }
    }
}

