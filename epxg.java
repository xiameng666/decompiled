import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.d2d.PendingAccountData;
import java.util.ArrayList;

public final class epxg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ArrayList arrayList0 = null;
        BootstrapAccount bootstrapAccount0 = null;
        ArrayList arrayList1 = null;
        BootstrapAccount bootstrapAccount1 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int v1 = -1;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 2: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 4: {
                    arrayList0 = baua.y(parcel0, v5, BootstrapAccount.CREATOR);
                    break;
                }
                case 5: {
                    bootstrapAccount0 = (BootstrapAccount)baua.m(parcel0, v5, BootstrapAccount.CREATOR);
                    break;
                }
                case 6: {
                    arrayList1 = baua.y(parcel0, v5, PendingAccountData.CREATOR);
                    break;
                }
                case 7: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 8: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 10: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 11: {
                    bootstrapAccount1 = (BootstrapAccount)baua.m(parcel0, v5, BootstrapAccount.CREATOR);
                    break;
                }
                case 12: {
                    arrayList2 = baua.y(parcel0, v5, BootstrapAccount.CREATOR);
                    break;
                }
                case 13: {
                    arrayList3 = baua.y(parcel0, v5, FallbackAccount.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new BootstrapCompletionResult(v2, s, arrayList0, bootstrapAccount0, arrayList1, v3, v4, z, v1, bootstrapAccount1, arrayList2, arrayList3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BootstrapCompletionResult[v];
    }
}

