import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;

public final class goqv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Thing[] arr_thing = null;
        String[] arr_s = null;
        String[] arr_s1 = null;
        ActionImpl actionImpl0 = null;
        String s = null;
        String s1 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_thing = (Thing[])baua.J(parcel0, v2, Thing.CREATOR);
                    break;
                }
                case 3: {
                    arr_s = baua.K(parcel0, v2);
                    break;
                }
                case 5: {
                    arr_s1 = baua.K(parcel0, v2);
                    break;
                }
                case 6: {
                    actionImpl0 = (ActionImpl)baua.m(parcel0, v2, ActionImpl.CREATOR);
                    break;
                }
                case 7: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 8: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new MutateRequest(v1, arr_thing, arr_s, arr_s1, actionImpl0, s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MutateRequest[v];
    }
}

