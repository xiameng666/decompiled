import android.content.Context;
import android.hardware.SensorManager;
import android.view.OrientationEventListener;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import com.google.android.gms.nearby.mediums.UltraWidebandPublicApi.OrientationHandler.2;

public final class czlu {
    public final Context a;
    public final OrientationEventListener b;
    public final TracingSensorEventListener c;
    public final SensorManager d;
    public boolean e;
    private int f;
    private float g;

    public czlu(Context context0) {
        this.f = 0;
        this.g = 9.81f;
        this.e = false;
        this.a = context0;
        this.b = new czlt(this, context0);
        SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
        this.d = sensorManager0;
        if(sensorManager0.getDefaultSensor(1) == null) {
            this.c = null;
            return;
        }
        this.c = new UltraWidebandPublicApi.OrientationHandler.2(this, context0);
    }

    public final void a(float f) {
        synchronized(this) {
            this.g = f;
        }
    }

    public final void b(int v) {
        synchronized(this) {
            this.f = v;
        }
    }

    final boolean c() {
        synchronized(this) {
            int v1 = this.f;
            if(v1 >= 0 && (((long)v1) > 360L - hvog.aB() || ((long)v1) < hvog.aB()) && (Math.toDegrees(Math.acos(Math.min(1.0f, Math.abs(this.g) / 9.81f))) < ((double)hvog.a.bk().cZ()))) {
                return true;
            }
        }
        return false;
    }
}

