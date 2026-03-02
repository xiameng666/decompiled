import android.content.Context;
import android.hardware.Sensor;
import android.os.Looper;
import com.google.android.location.collectionlib.RealCollectorConfig;
import com.google.android.location.collectionlib.SensorScanner.SensorEventListenerAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class fvnw extends fvnr {
    final SensorScanner.SensorEventListenerAdapter a;
    public final fvnx b;
    private final Map c;
    private final fvok d;
    private final fvna e;

    public fvnw(Context context0, fvok fvok0, Map map0, fvnx fvnx0, fvls fvls0, fvlt fvlt0, fybc fybc0) {
        super(fvls0, fvlt0, fybc0);
        this.a = new SensorScanner.SensorEventListenerAdapter(this);
        gftb.check(context0);
        this.d = fvok0;
        this.c = new HashMap(map0);
        this.e = new fvna(context0);
        this.b = fvnx0;
    }

    public static fvns a(int v) {
        fvns fvns0 = (fvns)RealCollectorConfig.b.get(Integer.valueOf(v));
        return fvns0 == null ? fvns.x : fvns0;
    }

    @Override  // fvnr
    protected final void b() {
        fvna fvna0 = this.e;
        if(fvna0 != null) {
            for(Object object0: this.c.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                int v = (int)(((Integer)map$Entry0.getKey()));
                List list0 = fvna0.a.getSensorList(v);
                if(list0 != null && !list0.isEmpty()) {
                    Sensor sensor0 = (Sensor)list0.get(0);
                    fvok fvok0 = this.d;
                    if(fvok0 == null) {
                        int v1 = (int)(((Integer)map$Entry0.getValue()));
                        if(fvna0.d(this.a, sensor0, v1, this.m)) {
                            continue;
                        }
                        map$Entry0.getKey();
                    }
                    else {
                        SensorScanner.SensorEventListenerAdapter sensorScanner$SensorEventListenerAdapter0 = this.a;
                        clht clht0 = this.m;
                        if(sensorScanner$SensorEventListenerAdapter0 == null) {
                            continue;
                        }
                        Object object1 = fvok0.b;
                        synchronized(object1) {
                            if(clht0 == null) {
                                clht0 = new clht(Looper.getMainLooper());
                            }
                            Integer integer0 = sensor0.getType();
                            fvuf fvuf0 = new fvuf(sensorScanner$SensorEventListenerAdapter0, clht0);
                            fvok0.h.put(integer0, fvuf0);
                        }
                    }
                }
            }
        }
    }

    @Override  // fvnr
    protected final void c() {
        if(this.d == null) {
            try {
                this.e.c(this.a);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
    }
}

