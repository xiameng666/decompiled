import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.location.internal.server.PendingIntentSleepSegmentRequest;

public final class fwpo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SleepSegmentRequest sleepSegmentRequest0 = null;
        String s = null;
        boolean z = false;
        WorkSource workSource0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    sleepSegmentRequest0 = (SleepSegmentRequest)baua.m(parcel0, v1, SleepSegmentRequest.CREATOR);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 3: {
                    workSource0 = (WorkSource)baua.m(parcel0, v1, WorkSource.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PendingIntentSleepSegmentRequest(sleepSegmentRequest0, z, workSource0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PendingIntentSleepSegmentRequest[v];
    }
}

