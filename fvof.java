import android.hardware.Sensor;
import com.google.android.location.collectionlib.SensorScanner.SensorEventListenerAdapter;

public final class fvof implements Runnable {
    public final SensorScanner.SensorEventListenerAdapter a;
    public final Sensor b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;
    public final float g;

    public fvof(SensorScanner.SensorEventListenerAdapter sensorScanner$SensorEventListenerAdapter0, Sensor sensor0, long v, long v1, float f, float f1, float f2) {
        this.a = sensorScanner$SensorEventListenerAdapter0;
        this.b = sensor0;
        this.c = v;
        this.d = v1;
        this.e = f;
        this.f = f1;
        this.g = f2;
    }

    @Override
    public final void run() {
        int v = this.b.getType();
        this.a.d(v, this.c, this.d / 1000000L, 0, this.e, this.f, this.g, null);
    }
}

