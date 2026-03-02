import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;

public final class crdq implements Parcelable.Creator {
    public static void a(EventParcel eventParcel0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, eventParcel0.a, false);
        baub.t(parcel0, 3, eventParcel0.b, v, false);
        baub.v(parcel0, 4, eventParcel0.c, false);
        baub.q(parcel0, 5, eventParcel0.d);
        baub.q(parcel0, 6, eventParcel0.e);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        String s = null;
        EventParams eventParams0 = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    eventParams0 = (EventParams)baua.m(parcel0, v3, EventParams.CREATOR);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 6: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new EventParcel(s, eventParams0, s1, v1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new EventParcel[v];
    }
}

