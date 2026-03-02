import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.common.server.response.SafeParcelResponse;

public final class bbgz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Parcel parcel1 = null;
        int v1 = 0;
        FieldMappingDictionary fieldMappingDictionary0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    parcel1 = baua.l(parcel0, v2);
                    break;
                }
                case 3: {
                    fieldMappingDictionary0 = (FieldMappingDictionary)baua.m(parcel0, v2, FieldMappingDictionary.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SafeParcelResponse(v1, parcel1, fieldMappingDictionary0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SafeParcelResponse[v];
    }
}

