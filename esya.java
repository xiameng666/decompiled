import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.google.android.gms.tapandpay.hce.service.TpHceSessionManager.1;
import com.google.android.gms.tapandpay.hce.service.TpHceSessionManager;
import j..util.Objects;

public final class esya implements Runnable {
    public final TpHceSessionManager a;
    public final Context b;

    public esya(TpHceSessionManager tpHceSessionManager0, Context context0) {
        this.a = tpHceSessionManager0;
        this.b = context0;
    }

    @Override
    public final void run() {
        Context context0 = this.b;
        SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
        Sensor sensor0 = sensorManager0 == null ? null : sensorManager0.getDefaultSensor(36);
        if(sensor0 != null) {
            TpHceSessionManager tpHceSessionManager0 = this.a;
            if(tpHceSessionManager0.d == null) {
                tpHceSessionManager0.d = new TpHceSessionManager.1(tpHceSessionManager0, sensorManager0, context0);
                ((SensorManager)Objects.requireNonNull(sensorManager0)).registerListener(tpHceSessionManager0.d, sensor0, 0);
            }
        }
    }
}

