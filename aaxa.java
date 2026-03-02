import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.actionlearner.ActionBundle;
import com.google.android.gms.actionlearner.ContextData;

public final class aaxa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Long long0 = null;
        ContextData contextData0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 3: {
                    contextData0 = (ContextData)baua.m(parcel0, v1, ContextData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ActionBundle(s, long0, contextData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ActionBundle[v];
    }
}

