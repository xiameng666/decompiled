import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public final class bbgv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        ConverterWrapper converterWrapper0 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        boolean z1 = false;
        int v4 = 0;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 4: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 5: {
                    z1 = baua.D(parcel0, v5);
                    break;
                }
                case 6: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 7: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                case 8: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 9: {
                    converterWrapper0 = (ConverterWrapper)baua.m(parcel0, v5, ConverterWrapper.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new FastJsonResponse.Field(v1, v2, z, v3, z1, s, v4, s1, converterWrapper0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FastJsonResponse.Field[v];
    }
}

