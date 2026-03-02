import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.Location;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class fvnu implements fvnn {
    final Map a;
    Map b;
    private long c;
    private long d;
    private final long e;
    private final long f;
    private boolean g;
    private final fvlt h;

    public fvnu(fvlt fvlt0, fvlh fvlh0) {
        this.c = 0L;
        this.d = 0L;
        this.a = new EnumMap(fvns.class);
        this.b = null;
        this.g = false;
        this.h = fvlt0;
        this.e = fvlh0 == null ? fvlg.a.d : ((RealCollectorConfig)fvlh0).y.d;
        this.f = fvlh0 == null ? fvlg.a.d : ((RealCollectorConfig)fvlh0).z.d;
    }

    @Override  // fvnn
    public final void C(int v, int v1, int v2) {
    }

    @Override  // fvnn
    public final void D(int v, int v1) {
    }

    @Override  // fvnn
    public final void E(float f, float f1, float f2, float f3) {
    }

    @Override  // fvnn
    public final void F(fwxv fwxv0, int v, long v1) {
    }

    private final void a(long v, fvns fvns0, float[] arr_f) {
        if(this.g) {
            return;
        }
        Map map0 = this.a;
        fvnt fvnt0 = (fvnt)map0.get(fvns0);
        if(fvnt0 == null) {
            fvnt0 = new fvnt(new ArrayList(), new ArrayList());
            map0.put(fvns0, fvnt0);
        }
        fvnt0.a.add(Long.valueOf(v));
        fvnt0.b.add(arr_f);
    }

    @Override  // fvnn
    public final void b(float f, float f1, float f2, int v, long v1, long v2) {
        if(Math.abs(v1 - this.c) >= this.e) {
            this.c = v1;
            this.a(v1, fvns.d, new float[]{f, f1, f2});
        }
    }

    @Override  // fvnn
    public final void c(int v, long[] arr_v, float[][] arr2_f) {
        if(!this.g) {
            Map map0 = this.b;
            if(map0 == null) {
                map0 = new EnumMap(fvns.class);
                this.b = map0;
            }
            fvns fvns0 = (fvns)RealCollectorConfig.b.get(Integer.valueOf(v));
            if(fvns0 != null) {
                gftb.u(map0.get(fvns0) == null, "Sensor %s is reported more than once in batching collector.", fvns0);
                map0.put(fvns0, new fvsf(arr_v, arr2_f));
            }
        }
    }

    @Override  // fvnn
    public final void d(float f, int v, long v1, long v2) {
        this.a(v1, fvns.i, new float[]{f});
    }

    @Override  // fvnn
    public final void e(int v, int v1, long v2) {
    }

    private static final float f(double f) {
        if((f >= 3.402823E+38)) {
            return 3.402823E+38f;
        }
        return -f >= 3.402823E+38 ? -3.402823E+38f : ((float)f);
    }

    @Override  // fvnn
    public final void g(List list0, long v) {
    }

    @Override  // fvnn
    public final void h(float[] arr_f, long v, int v1) {
    }

    @Override  // fvnn
    public final void i(int v, long v1) {
    }

    @Override  // fvnn
    public final void j(GnssMeasurementsEvent gnssMeasurementsEvent0, long v) {
    }

    @Override  // fvnn
    public final void k(GnssNavigationMessage gnssNavigationMessage0, long v) {
    }

    @Override  // fvnn
    public final void l(jyf jyf0, long v) {
    }

    @Override  // fvnn
    public final void m(float f, float f1, float f2, int v, long v1, long v2) {
        if(Math.abs(v1 - this.d) >= this.f) {
            this.d = v1;
            this.a(v1, fvns.e, new float[]{f, f1, f2});
        }
    }

    @Override  // fvnn
    public final void n(float f, float f1, float f2, float f3, int v, long v1, long v2) {
    }

    @Override  // fvnn
    public final void o(float f, int v, long v1, long v2) {
    }

    @Override  // fvnn
    public final void p(float f, int v, long v1, long v2) {
        this.a(v1, fvns.k, new float[]{f});
    }

    @Override  // fvnn
    public final void q(Location location0, long v) {
    }

    @Override  // fvnn
    public final void r(float f, float f1, float f2, int v, long v1, long v2) {
        this.a(v1, fvns.f, new float[]{f, f1, f2});
    }

    @Override  // fvnn
    public final void s(float f, float f1, float f2, int v, long v1, long v2) {
        this.a(v1, fvns.c, new float[]{f, f1, f2});
    }

    @Override  // fvnn
    public final void t(float f, int v, long v1, long v2) {
        this.a(v1, fvns.l, new float[]{f});
    }

    @Override  // fvnn
    public final void u(double[] arr_f, double[] arr_f1, double[] arr_f2, double[] arr_f3, double[] arr_f4, long v) {
        float[] arr_f5 = new float[arr_f2.length + 44 + arr_f3.length + arr_f4.length];
        for(int v2 = 0; v2 < 4; ++v2) {
            arr_f5[v2] = fvnu.f(arr_f[v2]);
        }
        for(int v3 = 0; v3 < 40; ++v3) {
            arr_f5[v3 + 4] = fvnu.f(arr_f1[v3]);
        }
        for(int v4 = 0; v4 < arr_f2.length; ++v4) {
            arr_f5[v4 + 44] = fvnu.f(arr_f2[v4]);
        }
        for(int v5 = 0; v5 < arr_f3.length; ++v5) {
            arr_f5[arr_f2.length + 44 + v5] = fvnu.f(arr_f3[v5]);
        }
        for(int v1 = 0; v1 < arr_f4.length; ++v1) {
            arr_f5[arr_f2.length + 44 + arr_f3.length + v1] = fvnu.f(arr_f4[v1]);
        }
        this.a(v * 1000000L, fvns.m, arr_f5);
    }

    @Override  // fvnn
    public final void v(float f, int v, long v1, long v2) {
    }

    @Override  // fvnn
    public final void w(float f, float f1, float f2, float f3, float f4, float f5, int v, long v1, long v2) {
        this.a(v1, fvns.j, new float[]{f, f1, f2, f3, f4, f5});
    }

    @Override  // fvnn
    public final void x(long v, List list0, long v1, List list1) {
    }

    @Override  // fvnn
    public final void y() {
        if(this.g) {
            return;
        }
        this.g = true;
        if(this.b != null && !this.b.isEmpty()) {
            this.h.k(this.b);
            return;
        }
        EnumMap enumMap0 = new EnumMap(fvns.class);
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            int v = ((fvnt)map$Entry0.getValue()).a.size();
            int v1 = ((fvns)map$Entry0.getKey()).D;
            long[] arr_v = new long[v];
            float[][] arr2_f = new float[v1][v];
            for(int v2 = 0; v2 < v; ++v2) {
                arr_v[v2] = (long)(((Long)((fvnt)map$Entry0.getValue()).a.get(v2)));
                for(int v3 = 0; v3 < v1; ++v3) {
                    float[] arr_f = arr2_f[v3];
                    arr_f[v2] = ((float[])((fvnt)map$Entry0.getValue()).b.get(v2))[v3];
                }
            }
            fvsf fvsf0 = new fvsf(arr_v, arr2_f);
            enumMap0.put(((fvns)map$Entry0.getKey()), fvsf0);
        }
        this.h.k(enumMap0);
    }
}

