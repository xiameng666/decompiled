import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.List;

public final class fuxb {
    public static fuxe a(Bundle bundle0, String s) {
        if(bundle0 != null) {
            Parcelable[] arr_parcelable = bundle0.getParcelableArray(s);
            if(arr_parcelable != null && arr_parcelable.length != 0) {
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < arr_parcelable.length; ++v) {
                    Parcelable parcelable0 = arr_parcelable[v];
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object0: ((ActivityRecognitionResult)parcelable0).a) {
                        arrayList1.add(fuxd.b(((DetectedActivity)object0)));
                    }
                    arrayList0.add(arrayList1);
                }
                return new fuxe(((ActivityRecognitionResult)arr_parcelable[0]).d, arrayList0);
            }
        }
        return null;
    }

    public static ActivityRecognitionResult[] b(fuxe fuxe0) {
        List list0 = fuxe0.b;
        ActivityRecognitionResult[] arr_activityRecognitionResult = new ActivityRecognitionResult[list0.size()];
        for(int v = 0; v < list0.size(); ++v) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ((List)list0.get(v))) {
                arrayList0.add(fuxd.a(((fuxi)object0)));
            }
            arr_activityRecognitionResult[v] = new ActivityRecognitionResult(arrayList0, 1L, 1L, fuxe0.a, null);
        }
        return arr_activityRecognitionResult;
    }
}

