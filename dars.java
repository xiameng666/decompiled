import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.nearby.presence.BroadcastRequest;
import com.google.android.gms.nearby.presence.DataElementCollection;
import com.google.android.gms.nearby.presence.PresenceAction;
import com.google.android.gms.nearby.presence.PresenceIdentity;

public final class dars implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        WorkSource workSource0 = new WorkSource();
        boolean z = false;
        boolean z1 = false;
        int v1 = 0;
        int[] arr_v = new int[0];
        int[] arr_v1 = new int[0];
        WorkSource workSource1 = workSource0;
        PresenceIdentity presenceIdentity0 = null;
        PresenceAction[] arr_presenceAction = null;
        DataElementCollection dataElementCollection0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    presenceIdentity0 = (PresenceIdentity)baua.m(parcel0, v2, PresenceIdentity.CREATOR);
                    break;
                }
                case 2: {
                    arr_presenceAction = (PresenceAction[])baua.J(parcel0, v2, PresenceAction.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_v = baua.H(parcel0, v2);
                    break;
                }
                case 5: {
                    dataElementCollection0 = (DataElementCollection)baua.m(parcel0, v2, DataElementCollection.CREATOR);
                    break;
                }
                case 6: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    arr_v1 = baua.H(parcel0, v2);
                    break;
                }
                case 8: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 9: {
                    workSource1 = (WorkSource)baua.m(parcel0, v2, WorkSource.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new BroadcastRequest(presenceIdentity0, arr_presenceAction, z, arr_v, dataElementCollection0, z1, arr_v1, v1, workSource1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BroadcastRequest[v];
    }
}

