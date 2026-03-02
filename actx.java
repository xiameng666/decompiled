import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.auth.aang.HasCapabilitiesRequest;
import java.util.List;

public final class actx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        GoogleAccount googleAccount0 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    googleAccount0 = (GoogleAccount)baua.m(parcel0, v1, GoogleAccount.CREATOR);
                    break;
                }
                case 2: {
                    list0 = baua.x(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new HasCapabilitiesRequest(googleAccount0, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new HasCapabilitiesRequest[v];
    }
}

