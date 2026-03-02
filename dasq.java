import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import com.google.android.gms.nearby.presence.DiscoveryRequest;
import com.google.android.gms.nearby.presence.log.NearbyPresenceDiscoveryRequestAttribution;

public final class dasq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        WorkSource workSource0 = new WorkSource();
        long v1 = 0L;
        long v2 = 0L;
        int[] arr_v = null;
        DiscoveryFilter discoveryFilter0 = null;
        NearbyPresenceDiscoveryRequestAttribution nearbyPresenceDiscoveryRequestAttribution0 = null;
        boolean z = false;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 3: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_v = baua.H(parcel0, v3);
                    break;
                }
                case 5: {
                    discoveryFilter0 = (DiscoveryFilter)baua.m(parcel0, v3, DiscoveryFilter.CREATOR);
                    break;
                }
                case 6: {
                    nearbyPresenceDiscoveryRequestAttribution0 = (NearbyPresenceDiscoveryRequestAttribution)baua.m(parcel0, v3, NearbyPresenceDiscoveryRequestAttribution.CREATOR);
                    break;
                }
                case 7: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 8: {
                    workSource0 = (WorkSource)baua.m(parcel0, v3, WorkSource.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new DiscoveryRequest(z, v1, z1, arr_v, discoveryFilter0, nearbyPresenceDiscoveryRequestAttribution0, v2, workSource0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DiscoveryRequest[v];
    }
}

