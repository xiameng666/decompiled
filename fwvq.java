import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.google.android.location.os.real.RealWakeUpTiltDetector.MySensorEventListener;

public final class fwvq {
    public final boolean a;
    public final fwzp b;
    public final fvwz c;
    public fwzw d;
    private final SensorManager e;
    private final Sensor f;
    private RealWakeUpTiltDetector.MySensorEventListener g;

    public fwvq(SensorManager sensorManager0, fwzp fwzp0, fvwz fvwz0) {
        this.e = sensorManager0;
        Sensor sensor0 = sensorManager0.getDefaultSensor(22);
        this.f = sensor0;
        this.b = fwzp0;
        this.c = fvwz0;
        this.a = humr.a.f().D() && sensor0 != null;
    }

    public final void a() {
        if(this.d == null) {
            return;
        }
        this.d = null;
        this.e.unregisterListener(this.g);
    }

    public final void b(fwzw fwzw0) {
        if(!this.a) {
            throw new UnsupportedOperationException("Tilt detector is not supported on this device");
        }
        fwzw fwzw1 = this.d;
        if(fwzw1 != null) {
            if(fwzw1 == fwzw0) {
                return;
            }
            throw new UnsupportedOperationException("Tilt detector already enabled");
        }
        this.d = fwzw0;
        RealWakeUpTiltDetector.MySensorEventListener realWakeUpTiltDetector$MySensorEventListener0 = new RealWakeUpTiltDetector.MySensorEventListener(this, SystemClock.elapsedRealtime());
        this.g = realWakeUpTiltDetector$MySensorEventListener0;
        this.e.registerListener(realWakeUpTiltDetector$MySensorEventListener0, this.f, 0);
    }
}

