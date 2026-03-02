import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class fawk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CommonWalletObject commonWalletObject0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        long v1 = 0L;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    commonWalletObject0 = (CommonWalletObject)baua.m(parcel0, v3, CommonWalletObject.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                case 6: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 7: {
                    s3 = baua.s(parcel0, v3);
                    break;
                }
                case 8: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 9: {
                    s4 = baua.s(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new GiftCardWalletObject(commonWalletObject0, s, s1, s2, v1, s3, v2, s4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GiftCardWalletObject[v];
    }
}

