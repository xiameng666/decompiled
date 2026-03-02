import android.content.Intent;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Map;

abstract class futw extends fuvb implements fusw {
    protected final Map a;
    protected boolean b;
    protected final Map c;
    private static final Map j;
    private long k;
    private long l;

    static {
        EnumMap enumMap0 = new EnumMap(fvns.class);
        futw.j = enumMap0;
        enumMap0.put(fvns.d, Integer.valueOf(10000));
        Integer integer0 = (int)5000;
        enumMap0.put(fvns.i, integer0);
        enumMap0.put(fvns.k, integer0);
    }

    public futw(futd futd0) {
        super(futd0);
        this.a = new HashMap();
        this.b = false;
        this.k = -1L;
        this.l = -1L;
        this.c = new HashMap();
    }

    @Override  // fusw
    public final void b(fusv fusv0) {
        String s;
        switch(fusv0.b) {
            case 0: {
                this.q(fusv0.a());
                return;
            }
            case 1: {
                this.r();
                return;
            }
            case 2: {
                s = fusv0.c;
                break;
            }
            default: {
                s = "";
            }
        }
        this.j(s);
    }

    @Override  // fusw
    public void c(ActivityRecognitionResult activityRecognitionResult0) {
        futd futd0 = this.d;
        futd0.j(activityRecognitionResult0);
        if(!this.b && activityRecognitionResult0.d().a() == 5) {
            futd0.s(new ActivityRecognitionResult(activityRecognitionResult0.a, activityRecognitionResult0.b, activityRecognitionResult0.c, activityRecognitionResult0.d, activityRecognitionResult0.b()));
        }
    }

    @Override  // fusw
    public final void d(ActivityRecognitionResult activityRecognitionResult0) {
        gftb.check(activityRecognitionResult0);
        this.d.j(activityRecognitionResult0);
    }

    @Override  // fusw
    public final void e(long v, long v1, fvns fvns0, fvsf fvsf0) {
        fvsf fvsf1 = fvsf0;
        if(this.d.X) {
            Map map0 = futw.j;
            if(map0.containsKey(fvns0)) {
                int v2 = fvsf1.c;
                if(v2 != 0) {
                    Map map1 = this.a;
                    if(map1.containsKey(fvns0)) {
                        fvsf fvsf2 = (fvsf)map1.get(fvns0);
                        if(fvsf1.b() != fvsf2.b()) {
                            throw new IllegalArgumentException("Cannot concatenate data of different dimensionalities, this dimension: " + fvsf2.b() + ", dataToBeAppended dimension: " + fvsf1.b());
                        }
                        int v3 = fvsf2.c;
                        int v4 = v3 + v2;
                        long[] arr_v = new long[v4];
                        float[][] arr2_f = new float[fvsf2.b()][v4];
                        int v5 = fvsf2.b;
                        System.arraycopy(fvsf2.d, v5, arr_v, 0, v3);
                        int v6 = fvsf1.b;
                        for(int v7 = 0; v7 < v2; ++v7) {
                            arr_v[v3 + v7] = fvsf1.d[v6 + v7];
                        }
                        for(int v8 = 0; v8 < fvsf2.b(); ++v8) {
                            System.arraycopy(fvsf2.e[v8], v5, arr2_f[v8], 0, v3);
                            System.arraycopy(fvsf1.e[v8], v6, arr2_f[v8], v3, v2);
                        }
                        fvsf1 = new fvsf(arr_v, arr2_f);
                    }
                    int v9 = (int)(((Integer)map0.get(fvns0)));
                    int v10 = fvsf1.c;
                    if(v10 <= v9) {
                        map1.put(fvns0, fvsf1);
                    }
                    else {
                        map1.put(fvns0, fvsf1.e(v10 - v9, v9));
                    }
                    this.k = v;
                    this.l = v1;
                }
            }
        }
    }

