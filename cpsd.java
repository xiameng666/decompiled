import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.PinConfig.Glyph;
import com.google.android.gms.maps.model.PinConfig;

public final class cpsd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PinConfig.Glyph pinConfig$Glyph0 = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    pinConfig$Glyph0 = (PinConfig.Glyph)baua.m(parcel0, v3, PinConfig.Glyph.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new PinConfig(v1, v2, pinConfig$Glyph0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PinConfig[v];
    }
}

