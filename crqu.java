import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

public final class crqu implements Parcelable.Creator {
    public static void a(UserAttributeParcel userAttributeParcel0, Parcel parcel0) {
        int v = baub.a(parcel0);
        baub.o(parcel0, 1, userAttributeParcel0.a);
        baub.v(parcel0, 2, userAttributeParcel0.b, false);
        baub.q(parcel0, 3, userAttributeParcel0.c);
        baub.I(parcel0, 4, userAttributeParcel0.d);
        baub.v(parcel0, 6, userAttributeParcel0.e, false);
        baub.v(parcel0, 7, userAttributeParcel0.f, false);
        baub.B(parcel0, 8, userAttributeParcel0.g);
        baub.c(parcel0, v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Long long0 = null;
        Float float0 = null;
        String s1 = null;
        String s2 = null;
        Double double0 = null;
        long v1 = 0L;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 4: {
                    long0 = baua.r(parcel0, v3);
                    break;
                }
                case 5: {
                    float0 = baua.p(parcel0, v3);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 7: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                case 8: {
                    double0 = baua.o(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new UserAttributeParcel(v2, s, v1, long0, float0, s1, s2, double0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UserAttributeParcel[v];
    }
}