    @Override  // fusw
    public final void f(ActivityRecognitionResult activityRecognitionResult0, fuxa fuxa0, ActivityRecognitionResult activityRecognitionResult1) {
        DetectedActivity detectedActivity2;
        long v6;
        boolean z2;
        fvuf fvuf0;
        ActivityRecognitionResult activityRecognitionResult3;
        boolean z1;
        ActivityRecognitionResult activityRecognitionResult2;
        Boolean boolean0;
        int v3;
        if(!this.b) {
            fuuq fuuq0 = this.d.L;
            if(fuuq0 != null) {
                DetectedActivity detectedActivity0 = activityRecognitionResult0.d();
                if(detectedActivity0.a() == 9) {
                    long v = activityRecognitionResult0.b;
                    long v1 = activityRecognitionResult0.c;
                    LinkedList linkedList0 = fuuq0.a;
                    linkedList0.addLast(new fvuf(v1, fuxa0));
                    if((this instanceof futv)) {
                        fuuo fuuo0 = fuuq0.e;
                        int v2 = fuuo0.c;
                        if(v2 > 0 && v1 - fuuo0.b > 20000L) {
                            fuuo0.c = 1;
                            fuuo0.d = detectedActivity0.e >= 50 ? 1 : 0;
                            fuuo0.b = v1;
                            if(v1 - fuuo0.a >= 180000L) {
                                v3 = 1;
                                goto label_33;
                            }
                            else {
                                boolean0 = null;
                            }
                        }
                        else {
                            if(v2 == 0) {
                                fuuo0.b = v1;
                            }
                            v3 = v2 + 1;
                            fuuo0.c = v3;
                            if(detectedActivity0.e >= 50) {
                                ++fuuo0.d;
                            }
                            if(v3 < 5) {
                                boolean0 = null;
                            }
                            else {
                            label_33:
                                boolean z = fuuo0.d + fuuo0.d > v3;
                                fuuo0.c = 0;
                                fuuo0.d = 0;
                                fuuo0.a = v1;
                                boolean0 = Boolean.valueOf(z);
                            }
                        }
                        if(boolean0 == null) {
                            activityRecognitionResult2 = null;
                        }
                        else {
                            z1 = boolean0.booleanValue();
                            goto label_44;
                        }
                    }
                    else {
                        z1 = detectedActivity0.e >= 50;
                    label_44:
                        if(z1) {
                            DetectedActivity detectedActivity1 = fuuq0.a(v1) ? new DetectedActivity(9, 100) : new DetectedActivity(9, 51);
                            fuuq0.c = v1;
                            activityRecognitionResult3 = new ActivityRecognitionResult(detectedActivity1, v, v1, fuxl.s.am, null);
                        }
                        else {
                            fuup fuup0 = fuuq0.f;
                            fuup0.a(v1);
                            if(fuup0.a > 0) {
                                long v4 = (this instanceof futv) ? humi.a.c().b() : humi.b();
                                if(v4 > 0L && activityRecognitionResult1 != null && activityRecognitionResult1.d().e > 50) {
                                    ++fuup0.b;
                                    fuup0.e = v1;
                                }
                                if(v1 - fuup0.c >= 160000L && fuup0.a >= 6 && ((long)fuup0.b) >= v4) {
                                    fuuq0.c = v1;
                                    activityRecognitionResult3 = new ActivityRecognitionResult(new DetectedActivity(9, 70), v, v1, fuxl.s.am, null);
                                }
                                else {
                                    fvuf0 = (fvuf)linkedList0.pollFirst();
                                    goto label_63;
                                }
                            }
                            else {
                                fvuf0 = (fvuf)linkedList0.pollFirst();
                            label_63:
                                while(!linkedList0.isEmpty() && v1 - ((long)(((Long)((fvuf)linkedList0.getFirst()).a))) > 62000L) {
                                    fvuf0 = (fvuf)linkedList0.pollFirst();
                                }
                                Long long0 = (Long)fvuf0.a;
                                if(Long.compare(v1 - ((long)long0), 62000L) > 0 && !linkedList0.isEmpty()) {
                                    long v5 = 62000L - (v1 - ((long)(((Long)((fvuf)linkedList0.getFirst()).a))));
                                    if(v5 + v5 < v1 - ((long)long0) - 62000L && v1 - ((long)(((Long)((fvuf)linkedList0.getFirst()).a))) >= 50000L) {
                                        fvuf0 = (fvuf)linkedList0.getFirst();
                                        z2 = false;
                                    }
                                    else {
                                        z2 = true;
                                    }
                                }
                                else {
                                    z2 = true;
                                }
                                if(z2 && v1 - ((long)(((Long)fvuf0.a))) < 200000L) {
                                    linkedList0.addFirst(fvuf0);
                                }
                                Long long1 = (Long)fvuf0.a;
                                fuxa fuxa1 = v1 - ((long)long1) > 200000L || v1 - ((long)long1) < 50000L ? null : ((fuxa)fvuf0.b);
                                if(fuxa1 == null) {
                                    v6 = v;
                                    fuuq0.b.clear();
                                    detectedActivity2 = fuuq0.c == -1L || v1 - fuuq0.c > 110000L ? new DetectedActivity(9, 0) : new DetectedActivity(9, 25);
                                }
                                else {
                                    fuwz fuwz0 = fuuq0.d;
                                    double f = (double)fuxa0.c;
                                    double f1 = (double)fuxa1.a;
                                    double f2 = (double)fuxa1.b;
                                    double f3 = (double)fuxa1.c;
                                    double f4 = (double)fuxa0.a;
                                    double f5 = (double)fuxa0.b;
                                    if(fuwz.b(f1, f2, f3, f4, f5, f) >= 0.99) {
                                        double f6 = (double)fuxa1.d;
                                        if(f6 <= 0.038) {
                                            double f7 = (double)fuxa0.d;
                                            if(f7 <= 0.038) {
                                                v6 = v;
                                                double f8 = fuwz.d(Math.acos(fuxa1.e), 30.0);
                                                double f9 = fuwz.d(Math.acos(fuxa0.e), 30.0);
                                                double f10 = fuwz.d(f6, 70.0);
                                                double f11 = fuwz.d(f7, 70.0);
                                                double[] arr_f = {1.0, f8 * f9, f10 * f11, f8 * f8 + f9 * f9, f10 * f10 + f11 * f11};
                                                for(int v7 = 1; v7 < 5; ++v7) {
                                                    if((arr_f[v7] < 1.000000E-10)) {
                                                        arr_f[v7] = 1.000000E-10;
                                                    }
                                                }
                                                double[] arr_f1 = {fuwz.d(Math.acos(fuwz.b(f1, f2, f3, f4, f5, f)), 30.0), fuwz.d(Math.acos(fuwz.b(fuxa1.f, fuxa1.g, fuxa1.h, fuxa0.f, fuxa0.g, fuxa0.h)), 30.0), fuwz.d(Math.acos(fuwz.b(fuxa1.i, fuxa1.j, fuxa1.k, fuxa0.i, fuxa0.j, fuxa0.k)), 30.0), fuwz.d(fuwz.c(f1, f2, f3, f4, f5, f), 7.0), fuwz.d(fuwz.c(fuxa1.f, fuxa1.g, fuxa1.h, fuxa0.f, fuxa0.g, fuxa0.h), 4.0), fuwz.d(fuwz.c(fuxa1.i, fuxa1.j, fuxa1.k, fuxa0.i, fuxa0.j, fuxa0.k), 7.0)};
                                                Arrays.copyOf(arr_f1, 7)[6] = 1.0;
                                                double f12 = -0.776823;
                                                int v9 = 0;
                                                for(int v8 = 0; v9 < 6; v8 = v10) {
                                                    double f13 = arr_f1[v9];
                                                    double f14 = f13 * f13;
                                                    int v10 = v8;
                                                    int v11 = 0;
                                                    while(v11 < 5) {
                                                        double f15 = arr_f[v11];
                                                        f12 = f12 + fuwz0.a(v10, f13 / f15) + fuwz0.a(v10 + 1, f14 / f15);
                                                        v10 += 2;
                                                        ++v11;
                                                        f13 = f13;
                                                    }
                                                    ++v9;
                                                }
                                                v1 = v1;
                                                if(Double.compare(f12, 0.0) > 0) {
                                                    detectedActivity2 = fuuq0.a(v1) ? new DetectedActivity(9, 100) : new DetectedActivity(9, 25);
                                                    fuuq0.c = v1;
                                                }
                                                else {
                                                    fuuq0.b.clear();
                                                    detectedActivity2 = fuuq0.c == -1L || v1 - fuuq0.c > 110000L ? new DetectedActivity(9, 0) : new DetectedActivity(9, 25);
                                                }
                                            }
                                            else {
                                                v6 = v;
                                                fuuq0.b.clear();
                                                detectedActivity2 = fuuq0.c == -1L || v1 - fuuq0.c > 110000L ? new DetectedActivity(9, 0) : new DetectedActivity(9, 25);
                                            }
                                        }
                                        else {
                                            v6 = v;
                                            fuuq0.b.clear();
                                            detectedActivity2 = fuuq0.c == -1L || v1 - fuuq0.c > 110000L ? new DetectedActivity(9, 0) : new DetectedActivity(9, 25);
                                        }
                                    }
                                    else {
                                        v6 = v;
                                        fuuq0.b.clear();
                                        detectedActivity2 = fuuq0.c == -1L || v1 - fuuq0.c > 110000L ? new DetectedActivity(9, 0) : new DetectedActivity(9, 25);
                                    }
                                }
                                activityRecognitionResult3 = new ActivityRecognitionResult(detectedActivity2, v6, v1, fuxl.s.am, null);
                            }
                        }
                        activityRecognitionResult2 = activityRecognitionResult3;
                    }
                }
                else {
                    activityRecognitionResult2 = null;
                }
                if(activityRecognitionResult2 != null) {
                    fusy.b(this.h, activityRecognitionResult2, true);
                    this.f.mM(activityRecognitionResult2);
                    this.o(activityRecognitionResult2);
                }
            }
        }
    }

