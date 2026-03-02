import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.location.internal.server.PendingIntentActivityRecognitionRequest;

public final class fwpm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        ActivityRecognitionRequest activityRecognitionRequest0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    activityRecognitionRequest0 = (ActivityRecognitionRequest)baua.m(parcel0, v1, ActivityRecognitionRequest.CREATOR);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PendingIntentActivityRecognitionRequest(activityRecognitionRequest0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PendingIntentActivityRecognitionRequest[v];
    }
}

