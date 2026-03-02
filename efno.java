import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.TransactionInfo;
import com.google.android.gms.payse.internal.ExecuteSdkOperationResponse;

public final class efno implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TransactionInfo transactionInfo0 = null;
        SecureElementStoredValue secureElementStoredValue0 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    transactionInfo0 = (TransactionInfo)baua.m(parcel0, v1, TransactionInfo.CREATOR);
                    break;
                }
                case 2: {
                    secureElementStoredValue0 = (SecureElementStoredValue)baua.m(parcel0, v1, SecureElementStoredValue.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ExecuteSdkOperationResponse(transactionInfo0, secureElementStoredValue0, s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ExecuteSdkOperationResponse[v];
    }
}

