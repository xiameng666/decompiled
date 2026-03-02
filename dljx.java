import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.SeServiceProvider;
import com.google.android.gms.pay.TopupSePrepaidCardRequest;

public final class dljx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        GooglePaymentMethodId googlePaymentMethodId0 = null;
        String s = null;
        byte[] arr_b = null;
        byte[] arr_b1 = null;
        SeServiceProvider seServiceProvider0 = null;
        String s1 = null;
        String s2 = null;
        byte[] arr_b2 = null;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    googlePaymentMethodId0 = (GooglePaymentMethodId)baua.m(parcel0, v1, GooglePaymentMethodId.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_b1 = baua.E(parcel0, v1);
                    break;
                }
                case 6: {
                    seServiceProvider0 = (SeServiceProvider)baua.m(parcel0, v1, SeServiceProvider.CREATOR);
                    break;
                }
                case 7: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 8: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 10: {
                    arr_b2 = baua.E(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new TopupSePrepaidCardRequest(account0, googlePaymentMethodId0, s, arr_b, arr_b1, seServiceProvider0, s1, s2, z, arr_b2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TopupSePrepaidCardRequest[v];
    }
}

