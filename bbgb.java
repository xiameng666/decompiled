import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;

public final class bbgb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        StringToIntConverter stringToIntConverter0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    stringToIntConverter0 = (StringToIntConverter)baua.m(parcel0, v2, StringToIntConverter.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConverterWrapper(v1, stringToIntConverter0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConverterWrapper[v];
    }
}

