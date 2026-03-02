import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.PresenceAction;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import com.google.android.gms.nearby.presence.internal.BroadcastParams;

public final class dbaf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        PresenceIdentity presenceIdentity0 = null;
        PresenceAction[] arr_presenceAction = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 2: {
                    iBinder1 = baua.k(parcel0, v1);
                    break;
                }
                case 3: {
                    presenceIdentity0 = (PresenceIdentity)baua.m(parcel0, v1, PresenceIdentity.CREATOR);
                    break;
                }
                case 4: {
                    arr_presenceAction = (PresenceAction[])baua.J(parcel0, v1, PresenceAction.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new BroadcastParams(iBinder0, iBinder1, presenceIdentity0, arr_presenceAction);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BroadcastParams[v];
    }
}

