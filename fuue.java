import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public final class fuue implements fuui {
    private int a;
    private fuws b;
    private final fuws c;
    private final fuws d;
    private int[] e;
    private final int[] f;
    private final int[] g;
    private int h;
    private final float[] i;
    private long j;
    private long k;
    private int l;
    private int m;
    private int n;
    private int o;
    private Bundle p;
    private final boolean q;
    private final boolean r;
    private final boolean s;

    public fuue(ByteBuffer byteBuffer0, String s, ByteBuffer byteBuffer1, String s1, String s2, int v, boolean z, boolean z1, boolean z2, boolean z3) {
        this.h = 0;
        this.j = 0L;
        this.k = 0L;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = null;
        this.c = new fuws(byteBuffer0, v, z);
        this.d = new fuws(byteBuffer1, v, z);
        this.f = new int[6];
        this.g = new int[6];
        String[] arr_s = s.split(":", -1);
        String[] arr_s1 = s1.split(":", -1);
        for(int v2 = 0; v2 < 6; ++v2) {
            this.f[v2] = Integer.parseInt(arr_s[v2]);
            this.g[v2] = Integer.parseInt(arr_s1[v2]);
        }
        this.i = new float[6];
        String[] arr_s2 = s2.split(":", -1);
        for(int v1 = 0; v1 < 6; ++v1) {
            this.i[v1] = Float.parseFloat(arr_s2[v1]);
        }
        this.b = this.d;
        this.e = this.g;
        this.a = z1 ? fuxl.ab.am : fuxl.ad.am;
        this.q = z1;
        this.r = z2;
        this.s = z3;
    }

    @Override  // fuui
    public final ActivityRecognitionResult a(TreeMap treeMap0, long v, long v1, long v2, Bundle bundle0) {
        return fuuh.a();
    }

    @Override  // fuui
    public final ActivityRecognitionResult b(ActivityRecognitionResult activityRecognitionResult0) {
        float f2;
        float[] arr_f = new float[this.b.b];
        Iterator iterator0 = activityRecognitionResult0.a.iterator();
        int v = 0;
        while(true) {
            int v1 = 2;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            DetectedActivity detectedActivity0 = (DetectedActivity)object0;
            int v2 = detectedActivity0.a();
            switch(v2) {
                case 1: {
                    v1 = 0;
                    break;
                }
                case 3: {
                    v1 = 5;
                    break;
                }
                case 4: {
                    v1 = 6;
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
                    v1 = 1;
                    break;
                }
                default: {
                    v1 = -1;
                    switch(v2) {
                        case 16: {
                            v1 = 3;
                            break;
                        }
                        case 17: {
                            v1 = 4;
                            break;
                        }
                        case 18: {
                            this.n += detectedActivity0.e;
                            break;
                        }
                        case 19: {
                            this.o += detectedActivity0.e;
                            break;
                        }
                        case 20: {
                            this.l += detectedActivity0.e;
                            break;
                        }
                        case 21: {
                            this.m += detectedActivity0.e;
                        }
                    }
                }
            }
            if(v1 >= 0 && v1 < this.b.b) {
                arr_f[v1] = (float)detectedActivity0.e;
                v = 1;
            }
        }
        if(1 != v) {
            arr_f = null;
        }
        if(arr_f != null) {
            int v3 = this.h;
            this.h = v3 + 1;
            if(v3 == 0) {
                this.j = activityRecognitionResult0.b;
                this.k = activityRecognitionResult0.c;
                this.p = activityRecognitionResult0.b();
            }
            float[] arr_f1 = this.b.e(arr_f);
            int v4 = fuwb.d(arr_f1);
            if(arr_f1[v4] <= this.i[v4] && this.h < this.e[v4]) {
                return null;
            }
            this.b.c(arr_f1);
            List list0 = fuwb.e(arr_f1);
            float f = arr_f1[3];
            if((f > 0.0f)) {
                float f1 = 0.33f;
                int v5 = this.n;
                int v6 = this.o;
                int v7 = v5 + v6;
                if(this.r) {
                    if(v7 == 0) {
                        v7 = 0;
                        f2 = 0.33f;
                    }
                    else {
                        f2 = ((float)this.l) / ((float)v7);
                    }
                    float f3 = v7 == 0 ? 0.33f : ((float)this.m) / ((float)v7);
                    if(v7 != 0) {
                        f1 = ((float)v5) / ((float)v7);
                    }
                    fuwb.h(list0, f, new float[]{f2 * f, f3 * f, f1 * f});
                }
                else if(this.s) {
                    float f4 = v7 == 0 ? 0.5f : ((float)v6) / ((float)v7);
                    fuwb.g(list0, new float[]{f * f4, f * (1.0f - f4)});
                }
            }
            int v8 = this.a;
            if(activityRecognitionResult0.d == fuxl.H.am) {
                switch(fuxl.a(this.a).ordinal()) {
                    case 52: {
                        return new ActivityRecognitionResult(fuwb.f(list0), this.j, this.k, fuxl.ah.am, this.p);
                    }
                    case 53: {
                        return new ActivityRecognitionResult(fuwb.f(list0), this.j, this.k, fuxl.ai.am, this.p);
                    }
                    case 54: {
                        return new ActivityRecognitionResult(fuwb.f(list0), this.j, this.k, fuxl.af.am, this.p);
                    }
                    case 55: {
                        return new ActivityRecognitionResult(fuwb.f(list0), this.j, this.k, fuxl.ag.am, this.p);
                    }
                    default: {
                        return new ActivityRecognitionResult(fuwb.f(list0), this.j, this.k, v8, this.p);
                    }
                }
            }
            return new ActivityRecognitionResult(fuwb.f(list0), this.j, this.k, v8, this.p);
        }
        return null;
    }

    @Override  // fuui
    public final void c() {
        this.h = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.c.d();
        this.d.d();
        this.b = this.d;
        this.e = this.g;
        this.a = this.q ? fuxl.ab.am : fuxl.ad.am;
    }

    @Override  // fuui
    public final void d() {
        this.b = this.c;
        this.e = this.f;
        this.a = this.q ? fuxl.aa.am : fuxl.ac.am;
    }
}

