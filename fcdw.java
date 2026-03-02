import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

public final class fcdw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        TimeInterval timeInterval0 = null;
        UriData uriData0 = null;
        UriData uriData1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    timeInterval0 = (TimeInterval)baua.m(parcel0, v1, TimeInterval.CREATOR);
                    break;
                }
                case 5: {
                    uriData0 = (UriData)baua.m(parcel0, v1, UriData.CREATOR);
                    break;
                }
                case 6: {
                    uriData1 = (UriData)baua.m(parcel0, v1, UriData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new WalletObjectMessage(s, s1, timeInterval0, uriData0, uriData1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WalletObjectMessage[v];
    }
}

