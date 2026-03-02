import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;

public final class esna implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        TokenReference tokenReference0 = null;
        TokenReference tokenReference1 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    tokenReference0 = (TokenReference)baua.m(parcel0, v3, TokenReference.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 5: {
                    tokenReference1 = (TokenReference)baua.m(parcel0, v3, TokenReference.CREATOR);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new TokenStatus(tokenReference0, v1, z, tokenReference1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TokenStatus[v];
    }
}

