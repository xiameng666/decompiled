import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.AtomInfo;
import com.google.android.gms.instantapps.internal.Route;
import com.google.android.gms.instantapps.internal.SharedLibInfo;
import java.util.List;

public final class bzvk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        List list0 = null;
        List list1 = null;
        List list2 = null;
        byte[] arr_b = null;
        PackageInfo packageInfo0 = null;
        byte[] arr_b1 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    list0 = baua.y(parcel0, v2, Route.CREATOR);
                    break;
                }
                case 6: {
                    list1 = baua.y(parcel0, v2, AtomInfo.CREATOR);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 8: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 9: {
                    packageInfo0 = (PackageInfo)baua.m(parcel0, v2, PackageInfo.CREATOR);
                    break;
                }
                case 11: {
                    list2 = baua.y(parcel0, v2, SharedLibInfo.CREATOR);
                    break;
                }
                case 12: {
                    arr_b1 = baua.E(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new AppInfo(s, s1, list0, list1, list2, v1, arr_b, packageInfo0, arr_b1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AppInfo[v];
    }
}

