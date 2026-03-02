import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.quickstart.AccountTransferResult;
import java.util.ArrayList;

public final class eqwd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ArrayList arrayList0 = null;
        String s = null;
        String s1 = null;
        ArrayList arrayList1 = null;
        ArrayList arrayList2 = null;
        String s2 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    arrayList0 = baua.y(parcel0, v2, BootstrapAccount.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    arrayList1 = baua.y(parcel0, v2, BootstrapAccount.CREATOR);
                    break;
                }
                case 6: {
                    arrayList2 = baua.y(parcel0, v2, FallbackAccount.CREATOR);
                    break;
                }
                case 7: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new AccountTransferResult(arrayList0, v1, s, s1, arrayList1, arrayList2, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AccountTransferResult[v];
    }
}

