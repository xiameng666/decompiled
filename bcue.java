import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import java.util.ArrayList;

public final class bcue implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ArrayList arrayList0 = null;
        int v1 = 0;
        int v2 = 0;
        long v3 = 0L;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 6: {
                    arrayList0 = baua.y(parcel0, v4, ContextData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new FenceStateImpl(v1, v3, s, v2, arrayList0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FenceStateImpl[v];
    }
}

