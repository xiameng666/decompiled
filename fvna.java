import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.google.android.location.collectionlib.RealCollectorConfig;

public final class fvna {
    public final SensorManager a;

    public fvna(Context context0) {
        this.a = (SensorManager)context0.getSystemService("sensor");
    }

    public final Sensor a(int v) {
        return this.a.getDefaultSensor(v);
    }

    public final Sensor b(fvns fvns0) {
        Integer integer0 = (Integer)RealCollectorConfig.a.get(fvns0);
        return integer0 == null ? null : ((Sensor)gggq.o(this.a.getSensorList(integer0.intValue()), null));
    }

    public final void c(SensorEventListener sensorEventListener0) {
        this.a.unregisterListener(sensorEventListener0);
    }

    public final boolean d(SensorEventListener sensorEventListener0, Sensor sensor0, int v, Handler handler0) {
        return this.a.registerListener(sensorEventListener0, sensor0, v, handler0);
    }
}

