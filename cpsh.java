import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StyleSpan;
import java.util.List;

public final class cpsh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        Cap cap0 = null;
        Cap cap1 = null;
        List list1 = null;
        List list2 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v2 = 0;
        float f = 0.0f;
        float f1 = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    list0 = baua.y(parcel0, v3, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    f = baua.c(parcel0, v3);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 5: {
                    f1 = baua.c(parcel0, v3);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 8: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                case 9: {
                    cap0 = (Cap)baua.m(parcel0, v3, Cap.CREATOR);
                    break;
                }
                case 10: {
                    cap1 = (Cap)baua.m(parcel0, v3, Cap.CREATOR);
                    break;
                }
                case 11: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 12: {
                    list1 = baua.y(parcel0, v3, PatternItem.CREATOR);
                    break;
                }
                case 13: {
                    list2 = baua.y(parcel0, v3, StyleSpan.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new PolylineOptions(list0, f, v1, f1, z, z1, z2, cap0, cap1, v2, list1, list2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PolylineOptions[v];
    }
}

