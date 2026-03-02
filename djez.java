import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.uwb.internal.RangeDataNtfConfigParams;
import com.google.android.gms.nearby.uwb.internal.RangeLimitsConfigParams;
import com.google.android.gms.nearby.uwb.internal.RangingParametersParams;
import com.google.android.gms.nearby.uwb.internal.UwbComplexChannelParams;
import com.google.android.gms.nearby.uwb.internal.UwbDeviceParams;

public final class djez implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        UwbComplexChannelParams uwbComplexChannelParams0 = null;
        UwbDeviceParams[] arr_uwbDeviceParams = null;
        byte[] arr_b1 = null;
        UwbDeviceParams uwbDeviceParams0 = null;
        RangeDataNtfConfigParams rangeDataNtfConfigParams0 = null;
        RangeLimitsConfigParams rangeLimitsConfigParams0 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v7 = parcel0.readInt();
            switch(((char)v7)) {
                case 1: {
                    v1 = baua.f(parcel0, v7);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v7);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v7);
                    break;
                }
                case 4: {
                    uwbComplexChannelParams0 = (UwbComplexChannelParams)baua.m(parcel0, v7, UwbComplexChannelParams.CREATOR);
                    break;
                }
                case 5: {
                    v3 = baua.f(parcel0, v7);
                    break;
                }
                case 6: {
                    arr_uwbDeviceParams = (UwbDeviceParams[])baua.J(parcel0, v7, UwbDeviceParams.CREATOR);
                    break;
                }
                case 7: {
                    v4 = baua.f(parcel0, v7);
                    break;
                }
                case 8: {
                    arr_b1 = baua.E(parcel0, v7);
                    break;
                }
                case 9: {
                    uwbDeviceParams0 = (UwbDeviceParams)baua.m(parcel0, v7, UwbDeviceParams.CREATOR);
                    break;
                }
                case 10: {
                    rangeDataNtfConfigParams0 = (RangeDataNtfConfigParams)baua.m(parcel0, v7, RangeDataNtfConfigParams.CREATOR);
                    break;
                }
                case 11: {
                    v5 = baua.f(parcel0, v7);
                    break;
                }
                case 12: {
                    v6 = baua.f(parcel0, v7);
                    break;
                }
                case 13: {
                    z = baua.D(parcel0, v7);
                    break;
                }
                case 14: {
                    rangeLimitsConfigParams0 = (RangeLimitsConfigParams)baua.m(parcel0, v7, RangeLimitsConfigParams.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v7);
                }
            }
        }
        baua.A(parcel0, v);
        return new RangingParametersParams(v1, v2, arr_b, uwbComplexChannelParams0, v3, arr_uwbDeviceParams, v4, arr_b1, uwbDeviceParams0, rangeDataNtfConfigParams0, v5, v6, z, rangeLimitsConfigParams0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RangingParametersParams[v];
    }
}

