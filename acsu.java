import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.NotificationParams;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.firstparty.dataservice.AccountInterruptControls;

public final class acsu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        BrowserResolutionCookie[] arr_browserResolutionCookie = null;
        NotificationParams notificationParams0 = null;
        AccountInterruptControls accountInterruptControls0 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    arr_browserResolutionCookie = (BrowserResolutionCookie[])baua.J(parcel0, v3, BrowserResolutionCookie.CREATOR);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 7: {
                    notificationParams0 = (NotificationParams)baua.m(parcel0, v3, NotificationParams.CREATOR);
                    break;
                }
                case 8: {
                    accountInterruptControls0 = (AccountInterruptControls)baua.m(parcel0, v3, AccountInterruptControls.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new ResolutionData(v1, s, v2, s1, arr_browserResolutionCookie, z, notificationParams0, accountInterruptControls0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ResolutionData[v];
    }
}

