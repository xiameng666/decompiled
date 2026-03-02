import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StrokeStyle;

public final class cpsn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        StampStyle stampStyle0 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        float f = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    f = baua.c(parcel0, v3);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 6: {
                    stampStyle0 = (StampStyle)baua.m(parcel0, v3, StampStyle.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new StrokeStyle(f, v1, v2, z, stampStyle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StrokeStyle[v];
    }
}

