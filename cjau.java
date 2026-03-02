import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.libs.identity.ClientIdentity;
import java.util.List;

public final class cjau implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Object object0 = null;
        String s = null;
        String s1 = null;
        List list0 = null;
        ClientIdentity clientIdentity0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    object0 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    clientIdentity0 = (ClientIdentity)baua.m(parcel0, v2, ClientIdentity.CREATOR);
                    break;
                }
                case 8: {
                    list0 = baua.y(parcel0, v2, Feature.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        ibuq.f(object0, "packageName");
        return new ClientIdentity(v1, -1, ((String)object0), s, s1, null, list0, null, clientIdentity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ClientIdentity[v];
    }
}

