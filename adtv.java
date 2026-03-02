import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import java.util.ArrayList;
import java.util.HashSet;

public final class adtv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        ArrayList arrayList0 = null;
        AccountTransferProgress accountTransferProgress0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(1));
                    break;
                }
                case 2: {
                    arrayList0 = baua.y(parcel0, v3, AuthenticatorAnnotatedData.CREATOR);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    accountTransferProgress0 = (AccountTransferProgress)baua.m(parcel0, v3, AccountTransferProgress.CREATOR);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new AccountTransferMsg(hashSet0, v1, arrayList0, v2, accountTransferProgress0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AccountTransferMsg[v];
    }
}

