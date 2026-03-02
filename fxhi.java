import android.os.Vibrator.OnVibratorStateChangedListener;
import j..util.Objects;

final class fxhi implements Vibrator.OnVibratorStateChangedListener {
    final fxhj a;
    private long b;
    private long c;

    public fxhi(fxhj fxhj0) {
        Objects.requireNonNull(fxhj0);
        this.a = fxhj0;
        super();
        this.b = -1L;
        this.c = -1L;
    }

    public final long a() {
        long v;
        synchronized(this) {
            if(this.b == -1L) {
                return -1L;
            }
            v = this.c;
            if(v == -1L) {
                return System.currentTimeMillis();
            }
        }
        return v;
    }

    public final void onVibratorStateChanged(boolean z) {
        synchronized(this) {
            if(z) {
                this.b = System.currentTimeMillis();
                this.c = -1L;
                fxhj fxhj0 = this.a;
                if(!fxhj0.b) {
                    fxhj0.b = true;
                    fxhj0.i.a();
                    fxhj0.c(fxhj0.a);
                }
            }
            else if(this.b != -1L) {
                this.c = System.currentTimeMillis();
            }
        }
    }
}

