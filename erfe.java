import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.SessionCheckpoint;
import java.util.ArrayList;
import java.util.HashSet;

public final class erfe implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList0 = null;
        DeviceRiskSignals deviceRiskSignals0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    arrayList0 = baua.y(parcel0, v1, SessionCheckpoint.CREATOR);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    deviceRiskSignals0 = (DeviceRiskSignals)baua.m(parcel0, v1, DeviceRiskSignals.CREATOR);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new ExchangeSessionCheckpointsForUserCredentialsRequest(hashSet0, arrayList0, deviceRiskSignals0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ExchangeSessionCheckpointsForUserCredentialsRequest[v];
    }
}

