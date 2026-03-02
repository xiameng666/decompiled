import android.hardware.Sensor;
import com.google.android.location.collectionlib.SensorScanner.SensorEventListenerAdapter;

public final class fvoi implements Runnable {
    public final SensorScanner.SensorEventListenerAdapter a;
    public final Sensor b;
    public final long[] c;
    public final long[] d;
    public final float[][] e;

    public fvoi(SensorScanner.SensorEventListenerAdapter sensorScanner$SensorEventListenerAdapter0, Sensor sensor0, long[] arr_v, long[] arr_v1, float[][] arr2_f) {
        this.a = sensorScanner$SensorEventListenerAdapter0;
        this.b = sensor0;
        this.c = arr_v;
        this.d = arr_v1;
        this.e = arr2_f;
    }

    @Override
    public final void run() {
        int v = this.b.getType();
        fvnw fvnw0 = this.a.a;
        if(!fvnw0.k()) {
            long[] arr_v = this.d;
            fvns fvns0 = fvnw.a(v);
            fvnw0.m.a.c(v, this.c, this.e);
            if(arr_v.length > 0) {
                fvnw0.i(fvns0, arr_v[arr_v.length - 1], null);
            }
        }
    }
}

