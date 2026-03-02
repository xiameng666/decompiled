import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.DeleteSePrepaidCardRequest;
import com.google.android.gms.pay.SeServiceProvider;

public final class dlcr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        SeServiceProvider seServiceProvider0 = null;
        String s = null;
        byte[] arr_b = null;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    seServiceProvider0 = (SeServiceProvider)baua.m(parcel0, v1, SeServiceProvider.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DeleteSePrepaidCardRequest(account0, seServiceProvider0, s, z, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeleteSePrepaidCardRequest[v];
    }
}

