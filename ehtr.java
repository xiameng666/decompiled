import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import com.google.android.gms.personalsafety.ars.datacollection.SensorStreamer.SensorEventListener;
import java.util.concurrent.TimeUnit;

public final class ehtr {
    public ehsz a;
    public final Sensor b;
    public long c;
    private final SensorManager d;
    private final TracingSensorEventListener e;

    public ehtr(Context context0) {
        this.c = 0L;
        SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
        this.d = sensorManager0;
        this.b = sensorManager0 == null ? null : sensorManager0.getDefaultSensor(1);
        if(this.b == null) {
            this.e = null;
            return;
        }
        this.e = new SensorStreamer.SensorEventListener(this, context0);
    }

    public final void a() {
        this.c = SystemClock.elapsedRealtimeNanos();
        SensorManager sensorManager0 = this.d;
        if(sensorManager0 != null && this.a != null) {
            TracingSensorEventListener tracingSensorEventListener0 = this.e;
            if(tracingSensorEventListener0 != null) {
                Sensor sensor0 = sensorManager0.getDefaultSensor(1);
                if(sensor0 != null) {
                    sensorManager0.registerListener(tracingSensorEventListener0, sensor0, ((int)TimeUnit.MILLISECONDS.toMicros(hrto.a.o().b())), ((int)TimeUnit.MILLISECONDS.toMicros(hrto.a.o().a())));
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager0 = this.d;
        if(sensorManager0 != null) {
            TracingSensorEventListener tracingSensorEventListener0 = this.e;
            if(tracingSensorEventListener0 != null) {
                sensorManager0.unregisterListener(tracingSensorEventListener0);
            }
        }
    }
}