    protected abstract fusy g();

    protected int h() {
        return 10;
    }

    protected void j(String s) {
        if(this.b) {
            return;
        }
        if(futd.a) {
            this.d.w(false, true);
        }
        this.L(new fuuv(this.d));
    }

    protected double k() {
        return 35.0;
    }

    protected long l() {
        return this.m() == null ? 3200000000L : this.m().a;
    }

    protected abstract fusr m();

    protected abstract String n();

    protected final void o(ActivityRecognitionResult activityRecognitionResult0) {
        if(this.d.X) {
            for(Object object0: activityRecognitionResult0.a) {
                this.c.put(Integer.valueOf(((DetectedActivity)object0).a()), Integer.valueOf(((DetectedActivity)object0).e));
            }
        }
    }

    protected final void p() {
        futd futd0 = this.d;
        if(futd0.C() && this.C()) {
            this.L(new fuux(futd0));
            return;
        }
        this.L(new fuuv(futd0));
    }

    protected void q(long v) {
        throw null;
    }

    protected void r() {
        if(this.b) {
            return;
        }
        if(futd.a) {
            this.d.w(false, true);
        }
        this.L(new fuuv(this.d));
    }

    protected void s() {
        futd futd0 = this.d;
        long v = SystemClock.elapsedRealtime();
        futd0.R = v;
        futd0.S = v;
        futd0.U = v;
    }

