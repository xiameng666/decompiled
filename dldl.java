import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetBulletinsRequest;
import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.PageData;

public final class dldl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        IntentSource intentSource0 = null;
        PageData pageData0 = null;
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v4, Account.CREATOR);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 5: {
                    intentSource0 = (IntentSource)baua.m(parcel0, v4, IntentSource.CREATOR);
                    break;
                }
                case 6: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 7: {
                    pageData0 = (PageData)baua.m(parcel0, v4, PageData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetBulletinsRequest(account0, z, v1, v2, intentSource0, v3, pageData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetBulletinsRequest[v];
    }
}

