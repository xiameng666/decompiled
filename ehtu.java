import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import com.google.android.gms.personalsafety.ars.datacollection.StepCounter.SensorEventListener;

public final class ehtu {
    public final SensorManager a;
    public ehtt b;
    public final TracingSensorEventListener c;
    public final Sensor d;
    public boolean e;

    public ehtu(Context context0) {
        this.e = false;
        SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
        this.a = sensorManager0;
        this.d = sensorManager0 == null ? null : sensorManager0.getDefaultSensor(19);
        if(this.d != null) {
            this.c = new StepCounter.SensorEventListener(this, context0);
            return;
        }
        this.c = null;
    }
}

