import android.os.SystemClock;

public final class fvbm implements Runnable {
    public final fvbn a;

    public fvbm(fvbn fvbn0) {
        this.a = fvbn0;
    }

    @Override
    public final void run() {
        fvbo fvbo0 = this.a.a;
        if(fvbo0.t) {
            fvbo0.u = SystemClock.elapsedRealtimeNanos();
        }
        fvbo0.t = false;
    }
}

