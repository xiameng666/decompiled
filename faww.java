import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class faww implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        CommonWalletObject commonWalletObject0 = null;
        int v1 = 0;
        String s1 = null;
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
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    commonWalletObject0 = (CommonWalletObject)baua.m(parcel0, v2, CommonWalletObject.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new OfferWalletObject(v1, s, s1, commonWalletObject0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OfferWalletObject[v];
    }
}

