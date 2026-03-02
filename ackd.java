import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import com.google.android.gms.appsearch.safeparcel.PropertyParcel;
import java.util.List;

public final class ackd implements Parcelable.Creator {
    public static void a(GenericDocumentParcel genericDocumentParcel0, Parcel parcel0) {
        int v = baub.a(parcel0);
        baub.v(parcel0, 1, genericDocumentParcel0.a, false);
        baub.v(parcel0, 2, genericDocumentParcel0.b, false);
        baub.v(parcel0, 3, genericDocumentParcel0.c, false);
        baub.q(parcel0, 4, genericDocumentParcel0.d);
        baub.q(parcel0, 5, genericDocumentParcel0.e);
        baub.o(parcel0, 6, genericDocumentParcel0.f);
        baub.y(parcel0, 7, genericDocumentParcel0.g, false);
        baub.x(parcel0, 8, genericDocumentParcel0.h, false);
        baub.c(parcel0, v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        List list0 = null;
        List list1 = null;
        int v1 = 0;
        long v2 = 0L;
        long v3 = 0L;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 5: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 7: {
                    list0 = baua.y(parcel0, v4, PropertyParcel.CREATOR);
                    break;
                }
                case 8: {
                    list1 = baua.x(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new GenericDocumentParcel(s, s1, s2, v2, v3, v1, list0, list1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GenericDocumentParcel[v];
    }
}

