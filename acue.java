import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.auth.aang.SyncAccountStateRequest;

public final class acue implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        GoogleAccount googleAccount0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    googleAccount0 = (GoogleAccount)baua.m(parcel0, v2, GoogleAccount.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SyncAccountStateRequest(googleAccount0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SyncAccountStateRequest[v];
    }
}

