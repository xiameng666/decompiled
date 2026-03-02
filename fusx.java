import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import j..util.Objects;
import java.util.List;
import java.util.Map;

public abstract class fusx implements fvlt {
    final fusy a;

    protected fusx(fusy fusy0) {
        Objects.requireNonNull(fusy0);
        this.a = fusy0;
        super();
    }

    protected final fusv a(long v, long v1, fvsf fvsf0) {
        int v6;
        Object object4;
        Object object3;
        fusy fusy0 = this.a;
        fvuv fvuv0 = fusy0.d.b(v, v1, fvsf0);
        Object object0 = fvuv0.a;
        Object object1 = fvuv0.b;
        Object object2 = fvuv0.c;
        fusv fusv0 = (fusv)object0;
        if(fusv0.b == 0 && fusv0.a() == 0x7FFFFFFFFFFFFFFFL) {
            int v2 = fvsf0.c;
            int v3 = v2 - 1;
            long v4 = fvsf0.d(v3) - 3200000000L;
            double[] arr_f = new double[3];
            int v5 = 0;
            while(true) {
                if(v3 >= v2 || v3 < 0) {
                    object3 = object2;
                    object4 = object1;
                    v6 = v5;
                    break;
                }
                if(fvsf0.d(v3) < v4) {
                    object3 = object2;
                    object4 = object1;
                    v6 = v5;
                    break;
                }
                arr_f[0] += (double)fvsf0.a(v3, 0);
                arr_f[1] += (double)fvsf0.a(v3, 1);
                arr_f[2] += (double)fvsf0.a(v3, 2);
                ++v5;
                --v3;
                object0 = object0;
                object1 = object1;
                object2 = object2;
            }
            arr_f[0] /= (double)v6;
            arr_f[1] /= (double)v6;
            arr_f[2] /= (double)v6;
            fuvf fuvf0 = fusy0.k;
            double f = fusy0.l;
            ActivityRecognitionResult activityRecognitionResult0 = null;
            if(Long.compare(v1, fuvf0.c) > 0) {
                double[] arr_f1 = fuvf0.a;
                if(arr_f1 != null) {
                    fyax fyax0 = new fyax(arr_f);
                    fyax fyax1 = new fyax(arr_f1);
                    double f1 = fyax0.a() * fyax1.a();
                    if((Math.toDegrees(Math.acos((fyax0.a * fyax1.a + fyax0.b * fyax1.b + fyax0.c * fyax1.c) / f1)) >= f)) {
                        long v7 = v - (v - fuvf0.b) / 2L;
                        long v8 = v1 - (v1 - fuvf0.c) / 2L;
                        activityRecognitionResult0 = new ActivityRecognitionResult(new DetectedActivity(5, 100), v7, v8, fuxl.o.am, null);
                    }
                }
                fuvf0.a = arr_f;
                fuvf0.b = v;
                fuvf0.c = v1;
            }
            if(activityRecognitionResult0 != null) {
                fusy.b(fusy0.p, activityRecognitionResult0, false);
                fusy0.e.c(activityRecognitionResult0);
            }
        }
        else {
            object3 = object2;
            object4 = object1;
        }
        for(Object object5: ((List)object3)) {
            fusy0.e.d(((ActivityRecognitionResult)object5));
            fusy.b(fusy0.p, ((ActivityRecognitionResult)object5), false);
        }
        if(object4 != null) {
            fusy0.e.X(((ActivityRecognitionResult)object4));
        }
        return fusv0;
    }

    @Override  // fvlt
    public final void b() {
    }

    @Override  // fvlt
    public final void c() {
    }

    @Override  // fvlt
    public final void d(String s) {
        fusy fusy0 = this.a;
        if(!fusy0.a) {
            return;
        }
        fusy0.a = false;
        fusy0.e.b(fusv.b(s));
    }

    @Override  // fvlt
    public final void e(int v, String s) {
    }

    @Override  // fvlt
    public final void f(int v, String s, String s1) {
    }

    @Override  // fvlt
    public final void g(gwvi gwvi0) {
    }

    @Override  // fvlt
    public final void h(int v, gwvi gwvi0) {
    }

    @Override  // fvlt
    public final void i() {
    }

    @Override  // fvlt
    public final void j(fvob fvob0) {
    }

    @Override  // fvlt
    public final void k(Map map0) {
        fusy fusy0 = this.a;
        if(!fusy0.a) {
            return;
        }
        fusy0.a = false;
        long v = fusy0.o.c();
        long v1 = SystemClock.elapsedRealtime();
        fvsf fvsf0 = (fvsf)map0.get(fvns.d);
        fvsf fvsf1 = (fvsf)map0.get(fvns.k);
        fvsf fvsf2 = (fvsf)map0.get(fvns.m);
        if(fvsf0 == null) {
            fvsf0 = fvsf.a;
        }
        if(fvsf1 == null) {
            fvsf1 = fvsf.a;
        }
        this.m(v, v1, fvsf0, fvsf1);
    }

