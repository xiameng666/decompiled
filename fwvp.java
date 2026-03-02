import com.google.android.location.os.real.RealWakeUpTiltDetector.MySensorEventListener;
import j..util.Objects;

public final class fwvp implements Runnable {
    final RealWakeUpTiltDetector.MySensorEventListener a;

    public fwvp(RealWakeUpTiltDetector.MySensorEventListener realWakeUpTiltDetector$MySensorEventListener0) {
        Objects.requireNonNull(realWakeUpTiltDetector$MySensorEventListener0);
        this.a = realWakeUpTiltDetector$MySensorEventListener0;
        super();
    }

    @Override
    public final void run() {
        fwzw fwzw0 = this.a.a.d;
        if(fwzw0 != null) {
            fwzw0.q();
        }
    }
}

