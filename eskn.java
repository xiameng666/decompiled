import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.BadgeInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;

public final class eskn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        byte[] arr_b = null;
        TokenStatus tokenStatus0 = null;
        String s1 = null;
        TransactionInfo transactionInfo0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    tokenStatus0 = (TokenStatus)baua.m(parcel0, v2, TokenStatus.CREATOR);
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    transactionInfo0 = (TransactionInfo)baua.m(parcel0, v2, TransactionInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new BadgeInfo(s, arr_b, v1, tokenStatus0, s1, transactionInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BadgeInfo[v];
    }
}

