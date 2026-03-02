import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.ServiceType;

public final class csne implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ServiceType serviceType0 = null;
        Long long0 = null;
        AuthType authType0 = null;
        String s1 = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    serviceType0 = (ServiceType)baua.m(parcel0, v1, ServiceType.CREATOR);
                    break;
                }
                case 3: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 4: {
                    authType0 = (AuthType)baua.m(parcel0, v1, AuthType.CREATOR);
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 0x3F: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CheckAuthStatusRequest(s, serviceType0, long0, authType0, s1, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CheckAuthStatusRequest[v];
    }
}

