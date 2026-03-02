import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.PassSaveTypeFilter;
import com.google.android.gms.pay.PassType;

public final class dlgq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PassType[] arr_passType = null;
        String[] arr_s = null;
        String[] arr_s1 = null;
        String[] arr_s2 = null;
        String[] arr_s3 = null;
        String[] arr_s4 = null;
        PassSaveTypeFilter passSaveTypeFilter0 = null;
        boolean z = false;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    arr_passType = (PassType[])baua.J(parcel0, v2, PassType.CREATOR);
                    break;
                }
                case 2: {
                    arr_s = baua.K(parcel0, v2);
                    break;
                }
                case 3: {
                    arr_s1 = baua.K(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_s2 = baua.K(parcel0, v2);
                    break;
                }
                case 5: {
                    arr_s3 = baua.K(parcel0, v2);
                    break;
                }
                case 6: {
                    arr_s4 = baua.K(parcel0, v2);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 8: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 9: {
                    passSaveTypeFilter0 = (PassSaveTypeFilter)baua.m(parcel0, v2, PassSaveTypeFilter.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new PassFilter(arr_passType, arr_s, arr_s1, arr_s2, arr_s3, arr_s4, z, v1, passSaveTypeFilter0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PassFilter[v];
    }
}

