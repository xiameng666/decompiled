import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.AndroidPackageScope;
import com.google.android.gms.dtdi.core.AndroidRoleScope;
import com.google.android.gms.dtdi.core.RemoteAppScope;

public final class bhzp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        AndroidRoleScope androidRoleScope0 = null;
        AndroidPackageScope androidPackageScope0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    androidRoleScope0 = (AndroidRoleScope)baua.m(parcel0, v1, AndroidRoleScope.CREATOR);
                    break;
                }
                case 2: {
                    androidPackageScope0 = (AndroidPackageScope)baua.m(parcel0, v1, AndroidPackageScope.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new RemoteAppScope(androidRoleScope0, androidPackageScope0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RemoteAppScope[v];
    }
}

