import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.log.DtdiAttribution;
import com.google.android.gms.nearby.presence.log.NearbyPresenceDiscoveryRequestAttribution;

public final class dbnw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DtdiAttribution dtdiAttribution0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                dtdiAttribution0 = (DtdiAttribution)baua.m(parcel0, v1, DtdiAttribution.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new NearbyPresenceDiscoveryRequestAttribution(dtdiAttribution0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new NearbyPresenceDiscoveryRequestAttribution[v];
    }
}

