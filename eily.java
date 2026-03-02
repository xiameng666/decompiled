import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;

public final class eily implements Parcelable.Creator {
    public static void a(Configurations configurations0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, configurations0.a, false);
        baub.v(parcel0, 3, configurations0.c, false);
        baub.J(parcel0, 4, configurations0.d, v);
        baub.e(parcel0, 5, configurations0.f);
        baub.i(parcel0, 6, configurations0.b, false);
        baub.q(parcel0, 7, configurations0.g);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        String s = null;
        String s1 = null;
        Configuration[] arr_configuration = null;
        byte[] arr_b = null;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_configuration = (Configuration[])baua.J(parcel0, v2, Configuration.CREATOR);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 6: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 7: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new Configurations(s, s1, arr_configuration, z, arr_b, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Configurations[v];
    }
}

