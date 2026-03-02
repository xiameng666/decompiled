import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.SupervisedAccountInfo;
import java.util.HashSet;

public final class epwk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        SupervisedAccountInfo supervisedAccountInfo0 = null;
        int v1 = 0;
        int v2 = 0;
        BootstrapAccount bootstrapAccount0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    bootstrapAccount0 = (BootstrapAccount)baua.m(parcel0, v3, BootstrapAccount.CREATOR);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    supervisedAccountInfo0 = (SupervisedAccountInfo)baua.m(parcel0, v3, SupervisedAccountInfo.CREATOR);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new AccountTransferResult(hashSet0, bootstrapAccount0, v1, v2, supervisedAccountInfo0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AccountTransferResult[v];
    }
}

