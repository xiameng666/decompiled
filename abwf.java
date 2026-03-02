import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.CacheSpec;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import java.util.List;

public final class abwf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        List list1 = null;
        int[] arr_v = null;
        byte[] arr_b = null;
        STSortSpec sTSortSpec0 = null;
        String s = null;
        CacheSpec cacheSpec0 = null;
        boolean z = true;
        boolean z1 = false;
        boolean z2 = false;
        int v1 = 0;
        int v2 = 0;
        boolean z3 = false;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                case 2: {
                    list0 = baua.x(parcel0, v4);
                    break;
                }
                case 3: {
                    list1 = baua.y(parcel0, v4, Section.CREATOR);
                    break;
                }
                case 4: {
                    z2 = baua.D(parcel0, v4);
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
                    z3 = baua.D(parcel0, v4);
                    break;
                }
                case 8: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 10: {
                    arr_v = baua.H(parcel0, v4);
                    break;
                }
                case 11: {
                    arr_b = baua.E(parcel0, v4);
                    break;
                }
                case 12: {
                    sTSortSpec0 = (STSortSpec)baua.m(parcel0, v4, STSortSpec.CREATOR);
                    break;
                }
                case 13: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 15: {
                    cacheSpec0 = (CacheSpec)baua.m(parcel0, v4, CacheSpec.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new QuerySpecification(z1, list0, list1, z2, v1, v2, z3, v3, z, arr_v, arr_b, sTSortSpec0, s, cacheSpec0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new QuerySpecification[v];
    }
}

