import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.cryptauth.AppClaim;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class ajff implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        List list0 = null;
        int v1 = 0;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    status0 = (Status)baua.m(parcel0, v2, Status.CREATOR);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 4: {
                    list0 = baua.y(parcel0, v2, AppClaim.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new KeyRegistrationResult(v1, status0, arr_b, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new KeyRegistrationResult[v];
    }
}

