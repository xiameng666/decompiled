import android.hardware.Sensor;
import java.util.Locale;

public final class fvnh {
    public float[] a;
    public Sensor b;
    public long c;
    public long d;

    @Override
    public final String toString() {
        return String.format(Locale.US, "Value: %f; Sensor: %s; timestampNanos: %d; elapsedRealtimeNanos: %d", ((float)this.a[0]), this.b.getType(), ((long)this.c), ((long)this.d));
    }
}

