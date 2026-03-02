import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class fwvo implements fwzm {
    public final Object a;
    public final fwze b;
    public final Map c;
    public final SensorManager d;
    public final Context e;
    private final LocationManager f;

    public fwvo(Context context0, fwze fwze0) {
        this.a = new Object();
        this.c = new HashMap();
        this.e = context0;
        this.b = fwze0;
        this.d = (SensorManager)context0.getSystemService("sensor");
        this.f = (LocationManager)context0.getSystemService("location");
    }

    @Override  // fwzm
    public final boolean a() {
        List list0 = this.d.getSensorList(1);
        return list0 != null && !list0.isEmpty();
    }

    @Override  // fwzm
    public final boolean b() {
        SensorManager sensorManager0 = this.d;
        if(sensorManager0 != null) {
            List list0 = sensorManager0.getSensorList(4);
            boolean z = list0 != null && !list0.isEmpty();
            List list1 = sensorManager0.getSensorList(1);
            boolean z1 = list1 != null && !list1.isEmpty();
            LocationManager locationManager0 = this.f;
            if(locationManager0 != null) {
                List list2 = locationManager0.getAllProviders();
                return list2 != null && list2.contains("gps") && z && z1;
            }
        }
        return false;
    }

    @Override  // fwzm
    public final boolean c(fvns fvns0) {
        Integer integer0 = (Integer)RealCollectorConfig.a.get(fvns0);
        if(integer0 == null) {
            return false;
        }
        SensorManager sensorManager0 = this.d;
        int v = (int)integer0;
        if(sensorManager0 != null) {
            List list0 = sensorManager0.getSensorList(v);
            return list0 != null && !list0.isEmpty();
        }
        return false;
    }

    @Override  // fwzm
    public final boolean d(fvns fvns0) {
        Integer integer0 = (Integer)RealCollectorConfig.a.get(fvns0);
        return integer0 == null ? false : fwvo.f(this.d, integer0.intValue()) > 0;
    }

    @Override  // fwzm
    public final fvmz e(String s, fxcz fxcz0) {
        fwvn fwvn0 = (fwvn)this.b;
        fwvj fwvj0 = new fwvj(fwvn0);
        byte[] arr_b = fwvn0.n.b();
        fybc fybc0 = new fybc("SensorUploader");
        return new fvpk(fwvn0.j, fwvn0.f.a, fwvn0.f.b, fwvj0, s, arr_b, fxcz0, fybc0);
    }

    public static final int f(SensorManager sensorManager0, int v) {
        Sensor sensor0 = sensorManager0.getDefaultSensor(v);
        return sensor0 == null ? 0 : sensor0.getFifoMaxEventCount();
    }
}

