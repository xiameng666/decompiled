import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GridConfig;
import com.google.android.gms.pay.PresentationConfig;

public final class dlhi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        GridConfig gridConfig0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    gridConfig0 = (GridConfig)baua.m(parcel0, v2, GridConfig.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new PresentationConfig(v1, gridConfig0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PresentationConfig[v];
    }
}

