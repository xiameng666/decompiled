import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.hardware.Sensor;
import android.os.Handler;
import com.google.android.location.collectionlib.OnChangeSensorSignalCollector;
import com.google.android.location.collectionlib.RealCollectorConfig;
import com.google.android.location.collectionlib.SensorScanner.SensorEventListenerAdapter;
import com.google.android.location.collectionlib.SignalReplayer.1;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public final class fvok {
    public static final AtomicLong a;
    public final Object b;
    public final fwzp c;
    public final Map d;
    public final fwyc e;
    public final boolean f;
    public final boolean g;
    public final Map h;
    public fvkt i;
    public AlarmManager j;
    public PendingIntent k;
    public String l;
    public final BroadcastReceiver m;
    private final fvkx n;
    private final long o;
    private final List p;

    static {
        fvok.a = new AtomicLong(0L);
    }

    public fvok(fwzp fwzp0, fvkx fvkx0, long v, boolean z, fwyc fwyc0, boolean z1) {
        this.b = new Object();
        this.d = new HashMap();
        this.h = new HashMap();
        this.l = "";
        this.m = new SignalReplayer.1(this);
        this.c = fwzp0;
        this.o = v;
        this.n = fvkx0;
        this.f = z;
        this.p = new ArrayList(1);
        this.e = fwyc0;
        this.g = z1;
    }

    public final void a() {
        synchronized(this.b) {
            AlarmManager alarmManager0 = this.j;
            if(alarmManager0 != null) {
                alarmManager0.cancel(this.k);
            }
            if(huwo.a.f().k() || !this.g) {
                for(Object object1: this.p) {
                    fvnh fvnh0 = ((OnChangeSensorSignalCollector)object1).c();
                    if(fvnh0 != null) {
                        fvnh0.b.getType();
                        this.b(fvnh0.b, new long[]{fvnh0.c}, new long[]{fvnh0.d}, new float[][]{fvnh0.a});
                    }
                }
            }
            fvkt fvkt0 = this.i;
            if(fvkt0 != null) {
                fvoh fvoh0 = new fvoh(this);
                fvkt0.c.post(fvoh0);
            }
        }
    }

    public final void b(Sensor sensor0, long[] arr_v, long[] arr_v1, float[][] arr2_f) {
        synchronized(this.b) {
            Integer integer0 = sensor0.getType();
            fvuf fvuf0 = (fvuf)this.h.get(integer0);
            if(arr_v.length > 0) {
                Integer integer1 = sensor0.getType();
                this.d.put(integer1, Long.valueOf(arr_v[arr_v.length - 1]));
            }
            if(fvuf0 != null) {
                gftb.check(((Handler)fvuf0.b));
                fvoi fvoi0 = new fvoi(((SensorScanner.SensorEventListenerAdapter)fvuf0.a), sensor0, arr_v, arr_v1, arr2_f);
                ((Handler)fvuf0.b).post(fvoi0);
            }
        }
    }

    public final void c(fvkt fvkt0, Context context0) {
        synchronized(this.b) {
            this.i = fvkt0;
            if(this.e().isEmpty()) {
                this.a();
                return;
            }
            Set set0 = this.h.keySet();
        }
        for(Object object1: set0) {
            int v1 = (int)(((Integer)object1));
            fvns fvns0 = fvnw.a(v1);
            synchronized(this.n.a) {
                Object object2 = this.n.g.get(fvns0.z);
            }
            if(object2 == null && fvns0.C == 2 || this.g) {
                OnChangeSensorSignalCollector onChangeSensorSignalCollector0 = new OnChangeSensorSignalCollector(context0, v1);
                this.p.add(onChangeSensorSignalCollector0);
            }
        }
        fvkx fvkx0 = this.n;
        if(fvkx0.e.c()) {
            synchronized(this.b) {
                fvkx0.c(this.e(), this.o, this);
            }
        }
    }

    public final void d() {
        synchronized(this.b) {
            Map map0 = this.d;
            Integer integer0 = (int)1;
            if(map0.containsKey(integer0)) {
                Long long0 = (Long)map0.get(integer0);
                gftb.check(long0);
                Set set0 = this.e();
                synchronized(this.n.a) {
                }
                this.n.b(new fvlx(this.n.b, this.n.e, this, set0, -1L, ((long)long0), this.n.c, this.n), this);
            }
            else {
                Set set1 = this.e();
                this.n.c(set1, 30000L, this);
            }
        }
    }

    private final Set e() {
        Set set0 = EnumSet.noneOf(fvns.class);
        for(Object object0: this.h.keySet()) {
            fvns fvns0 = (fvns)RealCollectorConfig.b.get(((Integer)object0));
            if(fvns0 != null) {
                ((EnumSet)set0).add(fvns0);
            }
        }
        return set0;
    }
}

