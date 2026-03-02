import android.app.AlarmManager;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.location.collectionlib.SensorScanner.SensorEventListenerAdapter;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class fvlx implements Runnable {
    private final Context a;
    private final fvna b;
    private final fvok c;
    private final Set d;
    private final fvnz e;
    private final long f;
    private final long g;
    private final fvkx h;

    public fvlx(Context context0, fvnz fvnz0, fvok fvok0, Set set0, long v, long v1, fvna fvna0, fvkx fvkx0) {
        this.h = fvkx0;
        this.a = context0;
        this.b = fvna0;
        this.e = fvnz0;
        this.d = set0;
        this.c = fvok0;
        this.f = v;
        this.g = v1;
    }

    @Override
    public final void run() {
        fvkv fvkv0;
        int v3;
        ArrayList arrayList0 = new ArrayList(this.d.size());
        for(Object object0: this.d) {
            fvns fvns0 = (fvns)object0;
            synchronized(this.h.a) {
                fvkv0 = (fvkv)this.h.g.get(fvns0.z);
            }
            if(fvkv0 != null) {
                fvrw fvrw0 = fvkv0.a;
                if(!fvrw0.e()) {
                    long v1 = this.f;
                    if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                        arrayList0.add(new fvlw(fvns0, fvrw0, 0));
                    }
                    else {
                        long v2 = this.g;
                        if(v2 <= 0L) {
                            v2 = fvrw0.d(fvrw0.c - 1) - TimeUnit.NANOSECONDS.convert(v1, TimeUnit.MILLISECONDS);
                            v3 = fvrw0.c(v2);
                        }
                        else {
                            v3 = 1 + fvrw0.c(v2);
                        }
                        long v4 = TimeUnit.MILLISECONDS.toNanos(500L);
                        if(v3 < 0 || v3 < fvrw0.c && v2 - fvrw0.d(v3) > v4) {
                            v3 = fvrw0.b(v2, v3);
                        }
                        if(v3 < 0 || v3 >= fvrw0.c) {
                            continue;
                        }
                        arrayList0.add(new fvlw(fvns0, fvrw0, v3));
                    }
                }
            }
        }
        fvok fvok0 = this.c;
        if(fvok0.f) {
            for(Object object1: arrayList0) {
                fvlw fvlw0 = (fvlw)object1;
                long v5 = this.e.a();
                fvrw fvrw1 = fvlw0.b;
                int v6 = fvrw1.c - fvlw0.c;
                int v7 = fvrw1.a;
                float[][] arr2_f = new float[v7][v6];
                long[] arr_v = new long[v6];
                long[] arr_v1 = new long[v6];
                int v8;
                for(v8 = 0; !fvlw0.a(); ++v8) {
                    int v9 = fvlw0.c;
                    fvlw0.c = v9 + 1;
                    long v10 = fvrw1.d(v9);
                    for(int v11 = 0; v11 < v7; ++v11) {
                        float[] arr_f = arr2_f[v11];
                        arr_f[v8] = fvrw1.a(v9, v11);
                    }
                    arr_v[v8] = v10;
                    arr_v1[v8] = (v10 - v5) / 1000000L;
                }
                gftb.r(v8 == v6, "Wrong event size.");
                Sensor sensor0 = this.b.b(fvlw0.a);
                if(sensor0 != null) {
                    this.c.b(sensor0, arr_v, arr_v1, arr2_f);
                }
            }
        }
        else {
            long v12 = this.e.a();
            while(!arrayList0.isEmpty()) {
                long v13 = 0x7FFFFFFFFFFFFFFFL;
                int v15 = 0;
                for(int v14 = 0; v14 < arrayList0.size(); ++v14) {
                    fvlw fvlw1 = (fvlw)arrayList0.get(v14);
                    long v16 = fvlw1.b.d(fvlw1.c);
                    int v17 = Long.compare(v16, v13);
                    if(v17 < 0) {
                        v13 = v16;
                    }
                    if(v17 < 0) {
                        v15 = v14;
                    }
                }
                fvlw fvlw2 = (fvlw)arrayList0.get(v15);
                int v18 = fvlw2.a.D;
                fvrw fvrw2 = fvlw2.b;
                gftb.r(v18 == fvrw2.a, "Sensor dimension mismatch.");
                int v19 = fvlw2.c;
                fvlw2.c = v19 + 1;
                long v20 = fvrw2.d(v19);
                long v21 = v20 - v12;
                Sensor sensor1 = this.b.b(fvlw2.a);
                if(sensor1 != null) {
                    if(v18 == 1) {
                        float f = fvrw2.a(v19, 0);
                        Object object2 = fvok0.b;
                        synchronized(object2) {
                            Integer integer0 = sensor1.getType();
                            fvuf fvuf0 = (fvuf)fvok0.h.get(integer0);
                            Integer integer1 = sensor1.getType();
                            fvok0.d.put(integer1, Long.valueOf(v20));
                            if(fvuf0 != null) {
                                gftb.check(((Handler)fvuf0.b));
                                fvoj fvoj0 = new fvoj(((SensorScanner.SensorEventListenerAdapter)fvuf0.a), sensor1, v20, v21, f);
                                ((Handler)fvuf0.b).post(fvoj0);
                            }
                        }
                    }
                    else {
                        switch(v18) {
                            case 3: {
                                float f1 = fvrw2.a(v19, 0);
                                float f2 = fvrw2.a(v19, 1);
                                float f3 = fvrw2.a(v19, 2);
                                Object object3 = fvok0.b;
                                synchronized(object3) {
                                    Integer integer2 = sensor1.getType();
                                    fvuf fvuf1 = (fvuf)fvok0.h.get(integer2);
                                    Integer integer3 = sensor1.getType();
                                    fvok0.d.put(integer3, Long.valueOf(v20));
                                    if(fvuf1 != null) {
                                        gftb.check(((Handler)fvuf1.b));
                                        fvof fvof0 = new fvof(((SensorScanner.SensorEventListenerAdapter)fvuf1.a), sensor1, v20, v21, f1, f2, f3);
                                        ((Handler)fvuf1.b).post(fvof0);
                                    }
                                }
                                break;
                            }
                            case 6: {
                                float f4 = fvrw2.a(v19, 0);
                                float f5 = fvrw2.a(v19, 1);
                                float f6 = fvrw2.a(v19, 2);
                                float f7 = fvrw2.a(v19, 3);
                                float f8 = fvrw2.a(v19, 4);
                                float f9 = fvrw2.a(v19, 5);
                                Object object4 = fvok0.b;
                                synchronized(object4) {
                                    Integer integer4 = sensor1.getType();
                                    fvuf fvuf2 = (fvuf)fvok0.h.get(integer4);
                                    Integer integer5 = sensor1.getType();
                                    fvok0.d.put(integer5, Long.valueOf(v20));
                                    if(fvuf2 != null) {
                                        gftb.check(((Handler)fvuf2.b));
                                        fvog fvog0 = new fvog(((SensorScanner.SensorEventListenerAdapter)fvuf2.a), sensor1, v20, v21, f4, f5, f6, f7, f8, f9);
                                        ((Handler)fvuf2.b).post(fvog0);
                                    }
                                }
                                break;
                            }
                            default: {
                                throw new IllegalStateException("Unknown sensor dimension.");
                            }
                        }
                    }
                }
                if(fvlw2.a()) {
                    arrayList0.remove(v15);
                }
            }
        }
        fvok fvok1 = this.c;
        if(fvok1.g) {
            Context context0 = this.a;
            fwzp fwzp0 = fvok1.c;
            fwzf fwzf0 = fwzf.t;
            if(fwzp0.k(fwzf0)) {
                fwzp0.j(fwzf0);
            }
            AlarmManager alarmManager0 = fvok1.j;
            if(alarmManager0 != null) {
                IntentFilter intentFilter0 = new IntentFilter(fvok1.l);
                jwe.b(context0, fvok1.m, intentFilter0, 2);
                alarmManager0.setAndAllowWhileIdle(0, SystemClock.elapsedRealtime() + 30000L, fvok1.k);
            }
            return;
        }
        fvok1.a();
    }
}

