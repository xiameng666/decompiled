import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public abstract class fusy {
    protected boolean a;
    public fvnb b;
    protected long c;
    protected fusr d;
    protected fusw e;
    protected boolean f;
    protected fuww g;
    protected fuuk h;
    protected boolean i;
    protected fuzj j;
    public final fuvf k;
    public double l;
    protected final fwxt m;
    protected final fyar n;
    protected final fwyd o;
    protected final fvwz p;

    public fusy(fwxt fwxt0, fyar fyar0, fwyd fwyd0, fvwz fvwz0, fuvf fuvf0) {
        this.a = false;
        this.c = 3200000000L;
        this.m = fwxt0;
        this.n = fyar0;
        this.o = fwyd0;
        this.p = fvwz0;
        this.k = fuvf0;
        this.d = null;
        this.g = null;
        this.h = null;
        this.j = null;
    }

    static double a(fvsf fvsf0) {
        int v = fvsf0.c;
        if(v >= 2) {
            long[] arr_v = new long[15];
            for(int v1 = 0; v1 < 15; ++v1) {
                int v2 = (int)Math.round(((double)v1) * (((double)(v - 2)) / 14.0));
                arr_v[v1] = fvsf0.d(v2 + 1) - fvsf0.d(v2);
            }
            Arrays.sort(arr_v);
            return 1000000000.0 / ((double)arr_v[7]);
        }
        return 0.0;
    }

    public static void b(fvwz fvwz0, ActivityRecognitionResult activityRecognitionResult0, boolean z) {
        DetectedActivity detectedActivity0 = activityRecognitionResult0.e();
        fvwz0.a(new fusu(fvwz0.f(), detectedActivity0.a(), detectedActivity0.e, ((int)z), activityRecognitionResult0, z));
    }

    protected final void c(fvsf fvsf0) {
        ArrayList arrayList0 = new ArrayList(1);
        arrayList0.add(fvsf0);
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.location.internal.SAMPLED_SENSOR");
        intent0.putExtra("accelEvents", arrayList0);
        Intent intent1 = intent0.setPackage("com.google.android.gms");
        lvj.a(this.n.a).e(intent1);
    }

    protected static void d(fvsf fvsf0, fvsf fvsf1) {
        fusy.h(fvsf0);
        fusy.h(fvsf1);
    }

    protected abstract fvnb e(Map arg1, int arg2, long arg3, fwyc arg4, boolean arg5);

    protected static final fusv f(fusv fusv0, fusv fusv1) {
        int v = fusv0.b;
        if(v != 2) {
            int v1 = fusv1.b;
            if(v1 == 2) {
                return fusv1;
            }
            if(v != 1) {
                return v1 == 1 ? fusv1 : fusv.d(Math.min(fusv0.a(), fusv1.a()));
            }
        }
        return fusv0;
    }

    static final fvsf g(fvsf fvsf0, long v) {
        int v1 = fvsf0.c;
        if(v1 > 1) {
            int v2 = v1 - 1;
            long v3 = fvsf0.d(v2);
            while(v2 > 0 && v3 - fvsf0.d(v2) < v) {
                long v4 = fvsf0.d(v2) - fvsf0.d(v2 - 1);
                if(v4 <= 0L || v4 > 1000000000L) {
                    break;
                }
                --v2;
            }
            return fvsf0.e(v2, v1 - v2);
        }
        return fvsf0;
    }

    private static void h(fvsf fvsf0) {
        int v = fvsf0.c;
        if(v == 0) {
            return;
        }
        fvsf0.d(0);
        fvsf0.d(v - 1);
    }
}

