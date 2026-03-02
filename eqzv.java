import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.quickstart.WifiNetworkDetails;
import com.google.android.gms.smartdevice.quickstart.WifiTransferResult;

public final class eqzv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        WifiNetworkDetails wifiNetworkDetails0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                wifiNetworkDetails0 = (WifiNetworkDetails)baua.m(parcel0, v1, WifiNetworkDetails.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new WifiTransferResult(wifiNetworkDetails0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WifiTransferResult[v];
    }
}

