import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.metrics.SafeMetricsContext;
import com.google.android.gms.autofill.service.common.SafeClientState;
import com.google.android.gms.autofill.service.common.SafeDetectionHistory;

public final class aorw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SafeMetricsContext safeMetricsContext0 = null;
        Bundle bundle0 = null;
        String s = null;
        byte[] arr_b = null;
        SafeDetectionHistory safeDetectionHistory0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    safeMetricsContext0 = (SafeMetricsContext)baua.m(parcel0, v1, SafeMetricsContext.CREATOR);
                    break;
                }
                case 2: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 5: {
                    safeDetectionHistory0 = (SafeDetectionHistory)baua.m(parcel0, v1, SafeDetectionHistory.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SafeClientState(safeMetricsContext0, bundle0, s, arr_b, safeDetectionHistory0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SafeClientState[v];
    }
}

