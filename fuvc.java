import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Collections;

public final class fuvc extends fusr {
    public fuvc() {
        super(400000000L);
    }

    @Override  // fusr
    public final fvuv b(long v, long v1, fvsf fvsf0) {
        int v2;
        fuwh fuwh0 = this.b;
        if(fuwh0 == null) {
            int v3 = fvsf0.c;
            int v4 = fuvc.a(fvsf0, v3 - 1, 400000000L);
            if(v4 == -1) {
                return new fvuv(fusv.c(v3), null, Collections.EMPTY_LIST);
            }
            fvsf fvsf1 = fvsf0.e(v4, v3 - v4);
            int v5 = fvsf1.c;
            double[] arr_f = new double[v5];
            int v6 = fvsf1.b();
            for(int v7 = 0; v7 < v5; ++v7) {
                double f = 0.0;
                for(int v8 = 0; v8 < v6; ++v8) {
                    double f1 = (double)fvsf1.a(v7, v8);
                    f += f1 * f1;
                }
                arr_f[v7] = Math.sqrt(f);
            }
            double f2 = 4.900000E-324;
            double f3 = 1.797693E+308;
            for(int v9 = 0; v9 < v5; ++v9) {
                double f4 = arr_f[v9];
                if((f4 < f3)) {
                    f3 = f4;
                }
                if((f4 > f2)) {
                    f2 = f4;
                }
            }
            v2 = f2 - f3 < 1.0 ? 3 : 4;
        }
        else if(fuwh0 == fuwh.f) {
            v2 = 3;
        }
        else {
            v2 = 4;
        }
        ActivityRecognitionResult activityRecognitionResult0 = new ActivityRecognitionResult(new DetectedActivity(v2, 100), v, v1, fuxl.B.am, null);
        this.c = false;
        return new fvuv(fusv.a, activityRecognitionResult0, Collections.EMPTY_LIST);
    }
}

