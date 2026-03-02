import android.content.Context;
import com.google.android.location.collectionlib.SensorTimestampCalibrator.CalibrationSensorListener;

public final class fvnz {
    public static final int[] a;
    public final fwzp b;
    public final fvna c;
    public final Object d;
    SensorTimestampCalibrator.CalibrationSensorListener e;
    public boolean f;
    public boolean g;
    final Runnable h;
    private long i;

    static {
        fvnz.a = new int[]{1, 2, 4};
    }

    public fvnz(Context context0, fwzp fwzp0) {
        this.d = new Object();
        this.f = false;
        this.g = false;
        this.i = 0L;
        this.h = new fvny(this);
        this.c = new fvna(context0);
        this.b = fwzp0;
    }

    public final long a() {
        synchronized(this.d) {
        }
        return this.i;
    }

    public final void b(boolean z, long v) {
        synchronized(this.d) {
            SensorTimestampCalibrator.CalibrationSensorListener sensorTimestampCalibrator$CalibrationSensorListener0 = this.e;
            if(sensorTimestampCalibrator$CalibrationSensorListener0 != null) {
                this.c.c(sensorTimestampCalibrator$CalibrationSensorListener0);
            }
            this.f = z;
            this.g = false;
            this.i = v;
            this.b.j(fwzf.s);
        }
    }

    public final boolean c() {
        synchronized(this.d) {
        }
        return this.f;
    }
}

