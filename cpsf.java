import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;
import java.util.List;

public final class cpsf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ArrayList arrayList0 = new ArrayList();
        float f = 0.0f;
        List list0 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v3 = 0;
        float f1 = 0.0f;
        List list1 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    list1 = baua.y(parcel0, v4, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    baua.B(parcel0, v4, arrayList0, this.getClass().getClassLoader());
                    break;
                }
                case 4: {
                    f = baua.c(parcel0, v4);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 7: {
                    f1 = baua.c(parcel0, v4);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 9: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                case 10: {
                    z2 = baua.D(parcel0, v4);
                    break;
                }
                case 11: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 12: {
                    list0 = baua.y(parcel0, v4, PatternItem.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new PolygonOptions(list1, arrayList0, f, v1, v2, f1, z, z1, z2, v3, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PolygonOptions[v];
    }
}

