import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FieldMappingDictionary.FieldMapPair;

public final class bbgw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        int v1 = 0;
        FastJsonResponse.Field fastJsonResponse$Field0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    fastJsonResponse$Field0 = (FastJsonResponse.Field)baua.m(parcel0, v2, FastJsonResponse.Field.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new FieldMappingDictionary.FieldMapPair(v1, s, fastJsonResponse$Field0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FieldMappingDictionary.FieldMapPair[v];
    }
}

