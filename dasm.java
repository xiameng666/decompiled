import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import com.google.android.gms.nearby.presence.PresenceAction;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import com.google.android.gms.nearby.presence.PresenceZone;
import java.util.List;

public final class dasm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        List list0 = null;
        List list1 = null;
        List list2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    list0 = baua.y(parcel0, v2, PresenceAction.CREATOR);
                    break;
                }
                case 2: {
                    list1 = baua.y(parcel0, v2, PresenceZone.CREATOR);
                    break;
                }
                case 3: {
                    list2 = baua.y(parcel0, v2, PresenceIdentity.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DiscoveryFilter(list0, list1, list2, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DiscoveryFilter[v];
    }
}

