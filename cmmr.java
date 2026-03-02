import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.List;

public final class cmmr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        Bundle bundle0 = null;
        int v1 = 0;
        long v2 = 0L;
        long v3 = 0L;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    list0 = baua.y(parcel0, v4, DetectedActivity.CREATOR);
                    break;
                }
                case 2: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 3: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 5: {
                    bundle0 = baua.j(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new ActivityRecognitionResult(list0, v2, v3, v1, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ActivityRecognitionResult[v];
    }
}

