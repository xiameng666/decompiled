import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.InvitationHandle;
import com.google.android.gms.dtdi.core.internal.StopBroadcastInvitationParams;

public final class biwp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        InvitationHandle invitationHandle0 = null;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    invitationHandle0 = (InvitationHandle)baua.m(parcel0, v1, InvitationHandle.CREATOR);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new StopBroadcastInvitationParams(invitationHandle0, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StopBroadcastInvitationParams[v];
    }
}

