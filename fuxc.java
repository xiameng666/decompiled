import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

public final class fuxc {
    public static fuxg a(ActivityRecognitionResult activityRecognitionResult0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: activityRecognitionResult0.a) {
            arrayList0.add(fuxd.b(((DetectedActivity)object0)));
        }
        long v = activityRecognitionResult0.b;
        long v1 = activityRecognitionResult0.c;
        int v2 = activityRecognitionResult0.d;
        int v3 = cmmq.c(activityRecognitionResult0.b());
        Bundle bundle0 = activityRecognitionResult0.b();
        if(bundle0 == null) {
            return new fuxg(arrayList0, v, v1, v2, v3, null);
        }
        Bundle bundle1 = bundle0.getBundle("test_ar_models");
        return new fuxg(arrayList0, v, v1, v2, v3, new fuxf(bundle0.getLong("test_sensor_lag", -1L), fuxb.a(bundle1, "test_ar_model_1"), fuxb.a(bundle1, "test_ar_model_2")));
    }
}

