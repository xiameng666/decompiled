import android.content.Context;
import android.hardware.Sensor;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import com.google.android.location.collectionlib.BatchSignalCollector.BatchSensorEventListener;
import com.google.android.location.collectionlib.SensorTimestampCalibrator.CalibrationSensorListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jeb.synthetic.FIN;

public final class fvkx {
    public final Object a;
    public final Context b;
    public final fvna c;
    public final fybc d;
    public final fvnz e;
    public final List f;
    public final SparseArray g;
    public int h;
    public long i;
    private static fvkx j;
    private final TracingSensorEventListener k;
    private fvkw l;

    private fvkx(Context context0, fwzp fwzp0, fybc fybc0) {
        this.a = new Object();
        this.f = new ArrayList();
        this.h = 0;
        this.i = 200L;
        this.b = context0.getApplicationContext();
        this.d = fybc0;
        new fxbi(context0);
        this.e = new fvnz(context0, fwzp0);
        this.c = new fvna(context0);
        this.k = new BatchSignalCollector.BatchSensorEventListener(this);
        this.g = new SparseArray();
    }

    public static fvkx a(Context context0, fwzp fwzp0, fybc fybc0) {
        synchronized(fvkx.class) {
            if(fvkx.j == null) {
                fvkx.j = new fvkx(context0, fwzp0, fybc0);
            }
        }
        return fvkx.j;
    }

    public final void b(fvlx fvlx0, fvok fvok0) {
        synchronized(this.a) {
            fvkw fvkw0 = this.l;
            if(fvkw0 == null) {
                fvok0.a();
                return;
            }
            if(!this.e.c()) {
                fvok0.a();
                return;
            }
            this.h = this.g.size();
            this.c.a.flush(this.k);
            if(fvkw0.b.postDelayed(new fvku(this, fvlx0), this.i)) {
                this.f.add(fvlx0);
            }
            else {
                fvok0.a();
            }
        }
    }

    public final void c(Set set0, long v, fvok fvok0) {
        fvlx fvlx0;
        synchronized(this.a) {
            fvlx0 = new fvlx(this.b, this.e, fvok0, set0, v, -1L, this.c, this);
        }
        this.b(fvlx0, fvok0);
    }

    public final void d(String s, fvns fvns0) {
        this.f(fvns0);
        synchronized(this.a) {
            if(fvns0.A) {
                int v1 = fvns0.z;
                fvna fvna0 = this.c;
                Sensor sensor0 = fvna0.b(fvns0);
                SparseArray sparseArray0 = this.g;
                fvkv fvkv0 = (fvkv)sparseArray0.get(v1);
                if(fvkv0 != null) {
                    fvkv0.b.remove(s);
                    fvkv0.a();
                    if(fvkv0.b.size() == 0) {
                        sparseArray0.remove(v1);
                        gftb.check(sensor0);
                        fvna0.a.unregisterListener(this.k, sensor0);
                    }
                }
            }
            this.g();
        }
    }

    public final boolean e(String s, fvns fvns0, int v, int v1) {
        boolean z;
        Sensor sensor0;
        this.f(fvns0);
        Object object0 = this.a;
        __monitor_enter(object0);
        try {
            z = true;
            fvnz fvnz0 = this.e;
            Object object1 = fvnz0.d;
            __monitor_enter(object1);
            int v3 = FIN.finallyOpen$NT();
            if(fvnz0.g) {
                FIN.finallyCodeBegin$NT(v3);
            }
            else if(fvnz0.f) {
                FIN.finallyExec$NT(v3);
            }
            else {
                int[] arr_v = fvnz.a;
                int v4 = 0;
                while(true) {
                    sensor0 = null;
                    if(v4 < 3) {
                        Sensor sensor1 = fvnz0.c.a(arr_v[v4]);
                        if(sensor1 != null) {
                            sensor0 = sensor1;
                            break;
                        }
                        ++v4;
                        continue;
                    }
                    break;
                }
                if(sensor0 == null) {
                    FIN.finallyExec$NT(v3);
                    return false;
                }
                fvnz0.b.i(fwzf.s, 600000L, null);
                SensorTimestampCalibrator.CalibrationSensorListener sensorTimestampCalibrator$CalibrationSensorListener0 = new SensorTimestampCalibrator.CalibrationSensorListener(fvnz0);
                fvnz0.e = sensorTimestampCalibrator$CalibrationSensorListener0;
                fvnz0.g = true;
                clht clht0 = new clht(Looper.getMainLooper());
                boolean z1 = fvnz0.c.d(sensorTimestampCalibrator$CalibrationSensorListener0, sensor0, 1, clht0);
                if(z1) {
                    clht0.postDelayed(fvnz0.h, 5000L);
                }
                else {
                    fvnz0.b(false, 0L);
                    fvnz0.e = null;
                }
                FIN.finallyExec$NT(v3);
                if(!z1) {
                    return false;
                }
            }
            if(this.l == null) {
                fvkw fvkw0 = new fvkw(this);
                this.l = fvkw0;
                fvkw0.start();
                try {
                    fvkw0.a.await();
                    fvkw0.c = true;
                }
                catch(InterruptedException unused_ex) {
                    this.l = null;
                    return false;
                }
            }
            if(fvns0.A) {
                int v5 = fvns0.z;
                fvna fvna0 = this.c;
                Sensor sensor2 = fvna0.b(fvns0);
                SparseArray sparseArray0 = this.g;
                fvkv fvkv0 = (fvkv)sparseArray0.get(v5);
                if(fvkv0 == null) {
                    sparseArray0.put(v5, new fvkv(s, fvns0.D, v1));
                    gftb.check(sensor2);
                    gftb.check(this.l);
                    z = fvna0.a.registerListener(this.k, sensor2, v, 0x7FFFFFFF, this.l.b);
                    if(!z) {
                        sparseArray0.remove(v5);
                        z = false;
                    }
                }
                else {
                    fvkv0.b.put(s, Integer.valueOf(v1));
                    fvkv0.a();
                }
            }
            else {
                z = false;
            }
            this.g();
        }
        finally {
            __monitor_exit(object0);
        }
        return z;
    }

    private final void f(fvns fvns0) {
        if(fvns0.A && this.c.b(fvns0) != null) {
            return;
        }
        throw new IllegalArgumentException("Not a supported sensor or the device doesn\'t have the sensor. Scanner Type: " + fvns0);
    }

    private final void g() {
        fvkw fvkw0 = this.l;
        if(this.g.size() == 0 && fvkw0 != null) {
            if(fvkw0.c) {
                Object object0 = fvkw0.d.a;
                synchronized(object0) {
                    List list0 = fvkw0.d.f;
                    for(Object object1: list0) {
                        fvkw0.b.post(((fvlx)object1));
                    }
                    list0.clear();
                    fvkw0.b.getLooper().quitSafely();
                }
            }
            this.l = null;
        }
    }
}

