import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl.Inclusion;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;

public final class bcvf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TimeFilterImpl timeFilterImpl0 = null;
        int v1 = 0;
        int v2 = 0;
        KeyFilterImpl keyFilterImpl0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    timeFilterImpl0 = (TimeFilterImpl)baua.m(parcel0, v3, TimeFilterImpl.CREATOR);
                    break;
                }
                case 5: {
                    keyFilterImpl0 = (KeyFilterImpl)baua.m(parcel0, v3, KeyFilterImpl.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new ContextDataFilterImpl.Inclusion(v1, v2, timeFilterImpl0, keyFilterImpl0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ContextDataFilterImpl.Inclusion[v];
    }
}

