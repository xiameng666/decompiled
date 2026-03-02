import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.notifications.Identifier;
import com.google.android.gms.notifications.ReadStateUpdate;

public final class djru implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Identifier identifier0 = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    identifier0 = (Identifier)baua.m(parcel0, v3, Identifier.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new ReadStateUpdate(v1, v2, identifier0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ReadStateUpdate[v];
    }
}

