import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.ProviderSendParams;

public final class ddsy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ShareTarget shareTarget0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    shareTarget0 = (ShareTarget)baua.m(parcel0, v1, ShareTarget.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 4: {
                    iBinder1 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProviderSendParams(s, shareTarget0, iBinder0, iBinder1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProviderSendParams[v];
    }
}

