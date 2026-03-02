import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonConfig;

public final class batu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Scope[] arr_scope = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 4: {
                    arr_scope = (Scope[])baua.J(parcel0, v4, Scope.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new SignInButtonConfig(v1, v2, v3, arr_scope);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SignInButtonConfig[v];
    }
}

