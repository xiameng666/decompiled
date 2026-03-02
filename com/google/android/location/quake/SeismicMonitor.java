package com.google.android.location.quake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import bbcu;
import bboh;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import fuwr;
import fvrw;
import fvsf;
import fxgu;
import fxgw;
import fxgy;
import fxnw;
import gxnr;
import gxns;
import gxnt;
import gxnu;
import gxnv;
import gxnw;
import gxnx;
import gxnz;
import huwd;
import j..util.Optional;
import java.util.concurrent.TimeUnit;

public class SeismicMonitor extends TracingSensorEventListener {
    public final Context a;
    public final gxnz b;
    public Optional c;
    public SensorManager d;
    public HandlerThread e;
    private final fxnw f;
    private final gxnw g;
    private final fxgw h;

    static {
        bboh.c("EQMon", bbcu.g, "SeisMon");
    }

    public SeismicMonitor(Context context0, fxgw fxgw0, fxnw fxnw0, gxnz gxnz0, gxnw gxnw0) {
        super("SeismicMonitor", "location");
        this.c = Optional.empty();
        this.a = context0;
        this.h = fxgw0;
        this.f = fxnw0;
        this.b = gxnz0;
        this.g = gxnw0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        int v29;
        boolean z6;
        double f25;
        double f24;
        double f23;
        boolean z5;
        boolean z4;
        gxnx gxnx1;
        boolean z3;
        double f19;
        boolean z2;
        boolean z1;
        int v14;
        gxnt gxnt1;
        double[][] arr2_f4;
        double[][] arr2_f3;
        double[][] arr2_f2;
        fvsf fvsf0;
        try {
            gxnz gxnz0 = this.b;
            long v = sensorEvent0.timestamp;
            synchronized(gxnz0.g) {
                gxnz0.a.f(v, sensorEvent0.values);
            }
            long v2 = gxnz0.h;
            if(v2 == -1L) {
                gxnz0.h = v;
                v2 = v;
            }
            gxns gxns0 = null;
            if(Long.compare(v - v2, gxnz0.b) >= 0) {
                fvrw fvrw0 = gxnz0.a;
                int v3 = fvrw0.c(v - gxnz0.c);
                if(v3 != -1) {
                    gxnz0.h = v;
                    int v4 = fvrw0.c - v3;
                    long[] arr_v = new long[v4];
                    float[][] arr2_f = new float[3][v4];
                    for(int v5 = 0; v5 < v4; ++v5) {
                        int v6 = v3 + v5;
                        arr_v[v5] = fvrw0.d(v6);
                        float[] arr_f = arr2_f[0];
                        arr_f[v5] = fvrw0.a(v6, 0);
                        float[] arr_f1 = arr2_f[1];
                        arr_f1[v5] = fvrw0.a(v6, 1);
                        float[] arr_f2 = arr2_f[2];
                        arr_f2[v5] = fvrw0.a(v6, 2);
                    }
                    fvsf0 = new fvsf(arr_v, arr2_f);
                    goto label_39;
                }
                goto label_35;
            }
            else {
            label_35:
                if(v - gxnz0.i >= gxnz0.d) {
                    gxnz0.i = v;
                    gxnz0.j = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) - v;
                }
                fvsf0 = null;
            }
        label_39:
            if(fvsf0 != null) {
                gxnw gxnw0 = this.g;
                long v7 = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
                gxnt gxnt0 = gxnw0.a;
                if(gxnt0.h) {
                    long v8 = fvsf0.d(0);
                    int v9 = fvsf0.c - 1;
                    long v10 = fvsf0.d(v9);
                    double f = (double)gxnt0.d;
                    double[][] arr2_f1 = fuwr.g(fvsf0, f);
                    int v11 = (int)((((double)v10) - ((double)v8)) / 1000000000.0 * gxnt0.i * f);
                    if(v11 > 0) {
                        long v12 = fvsf0.d(0);
                        if(((int)(((double)(fvsf0.d(v9) - v12)) * (f * 1.000000E-09))) + 1 < v11) {
                            v11 = 1;
                        }
                        arr2_f2 = fuwr.f(fvsf0, f * 1.000000E-09, v11);
                    }
                    else {
                        arr2_f2 = arr2_f1;
                    }
                    v7 = v10;
                    arr2_f3 = arr2_f1;
                }
                else {
                    arr2_f2 = fuwr.g(fvsf0, ((double)gxnt0.d));
                    arr2_f3 = arr2_f2;
                }
                gxnr gxnr0 = new gxnr(v7);
                double f1 = gxnt0.n / gxnt0.o;
                gxns gxns1 = new gxns(v7, f1, true);
                if(gxnw0.b != null && gxnr0.a - gxnw0.b.a > gxnt0.a) {
                    gxnw0.b = null;
                    if(gxnw0.d == null) {
                        gxnw0.c = null;
                    }
                }
                gxnr0.c = fuwr.a(arr2_f2[0]);
                gxnr0.d = fuwr.a(arr2_f2[1]);
                gxnr0.e = fuwr.a(arr2_f2[2]);
                gxnr0.m = fuwr.e(arr2_f2[0]);
                gxnr0.n = fuwr.e(arr2_f2[1]);
                gxnr0.o = fuwr.e(arr2_f2[2]);
                gxnr0.h = Math.toDegrees(Math.atan2(gxnr0.c, Math.sqrt(gxnr0.e * gxnr0.e + 0.01 * gxnr0.d * gxnr0.d) * Math.signum(gxnr0.e)));
                gxnr0.i = Math.toDegrees(Math.atan2(-gxnr0.d, Math.sqrt(gxnr0.c * gxnr0.c + gxnr0.e * gxnr0.e)));
                double f2 = gxnt0.b;
                if(gxnw0.b == null) {
                    gxnt1 = gxnt0;
                    f23 = f2;
                    f25 = f23;
                    f24 = f25;
                    z5 = false;
                    z2 = false;
                    z6 = false;
                }
                else {
                    gxnx gxnx0 = gxnw0.d;
                    if(gxnx0 == null) {
                        arr2_f4 = arr2_f3;
                    }
                    else {
                        gxns gxns2 = gxnx0.b;
                        if(gxns2 == null) {
                            arr2_f4 = arr2_f3;
                        }
                        else {
                            arr2_f4 = arr2_f3;
                            if(v7 - gxns2.a >= gxnx0.a) {
                                gxnx0.a();
                            }
                            else {
                                gxns0 = gxns2;
                            }
                        }
                        gxnw0.c = gxns0;
                        if(gxnw0.c == null) {
                            gxnw0.c = new gxns(v7, f1, true);
                        }
                    }
                    double f3 = gxnw.b(gxnt0, gxnw0.c.f);
                    double f4 = gxnw.b(gxnt0, gxnw0.c.e);
                    double f5 = gxnw.b(gxnt0, gxnw0.c.g);
                    double f6 = (f4 + f3 + f5) / 3.0;
                    gxnr0.j = Math.abs(gxnw0.b.c - gxnr0.c);
                    gxnr0.k = Math.abs(gxnw0.b.d - gxnr0.d);
                    gxnr0.l = Math.abs(gxnw0.b.e - gxnr0.e);
                    gxnr0.f = gxnw0.b.h;
                    gxnr0.g = gxnw0.b.i;
                    gxnt1 = gxnt0;
                    double f7 = gxnt1.e;
                    if(gxnw.c(arr2_f4) && (f7 >= 0.0) && (f7 <= 1.0)) {
                        gxns gxns3 = gxnw0.c;
                        gxns1.b = gxns3.b;
                        gxns1.c = gxns3.c;
                        gxns1.d = gxns3.d;
                        boolean z = false;
                        for(int v13 = 0; true; ++v13) {
                            double[] arr_f3 = arr2_f4[0];
                            if(v13 >= arr_f3.length) {
                                break;
                            }
                            double f8 = arr_f3[v13] * f7 + gxns1.b * (1.0 - f7);
                            gxns1.b = f8;
                            double f9 = f8;
                            double f10 = arr2_f4[1][v13] * f7 + gxns1.c * (1.0 - f7);
                            gxns1.c = f10;
                            double f11 = f10;
                            double f12 = arr2_f4[2][v13] * f7 + (1.0 - f7) * gxns1.d;
                            gxns1.d = f12;
                            if(!z) {
                                double f13 = gxnw0.b.c;
                                double f14 = gxnw0.b.d;
                                double f15 = gxnw0.b.e;
                                double f16 = Math.sqrt(f9 * f9 + f11 * f11 + f12 * f12) * Math.sqrt(f13 * f13 + f14 * f14 + f15 * f15);
                                if((f16 <= 2.225074E-308 ? 0.0 : Math.toDegrees(Math.acos((f13 * f9 + f11 * f14 + f15 * f12) / f16))) <= gxnt1.f) {
                                    z = false;
                                    continue;
                                }
                            }
                            z = true;
                        }
                        v14 = z ? gxnt1.g : Math.max(0, gxnw0.b.b - 1);
                    }
                    else {
                        v14 = Math.max(0, gxnw0.b.b - 1);
                    }
                    gxnr0.b = v14;
                    if(!gxnt1.s) {
                        z1 = (gxnr0.m > f4 || gxnr0.n > f3 || gxnr0.o > f5) && (gxnr0.j < gxnt1.c && gxnr0.k < gxnt1.c && gxnr0.l < gxnt1.c && v14 == 0);
                    }
                    else if(gxnr0.m <= f4 && gxnr0.n <= f3 && gxnr0.o <= f5 || (gxnr0.j >= gxnt1.c || gxnr0.k >= gxnt1.c || gxnr0.l >= gxnt1.c)) {
                        z1 = false;
                    }
                    else {
                        z1 = true;
                    }
                    z2 = false;
                    if(z1 && gxnw.c(arr2_f2)) {
                        for(int v15 = 0; true; ++v15) {
                            double[] arr_f4 = arr2_f2[0];
                            if(v15 >= arr_f4.length) {
                                break;
                            }
                            if(Math.abs(arr_f4[v15]) > gxnt1.j || Math.abs(arr2_f2[1][v15]) > gxnt1.j || Math.abs(arr2_f2[2][v15]) > gxnt1.j) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    if(z1 && gxnw.c(arr2_f2)) {
                        int v16 = arr2_f2[0].length;
                        int v17 = 0;
                        int v18 = 0;
                        double f17 = 0.0;
                        while(v17 < v16) {
                            double f18 = Math.abs(arr2_f2[0][v17] - gxnr0.c) + Math.abs(arr2_f2[1][v17] - gxnr0.d) + Math.abs(arr2_f2[2][v17] - gxnr0.e);
                            int v19 = Double.compare(f18, f17);
                            if(v19 > 0) {
                                v18 = v17;
                            }
                            if(v19 > 0) {
                                f17 = f18;
                            }
                            ++v17;
                            f3 = f3;
                        }
                        f19 = f3;
                        int v20 = (int)Math.round(gxnt1.l * ((double)gxnt1.d));
                        int v21 = Math.max(0, v18 - v20 + 1);
                        double f20 = 0.0;
                        while(v21 <= v18) {
                            int v22 = Math.min(v16, v21 + v20);
                            int v23 = v21;
                            double f21 = 0.0;
                            while(v23 < v22) {
                                f21 += Math.pow(arr2_f2[0][v23] - gxnr0.c, 2.0) + Math.pow(arr2_f2[1][v23] - gxnr0.d, 2.0) + Math.pow(arr2_f2[2][v23] - gxnr0.e, 2.0);
                                ++v23;
                                gxnx0 = gxnx0;
                                z1 = z1;
                            }
                            f20 = Math.max(f20, f21);
                            ++v21;
                            arr2_f2 = arr2_f2;
                            v18 = v18;
                            v20 = v20;
                            gxnx0 = gxnx0;
                            z1 = z1;
                        }
                        z3 = z1;
                        gxnx1 = gxnx0;
                        double f22 = (gxnr0.m + gxnr0.n + gxnr0.o) * ((double)v16);
                        if((f22 - f20 < f22 * gxnt1.k)) {
                            z4 = 1;
                        }
                        else {
                            goto label_205;
                        }
                    }
                    else {
                        z3 = z1;
                        gxnx1 = gxnx0;
                        f19 = f3;
                    label_205:
                        z4 = false;
                    }
                    gxns1.e = gxnw.a(gxnt1, gxnr0.m, gxnw0.c.e);
                    gxns1.f = gxnw.a(gxnt1, gxnr0.n, gxnw0.c.f);
                    gxns1.g = gxnw.a(gxnt1, gxnr0.o, gxnw0.c.g);
                    if((!gxnw0.c.h || f4 < gxnt1.p || f19 < gxnt1.p) || (f5 < gxnt1.p)) {
                        gxns1.h = false;
                    }
                    if(gxnx1 != null && gxnx1.c) {
                        gxnx1.b = gxns1;
                    }
                    z5 = z4;
                    f23 = f4;
                    f2 = f6;
                    f24 = f5;
                    f25 = f19;
                    z6 = z3;
                }
                gxnw0.b = gxnr0;
                if(gxnw0.d == null) {
                    gxnw0.c = gxns1;
                }
                gxnu gxnu0 = new gxnu();
                gxnu0.e(false);
                gxnu0.f(false);
                gxnu0.h(false);
                gxnu0.g(false);
                gxnu0.a(0.0);
                gxnu0.b(0.0);
                gxnu0.c(0.0);
                gxnu0.d(0.0);
                gxnu0.i = new gxnr(0L);
                gxnu0.j = new gxns(0L, 0.0, false);
                gxnu0.e(z6);
                gxnu0.f(z2);
                gxnu0.h(z5);
                boolean z7 = gxnt1.s && gxnr0.b > 0 ? 1 : false;
                gxnu0.g(z7);
                gxnu0.a(f2);
                gxnu0.b(f23);
                gxnu0.c(f25);
                gxnu0.d(f24);
                gxnu0.i = gxnr0;
                gxnu0.j = gxns1;
                if(gxnu0.k != -1) {
                    goto label_296;
                }
                gxnr gxnr1 = gxnu0.i;
                if(gxnr1 == null) {
                    goto label_296;
                }
                gxns gxns4 = gxnu0.j;
                if(gxns4 == null) {
                    goto label_296;
                }
                gxnv gxnv0 = new gxnv(gxnu0.a, gxnu0.b, gxnu0.c, gxnu0.d, gxnu0.e, gxnu0.f, gxnu0.g, gxnu0.h, gxnr1, gxns4);
                this.c = Optional.of(gxnv0);
                if(gxnv0.a) {
                    long v24 = (long)(((Long)this.h.b.get()));
                    double f26 = gxnv0.i.f;
                    double f27 = gxnv0.i.g;
                    boolean z8 = gxnv0.b;
                    boolean z9 = gxnv0.c;
                    int v25 = (int)(((Integer)this.h.a.get()));
                    long v26 = gxnv0.i.a;
                    long v27 = TimeUnit.NANOSECONDS.toMillis(v26);
                    int v28 = this.h.c.c(v27) ^ 1;
                    fxgy fxgy0 = new fxgy(v24, z8, z9, f26, f27, gxnv0.e, gxnv0.f, gxnv0.g, gxnv0.h, v25, ((boolean)v28));
                    if(fxgy0.a >= 0L && Math.abs(TimeUnit.NANOSECONDS.toMillis(v26) - fxgy0.a) < huwd.a.n().E()) {
                        v29 = 2;
                    }
                    else {
                        huwd huwd0 = huwd.a;
                        if(huwd0.n().an() && z8) {
                            v29 = 4;
                        }
                        else if(huwd0.n().ao() && z9) {
                            v29 = 3;
                        }
                        else if(gxnv0.j.h) {
                            v29 = 5;
                        }
                        else if(huwd.k() == 2L && fxgy0.j == 2) {
                            v29 = 6;
                        }
                        else if(huwd.s() && gxnv0.d) {
                            v29 = 7;
                        }
                        else {
                            v29 = !huwd.A() || !fxgy0.k ? 1 : 8;
                        }
                    }
                    fxgu fxgu0 = new fxgu(v26, fxgy0, v29, gxnv0);
                    this.f.b.e(this.f.a, fxgu0);
                    return;
                label_296:
                    StringBuilder stringBuilder0 = new StringBuilder();
                    if((gxnu0.k & 1) == 0) {
                        stringBuilder0.append(" detected");
                    }
                    if((gxnu0.k & 2) == 0) {
                        stringBuilder0.append(" outlierAccel");
                    }
                    if((gxnu0.k & 4) == 0) {
                        stringBuilder0.append(" spike");
                    }
                    if((gxnu0.k & 8) == 0) {
                        stringBuilder0.append(" pickup");
                    }
                    if((gxnu0.k & 16) == 0) {
                        stringBuilder0.append(" accelVarianceAverageThresholdM2s4");
                    }
                    if((gxnu0.k & 0x20) == 0) {
                        stringBuilder0.append(" accelVarianceXThresholdM2s4");
                    }
                    if((gxnu0.k & 0x40) == 0) {
                        stringBuilder0.append(" accelVarianceYThresholdM2s4");
                    }
                    if((gxnu0.k & 0x80) == 0) {
                        stringBuilder0.append(" accelVarianceZThresholdM2s4");
                    }
                    if(gxnu0.i == null) {
                        stringBuilder0.append(" accelFeatures");
                    }
                    if(gxnu0.j == null) {
                        stringBuilder0.append(" adaptiveDetectionParameters");
                    }
                    throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
                }
            }
        }
        catch(NullPointerException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }
}

