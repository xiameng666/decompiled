import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.TokenWrapper;
import com.google.android.gms.dtdi.core.internal.RegisterCallIdForContextSyncParams;

public final class biwe implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TokenWrapper tokenWrapper0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    tokenWrapper0 = (TokenWrapper)baua.m(parcel0, v1, TokenWrapper.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new RegisterCallIdForContextSyncParams(tokenWrapper0, s, s1, s2, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RegisterCallIdForContextSyncParams[v];
    }
}

