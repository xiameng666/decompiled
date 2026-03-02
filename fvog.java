import android.hardware.Sensor;
import com.google.android.location.collectionlib.SensorScanner.SensorEventListenerAdapter;

public final class fvog implements Runnable {
    public final SensorScanner.SensorEventListenerAdapter a;
    public final Sensor b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;

    public fvog(SensorScanner.SensorEventListenerAdapter sensorScanner$SensorEventListenerAdapter0, Sensor sensor0, long v, long v1, float f, float f1, float f2, float f3, float f4, float f5) {
        this.a = sensorScanner$SensorEventListenerAdapter0;
        this.b = sensor0;
        this.c = v;
        this.d = v1;
        this.e = f;
        this.f = f1;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
    }

    @Override
    public final void run() {
        int v = this.b.getType();
        this.a.e(v, this.c, this.d / 1000000L, 0, this.e, this.f, this.g, this.h, this.i, this.j, null);
    }
}

