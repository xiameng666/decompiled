import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.WifiScan;
import com.google.android.gms.semanticlocation.InputPlaceCandidate;
import com.google.android.gms.semanticlocation.InputSignals;
import com.google.android.gms.semanticlocation.RtslDebugData;
import java.util.List;

public final class elvm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Location location0 = null;
        WifiScan wifiScan0 = null;
        List list0 = null;
        List list1 = null;
        RtslDebugData rtslDebugData0 = null;
        int v1 = 0;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    location0 = (Location)baua.m(parcel0, v3, Location.CREATOR);
                    break;
                }
                case 4: {
                    wifiScan0 = (WifiScan)baua.m(parcel0, v3, WifiScan.CREATOR);
                    break;
                }
                case 5: {
                    list0 = baua.y(parcel0, v3, ActivityRecognitionResult.CREATOR);
                    break;
                }
                case 6: {
                    list1 = baua.y(parcel0, v3, InputPlaceCandidate.CREATOR);
                    break;
                }
                case 7: {
                    rtslDebugData0 = (RtslDebugData)baua.m(parcel0, v3, RtslDebugData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new InputSignals(v2, v1, location0, wifiScan0, list0, list1, rtslDebugData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InputSignals[v];
    }
}

