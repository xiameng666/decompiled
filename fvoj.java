import android.hardware.Sensor;
import com.google.android.location.collectionlib.SensorScanner.SensorEventListenerAdapter;

public final class fvoj implements Runnable {
    public final SensorScanner.SensorEventListenerAdapter a;
    public final Sensor b;
    public final long c;
    public final long d;
    public final float e;

    public fvoj(SensorScanner.SensorEventListenerAdapter sensorScanner$SensorEventListenerAdapter0, Sensor sensor0, long v, long v1, float f) {
        this.a = sensorScanner$SensorEventListenerAdapter0;
        this.b = sensor0;
        this.c = v;
        this.d = v1;
        this.e = f;
    }

    @Override
    public final void run() {
        int v = this.b.getType();
        this.a.c(v, this.c, this.d / 1000000L, 0, this.e, null);
    }
}