    protected void t() {
        futd futd0 = this.d;
        fusr fusr0 = this.m();
        int v = futd0.m.a ? futd0.m.i : 1;
        String s = this.n();
        this.h.a(new fute(this.h.f(), s.hashCode(), v, s, v));
        SystemClock.elapsedRealtime();
        fusy fusy0 = this.g();
        long v1 = this.l();
        int v2 = this.h();
        double f = this.k();
        fwyc fwyc0 = futd0.J.c;
        fuww fuww0 = futd0.M() ? futd0.A : null;
        fuzj fuzj0 = futd0.f();
        boolean z = futd0.L != null && futd0.L.f.a > 0 && humi.b() > 0L;
        boolean z1 = futd0.I();
        if(fusy0.a) {
            return;
        }
        fusy0.d = fusr0;
        fusy0.e = this;
        fusy0.c = v1;
        fusy0.l = f;
        fusy0.g = fuww0;
        fusy0.h = null;
        fusy0.j = fuzj0;
        fusy0.f = z;
        fusy0.i = z1;
        fusy0.a = true;
        HashMap hashMap0 = new HashMap();
        hashMap0.put(fvns.d, Integer.valueOf(1));
        hashMap0.put(fvns.k, Integer.valueOf(3));
        fusy0.b = fusy0.e(hashMap0, v2, v1, fwyc0, z1);
        fusy0.b.b();
    }

