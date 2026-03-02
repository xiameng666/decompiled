import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.Route;

public final class bzvv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Intent intent0 = null;
        Intent intent1 = null;
        AppInfo appInfo0 = null;
        Route route0 = null;
        byte[] arr_b = null;
        String s1 = null;
        String s2 = null;
        byte[] arr_b1 = null;
        Bundle bundle0 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 5: {
                    intent0 = (Intent)baua.m(parcel0, v4, Intent.CREATOR);
                    break;
                }
                case 6: {
                    intent1 = (Intent)baua.m(parcel0, v4, Intent.CREATOR);
                    break;
                }
                case 8: {
                    appInfo0 = (AppInfo)baua.m(parcel0, v4, AppInfo.CREATOR);
                    break;
                }
                case 9: {
                    route0 = (Route)baua.m(parcel0, v4, Route.CREATOR);
                    break;
                }
                case 10: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                case 11: {
                    arr_b = baua.E(parcel0, v4);
                    break;
                }
                case 12: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 13: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 14: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 15: {
                    bundle0 = baua.j(parcel0, v4);
                    break;
                }
                case 16: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 17: {
                    arr_b1 = baua.E(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new InstantAppPreLaunchInfo(v1, s, z, intent0, intent1, appInfo0, route0, z1, arr_b, s1, v2, v3, s2, arr_b1, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InstantAppPreLaunchInfo[v];
    }
}

