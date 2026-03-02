import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl;
import com.google.android.gms.awareness.snapshot.internal.NetworkStateImpl;
import com.google.android.gms.awareness.snapshot.internal.PowerStateImpl;
import com.google.android.gms.awareness.snapshot.internal.ScreenStateImpl;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;

public final class aqdg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ActivityRecognitionResult activityRecognitionResult0 = null;
        BeaconStateImpl beaconStateImpl0 = null;
        HeadphoneStateImpl headphoneStateImpl0 = null;
        Location location0 = null;
        NetworkStateImpl networkStateImpl0 = null;
        DataHolder dataHolder0 = null;
        PowerStateImpl powerStateImpl0 = null;
        ScreenStateImpl screenStateImpl0 = null;
        WeatherImpl weatherImpl0 = null;
        TimeIntervalsImpl timeIntervalsImpl0 = null;
        ContextData contextData0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    activityRecognitionResult0 = (ActivityRecognitionResult)baua.m(parcel0, v1, ActivityRecognitionResult.CREATOR);
                    break;
                }
                case 3: {
                    beaconStateImpl0 = (BeaconStateImpl)baua.m(parcel0, v1, BeaconStateImpl.CREATOR);
                    break;
                }
                case 4: {
                    headphoneStateImpl0 = (HeadphoneStateImpl)baua.m(parcel0, v1, HeadphoneStateImpl.CREATOR);
                    break;
                }
                case 5: {
                    location0 = (Location)baua.m(parcel0, v1, Location.CREATOR);
                    break;
                }
                case 6: {
                    networkStateImpl0 = (NetworkStateImpl)baua.m(parcel0, v1, NetworkStateImpl.CREATOR);
                    break;
                }
                case 7: {
                    dataHolder0 = (DataHolder)baua.m(parcel0, v1, DataHolder.CREATOR);
                    break;
                }
                case 8: {
                    powerStateImpl0 = (PowerStateImpl)baua.m(parcel0, v1, PowerStateImpl.CREATOR);
                    break;
                }
                case 9: {
                    screenStateImpl0 = (ScreenStateImpl)baua.m(parcel0, v1, ScreenStateImpl.CREATOR);
                    break;
                }
                case 10: {
                    weatherImpl0 = (WeatherImpl)baua.m(parcel0, v1, WeatherImpl.CREATOR);
                    break;
                }
                case 11: {
                    timeIntervalsImpl0 = (TimeIntervalsImpl)baua.m(parcel0, v1, TimeIntervalsImpl.CREATOR);
                    break;
                }
                case 12: {
                    contextData0 = (ContextData)baua.m(parcel0, v1, ContextData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new Snapshot(activityRecognitionResult0, beaconStateImpl0, headphoneStateImpl0, location0, networkStateImpl0, dataHolder0, powerStateImpl0, screenStateImpl0, weatherImpl0, timeIntervalsImpl0, contextData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Snapshot[v];
    }
}

