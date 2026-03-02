import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;

public final class eykb {
    public final bboh a;
    public final icck b;
    public final Context c;
    public final SensorManager d;
    public final Sensor e;

    public eykb(bboh bboh0, icck icck0) {
        this.a = bboh0;
        this.b = icck0;
        Context context0 = AppContextProvider.a();
        this.c = context0;
        SensorManager sensorManager0 = (SensorManager)context0.getSystemService(SensorManager.class);
        this.d = sensorManager0;
        this.e = sensorManager0.getDefaultSensor(8);
    }
}

