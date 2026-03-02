import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.issuer.SupervisedUserInfo;
import com.google.android.gms.tapandpay.issuer.UserAddress;

public final class etlh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        String s = null;
        UserAddress userAddress0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    userAddress0 = (UserAddress)baua.m(parcel0, v1, UserAddress.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SupervisedUserInfo(s, userAddress0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SupervisedUserInfo[v];
    }
}

