import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;

public final class ekza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        Thing thing0 = null;
        ActionImpl actionImpl0 = null;
        long v1 = 0L;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    s = baua.s(parcel0, v4);
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
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 6: {
                    thing0 = (Thing)baua.m(parcel0, v4, Thing.CREATOR);
                    break;
                }
                case 7: {
                    actionImpl0 = (ActionImpl)baua.m(parcel0, v4, ActionImpl.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new AppIndexingErrorInfo(s, v2, v3, s1, v1, thing0, actionImpl0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AppIndexingErrorInfo[v];
    }
}

