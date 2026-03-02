import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ProvisionSePrepaidCardRequest;
import com.google.android.gms.pay.SeServiceProvider;

public final class dlhl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        SeServiceProvider seServiceProvider0 = null;
        byte[] arr_b = null;
        String s = null;
        byte[] arr_b1 = null;
        byte[] arr_b2 = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v3, Account.CREATOR);
                    break;
                }
                case 2: {
                    seServiceProvider0 = (SeServiceProvider)baua.m(parcel0, v3, SeServiceProvider.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 6: {
                    arr_b1 = baua.E(parcel0, v3);
                    break;
                }
                case 7: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 8: {
                    arr_b2 = baua.E(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProvisionSePrepaidCardRequest(account0, seServiceProvider0, v1, arr_b, s, arr_b1, v2, arr_b2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProvisionSePrepaidCardRequest[v];
    }
}