    protected final void l(long v, long v1, fvsf fvsf0) {
        float f12;
        int v4;
        double[][] arr2_f1;
        double[][] arr2_f = fuwr.g(fvsf0, 50.0);
        double[] arr_f = arr2_f[0];
        double[] arr_f1 = arr2_f[1];
        double[] arr_f2 = arr2_f[2];
        double[] arr_f3 = new double[arr_f.length];
        double[] arr_f4 = new double[arr_f.length];
        for(int v2 = 0; v2 < arr_f.length; ++v2) {
            arr_f3[v2] = Math.abs(arr_f[v2]) + Math.abs(arr_f1[v2]) + Math.abs(arr_f2[v2]);
            double f = arr_f[v2];
            double f1 = arr_f1[v2];
            double f2 = arr_f2[v2];
            arr_f4[v2] = Math.sqrt(f * f + f1 * f1 + f2 * f2);
        }
        fuwy fuwy0 = new fuwy();
        double f3 = fuwr.a(arr_f);
        double f4 = fuwr.a(arr_f1);
        double f5 = fuwr.a(arr_f2);
        double f6 = fuwr.a(arr_f3);
        double f7 = fuwr.a(arr_f4);
        fuwy0.a = (float)f3;
        fuwy0.b = (float)f4;
        fuwy0.c = (float)f5;
        fuwy0.d = (float)f6;
        fuwy0.e = (float)f7;
        double f8 = fuwr.b(arr_f) - f3 * f3;
        double f9 = fuwr.b(arr_f1) - f4 * f4;
        double f10 = fuwr.b(arr_f2) - f5 * f5;
        double f11 = fuwr.b(arr_f4) - f7 * f7;
        int v3 = Double.compare(f11, 1.000000E-10);
        if(v3 < 0) {
            arr2_f1 = arr2_f;
            v4 = v3;
            f12 = 0.0f;
        }
        else {
            arr2_f1 = arr2_f;
            v4 = v3;
            f12 = (float)(f8 / f11);
        }
        fuwy0.G = f12;
        fuwy0.H = v4 >= 0 ? ((float)(f9 / f11)) : 0.0f;
        fuwy0.I = v4 >= 0 ? ((float)(f10 / f11)) : 0.0f;
        double f13 = fuwx.b(arr_f, f3);
        double f14 = fuwx.b(arr_f1, f4);
        double f15 = fuwx.b(arr_f2, f5);
        double f16 = fuwx.b(arr_f3, f6);
        double f17 = fuwx.b(arr_f4, f7);
        fuwy0.u = (float)f13;
        fuwy0.v = (float)f14;
        fuwy0.w = (float)f15;
        fuwy0.x = (float)f16;
        fuwy0.y = (float)f17;
        fuwy0.z = Math.abs(f3) < 1.000000E-10 ? 0.0f : ((float)(f13 / f3));
        fuwy0.A = Math.abs(f4) < 1.000000E-10 ? 0.0f : ((float)(f14 / f4));
        fuwy0.B = Math.abs(f5) < 1.000000E-10 ? 0.0f : ((float)(f15 / f5));
        fuwy0.C = f6 < 1.000000E-10 ? 0.0f : ((float)(f16 / f6));
        fuwy0.D = f7 < 1.000000E-10 ? 0.0f : ((float)(f17 / f7));
        fuwy0.p = (float)fuwx.a(arr_f);
        fuwy0.q = (float)fuwx.a(arr_f1);
        fuwy0.r = (float)fuwx.a(arr_f2);
        fuwy0.s = (float)fuwx.a(arr_f3);
        fuwy0.t = (float)fuwx.a(arr_f4);
        fuwy0.k = fuwx.d(arr_f);
        fuwy0.l = fuwx.d(arr_f1);
        fuwy0.m = fuwx.d(arr_f2);
        fuwy0.n = fuwx.d(arr_f3);
        fuwy0.o = fuwx.d(arr_f4);
        fuwy0.f = fuwx.c(arr_f, f3);
        fuwy0.g = fuwx.c(arr_f1, f4);
        fuwy0.h = fuwx.c(arr_f2, f5);
        fuwy0.i = fuwx.c(arr_f3, f6);
        fuwy0.j = fuwx.c(arr_f4, f7);
        int v5 = arr2_f1[0].length % 5;
        int v6 = (arr2_f1[0].length - v5) / 5;
        double[][] arr2_f2 = new double[v6][3];
        double[] arr_f5 = new double[5];
        for(int v7 = 0; v7 < v6; ++v7) {
            double[] arr_f6 = arr2_f2[v7];
            for(int v8 = 0; v8 < 3; ++v8) {
                System.arraycopy(arr2_f1[v8], v7 * 5 + v5, arr_f5, 0, 5);
                arr_f6[v8] = fuwr.a(arr_f5);
            }
        }
        if(arr2_f2.length <= 1) {
            fuwy0.E = 1.0f;
            fuwy0.F = 1.0f;
        }
        else {
            double[] arr_f7 = new double[arr2_f2.length - 1];
            for(int v9 = 0; v9 < arr2_f2.length - 1; ++v9) {
                double[] arr_f8 = arr2_f2[v9];
                double[] arr_f9 = arr2_f2[v9 + 1];
                double f18 = 0.0;
                for(int v10 = 0; v10 < arr_f8.length; ++v10) {
                    f18 += arr_f8[v10] * arr_f9[v10];
                }
                arr_f7[v9] = f18 / Math.sqrt(fuwr.d(arr_f8) * fuwr.d(arr_f9));
            }
            double f19 = fuwr.a(arr_f7);
            fuwy0.E = (float)f19;
            fuwy0.F = (float)(fuwr.b(arr_f7) - f19 * f19);
        }
        ActivityRecognitionResult activityRecognitionResult0 = new ActivityRecognitionResult(fusr.c(this.a.g.a.a(fuwy0)), v, v1, fuxl.q.am, null);
        ActivityRecognitionResult activityRecognitionResult1 = this.a.f ? new ActivityRecognitionResult(fusr.c(this.a.g.b.a(fuwy0)), v, v1, fuxl.r.am, null) : null;
        this.a.e.f(activityRecognitionResult0, new fuxa(fuwy0), activityRecognitionResult1);
    }

    protected abstract void m(long arg1, long arg2, fvsf arg3, fvsf arg4);
}

