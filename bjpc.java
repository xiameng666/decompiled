import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.esim.CarrierInfo;
import com.google.android.gms.esim.ProfileTransferMetaData;

public final class bjpc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        String s8 = null;
        String s9 = null;
        String s10 = null;
        CarrierInfo carrierInfo0 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        int v4 = 0;
        long v5 = 0L;
        long v6 = 0L;
        while(parcel0.dataPosition() < v) {
            int v7 = parcel0.readInt();
            switch(((char)v7)) {
                case 1: {
                    v1 = baua.f(parcel0, v7);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v7);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v7);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v7);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v7);
                    break;
                }
                case 6: {
                    v5 = baua.i(parcel0, v7);
                    break;
                }
                case 7: {
                    s3 = baua.s(parcel0, v7);
                    break;
                }
                case 8: {
                    s4 = baua.s(parcel0, v7);
                    break;
                }
                case 9: {
                    v6 = baua.i(parcel0, v7);
                    break;
                }
                case 10: {
                    s5 = baua.s(parcel0, v7);
                    break;
                }
                case 11: {
                    s6 = baua.s(parcel0, v7);
                    break;
                }
                case 12: {
                    v3 = baua.f(parcel0, v7);
                    break;
                }
                case 13: {
                    s7 = baua.s(parcel0, v7);
                    break;
                }
                case 14: {
                    z = baua.D(parcel0, v7);
                    break;
                }
                case 15: {
                    s8 = baua.s(parcel0, v7);
                    break;
                }
                case 16: {
                    s9 = baua.s(parcel0, v7);
                    break;
                }
                case 17: {
                    s10 = baua.s(parcel0, v7);
                    break;
                }
                case 18: {
                    v4 = baua.f(parcel0, v7);
                    break;
                }
                case 19: {
                    carrierInfo0 = (CarrierInfo)baua.m(parcel0, v7, CarrierInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v7);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProfileTransferMetaData(v1, s, v2, s1, s2, v5, s3, s4, v6, s5, s6, v3, s7, z, s8, s9, s10, v4, carrierInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProfileTransferMetaData[v];
    }
}

