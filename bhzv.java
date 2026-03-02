import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.ConnectionCapabilities;
import com.google.android.gms.dtdi.core.Extra;
import com.google.android.gms.dtdi.core.RemoteAppScope;
import com.google.android.gms.dtdi.core.WakeUpRequest;
import java.util.List;

public final class bhzv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        List list0 = null;
        String s1 = null;
        List list1 = null;
        ConnectionCapabilities connectionCapabilities0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    list0 = baua.y(parcel0, v1, Extra.CREATOR);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    list1 = baua.y(parcel0, v1, RemoteAppScope.CREATOR);
                    break;
                }
                case 5: {
                    connectionCapabilities0 = (ConnectionCapabilities)baua.m(parcel0, v1, ConnectionCapabilities.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new WakeUpRequest(s, list0, s1, list1, connectionCapabilities0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WakeUpRequest[v];
    }
}

