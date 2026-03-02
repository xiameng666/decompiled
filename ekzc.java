import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.firebase.appindexing.internal.ActionImpl;

public final class ekzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        long v1 = 0L;
        ActionImpl actionImpl0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 3: {
                    actionImpl0 = (ActionImpl)baua.m(parcel0, v2, ActionImpl.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new AppIndexingUserActionInfo(s, v1, actionImpl0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AppIndexingUserActionInfo[v];
    }
}

