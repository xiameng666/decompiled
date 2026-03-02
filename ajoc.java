import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.OtpRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

public final class ajoc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        String s = null;
        AppDescription appDescription0 = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    appDescription0 = (AppDescription)baua.m(parcel0, v2, AppDescription.CREATOR);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new OtpRequest(v1, s, appDescription0, arr_b, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OtpRequest[v];
    }
}

