import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.AddressEntity;

public final class ejuc implements Parcelable.Creator {
    public static void a(AddressEntity addressEntity0, Parcel parcel0) {
        int v = baub.a(parcel0);
        baub.v(parcel0, 2, addressEntity0.a, false);
        baub.v(parcel0, 3, addressEntity0.b, false);
        baub.v(parcel0, 4, addressEntity0.c, false);
        baub.v(parcel0, 5, addressEntity0.d, false);
        baub.v(parcel0, 6, addressEntity0.g, false);
        baub.v(parcel0, 7, addressEntity0.e, false);
        baub.v(parcel0, 8, addressEntity0.f, false);
        baub.v(parcel0, 9, addressEntity0.h, false);
        baub.c(parcel0, v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
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
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    s6 = baua.s(parcel0, v1);
                    break;
                }
                case 7: {
                    s4 = baua.s(parcel0, v1);
                    break;
                }
                case 8: {
                    s5 = baua.s(parcel0, v1);
                    break;
                }
                case 9: {
                    s7 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AddressEntity(s, s1, s2, s3, s4, s5, s6, s7);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AddressEntity[v];
    }
}

