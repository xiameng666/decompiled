import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.presencemanager.ActiveUser;
import com.google.android.gms.presencemanager.ActiveUserData;

public final class ejff implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        ActiveUser activeUser0 = null;
        String s = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    activeUser0 = (ActiveUser)baua.m(parcel0, v2, ActiveUser.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v2);
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
        return new ActiveUserData(activeUser0, s, z, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ActiveUserData[v];
    }
}