    @Override  // fuvb
    public final void u() {
        super.u();
        this.d.i();
        fusr fusr0 = this.m();
        if(fusr0 != null) {
            fusr0.d();
        }
        this.t();
    }

    @Override  // fuvb
    public void v() {
        gged_interceptors gged0;
        super.v();
        if(this.d.X) {
            Map map0 = this.c;
            if(!map0.isEmpty()) {
                long v = this.k;
                if(v != -1L) {
                    long v1 = this.l;
                    ArrayList arrayList0 = new ArrayList(map0.size());
                    for(Object object0: map0.entrySet()) {
                        arrayList0.add(new DetectedActivity(((int)(((Integer)((Map.Entry)object0).getKey()))), ((int)(((Integer)((Map.Entry)object0).getValue())))));
                    }
                    Collections.sort(arrayList0, DetectedActivity.a);
                    ActivityRecognitionResult activityRecognitionResult0 = new ActivityRecognitionResult(arrayList0, v, v1);
                    long v2 = this.k;
                    long v3 = this.l;
                    Map map1 = this.a;
                    fwqt fwqt0 = ((fwvn)this.f).t;
                    synchronized(fwqt0.s) {
                        gged0 = fwqt0.s.n;
                    }
                    if(!gged0.isEmpty() && !map1.isEmpty()) {
                        Parcel parcel0 = Parcel.obtain();
                        parcel0.writeLong(v2);
                        parcel0.writeLong(v3);
                        parcel0.writeInt(map1.size());
                        for(Object object1: map1.entrySet()) {
                            fvns fvns0 = (fvns)((Map.Entry)object1).getKey();
                            fvsf fvsf0 = (fvsf)((Map.Entry)object1).getValue();
                            int v4 = fvsf0.b();
                            parcel0.writeInt(fvns0.z);
                            int v5 = fvsf0.c;
                            parcel0.writeInt(v5);
                            parcel0.writeInt(v4);
                            long[] arr_v = new long[v5];
                            float[] arr_f = new float[v5 * v4];
                            for(int v6 = 0; v6 < v5; ++v6) {
                                arr_v[v6] = fvsf0.d(v6) - fvsf0.d(0);
                                for(int v7 = 0; v7 < v4; ++v7) {
                                    arr_f[v6 * v4 + v7] = fvsf0.a(v6, v7);
                                }
                            }
                            parcel0.writeLongArray(arr_v);
                            parcel0.writeFloatArray(arr_f);
                        }
                        byte[] arr_b = parcel0.marshall();
                        parcel0.recycle();
                        int v8 = ((ggna)gged0).c;
                        for(int v9 = 0; v9 < v8; ++v9) {
                            fwom fwom0 = (fwom)gged0.get(v9);
                            Intent intent0 = fwoo.t();
                            intent0.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", activityRecognitionResult0);
                            intent0.putExtra("com.google.android.location.internal.EXTRA_SENSOR_DATA_FOR_ACTIVITY", arr_b);
                            fwom0.d(fwqt0.a, intent0);
                        }
                    }
                }
            }
        }
        this.b = true;
        fusy fusy0 = this.g();
        if(fusy0.a) {
            fusy0.a = false;
            fusy0.b.c();
        }
        this.s();
        this.h.g(52);
    }
}

