import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public final class futs implements fuui {
    static final long a;
    private static final long b;
    private final fuws c;
    private final float[][] d;
    private final long[] e;
    private final float[] f;
    private int g;
    private long h;

    static {
        futs.a = TimeUnit.SECONDS.toMillis(90L);
        futs.b = TimeUnit.SECONDS.toMillis(4L);
    }

    public futs(ByteBuffer byteBuffer0, int v, boolean z) {
        this.d = new float[18][7];
        this.e = new long[18];
        this.g = -1;
        this.h = -1L;
        this.f = new float[6];
        this.c = new fuws(byteBuffer0, v, z);
    }

    @Override  // fuui
    public final ActivityRecognitionResult a(TreeMap treeMap0, long v, long v1, long v2, Bundle bundle0) {
        int v7;
        if(!treeMap0.isEmpty()) {
            if(Long.compare(v, this.h + futs.a) > 0) {
                this.g = -1;
            }
            else if(((long)(((Long)treeMap0.lastKey()))) == this.e[this.g]) {
                return new ActivityRecognitionResult(fuwb.f(fuwb.e(this.f)), v1, v2, fuxl.ae.am, bundle0);
            }
            for(Object object0: treeMap0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                long v3 = (long)(((Long)map$Entry0.getKey()));
                int v4 = this.g;
                if(v4 != -1 && v3 <= this.e[v4]) {
                    continue;
                }
                this.g = (v4 + 1) % 18;
                List list0 = (List)map$Entry0.getValue();
                int v5 = this.c.b;
                float[] arr_f = new float[v5];
                int v6 = 0;
                for(Object object1: list0) {
                    DetectedActivity detectedActivity0 = (DetectedActivity)object1;
                    switch(detectedActivity0.a()) {
                        case 1: {
                            v7 = 0;
                            break;
                        }
                        case 3: {
                            v7 = 5;
                            break;
                        }
                        case 4: {
                            v7 = 6;
                            break;
                        }
                        case 7: {
                            v7 = 2;
                            break;
                        }
                        case 8: {
                            v7 = 1;
                            break;
                        }
                        case 16: {
                            v7 = 3;
                            break;
                        }
                        case 17: {
                            v7 = 4;
                            break;
                        }
                        default: {
                            v7 = -1;
                        }
                    }
                    if(v7 >= 0 && v7 < v5) {
                        arr_f[v7] = (float)detectedActivity0.e;
                        v6 = 1;
                    }
                }
                if(1 != v6) {
                    arr_f = null;
                }
                if(arr_f != null) {
                    System.arraycopy(arr_f, 0, this.d[this.g], 0, arr_f.length);
                    this.e[this.g] = v3;
                    this.h = v;
                    continue;
                }
                return null;
            }
            long[] arr_v = this.e;
            long v8 = arr_v[this.g];
            fuws fuws0 = this.c;
            fuws0.d();
            float[] arr_f1 = null;
            for(int v9 = 0; v9 < 18; ++v9) {
                int v10 = (this.g - v9 + 18) % 18;
                if(arr_v[v10] < v8 - futs.b) {
                    break;
                }
                arr_f1 = fuws0.e(this.d[v10]);
                v8 = arr_v[v10];
            }
            fuws0.c(arr_f1);
            System.arraycopy(arr_f1, 0, this.f, 0, arr_f1.length);
            return new ActivityRecognitionResult(fuwb.f(fuwb.e(arr_f1)), v1, v2, fuxl.ae.am, bundle0);
        }
        return null;
    }

    @Override  // fuui
    public final ActivityRecognitionResult b(ActivityRecognitionResult activityRecognitionResult0) {
        throw new UnsupportedOperationException();
    }

    @Override  // fuui
    public final void c() {
    }

    @Override  // fuui
    public final void d() {
    }
}

