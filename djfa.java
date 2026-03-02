import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.uwb.internal.DlTdoaMeasurementParams;
import com.google.android.gms.nearby.uwb.internal.RangingMeasurementParams;
import com.google.android.gms.nearby.uwb.internal.RangingPositionParams;

public final class djfa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        RangingMeasurementParams rangingMeasurementParams0 = null;
        RangingMeasurementParams rangingMeasurementParams1 = null;
        RangingMeasurementParams rangingMeasurementParams2 = null;
        DlTdoaMeasurementParams dlTdoaMeasurementParams0 = null;
        int v1 = 0xFFFFFF80;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    rangingMeasurementParams0 = (RangingMeasurementParams)baua.m(parcel0, v3, RangingMeasurementParams.CREATOR);
                    break;
                }
                case 2: {
                    rangingMeasurementParams1 = (RangingMeasurementParams)baua.m(parcel0, v3, RangingMeasurementParams.CREATOR);
                    break;
                }
                case 3: {
                    rangingMeasurementParams2 = (RangingMeasurementParams)baua.m(parcel0, v3, RangingMeasurementParams.CREATOR);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 6: {
                    dlTdoaMeasurementParams0 = (DlTdoaMeasurementParams)baua.m(parcel0, v3, DlTdoaMeasurementParams.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new RangingPositionParams(rangingMeasurementParams0, rangingMeasurementParams1, rangingMeasurementParams2, v2, v1, dlTdoaMeasurementParams0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RangingPositionParams[v];
    }
}

