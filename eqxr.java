import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import java.util.ArrayList;
import java.util.List;

public final class eqxr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        boolean z1 = false;
        int v4 = 0;
        String s = null;
        VerificationInfo verificationInfo0 = null;
        ArrayList arrayList0 = null;
        String s1 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 3: {
                    verificationInfo0 = (VerificationInfo)baua.m(parcel0, v5, VerificationInfo.CREATOR);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 6: {
                    arrayList0 = baua.y(parcel0, v5, BootstrapAccount.CREATOR);
                    break;
                }
                case 7: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 8: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 9: {
                    z1 = baua.D(parcel0, v5);
                    break;
                }
                case 10: {
                    list0 = baua.y(parcel0, v5, FallbackAccount.CREATOR);
                    break;
                }
                case 11: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new QuickStartTargetEventData(v1, s, verificationInfo0, v2, z, arrayList0, v3, s1, z1, list0, v4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new QuickStartTargetEventData[v];
    }
}

