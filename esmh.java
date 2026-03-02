import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.TransactionData;

public final class esmh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        int v1 = 0;
        String s = null;
        String s1 = null;
        TransactionData transactionData0 = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    transactionData0 = (TransactionData)baua.m(parcel0, v2, TransactionData.CREATOR);
                    break;
                }
                case 5: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new RetrieveInAppPaymentCredentialRequest(s, s1, transactionData0, arr_b, z, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RetrieveInAppPaymentCredentialRequest[v];
    }
}

